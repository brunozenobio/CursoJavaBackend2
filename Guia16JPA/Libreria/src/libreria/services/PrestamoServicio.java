/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.services;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entities.Cliente;
import libreria.entities.Libro;
import libreria.entities.Prestamo;

/**
 *
 * @author bruno
 */
public class PrestamoServicio {

    private LibroServicio ls = new LibroServicio();
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSIS");
    EntityManager em = emf.createEntityManager();

    public void registrarPrestamo(Libro libro, Cliente cliente, Date fechaPrestamo) throws Exception {
        try {
            Date fechaActual = new Date();
            if (libro == null) {
                throw new Exception("Libro invalodo");
            }
            if (cliente == null) {
                throw new Exception("Cliente invalido");
            }
            if (fechaPrestamo == null || fechaActual.getYear() - fechaPrestamo.getYear() > 1) {
                throw new Exception("Fecha invalida");
            }
            Prestamo prestamo = new Prestamo(fechaPrestamo, null, libro, cliente);
            Libro libro1 = ls.buscarPorISBN(libro.getId());
            libro1.setEjemplaresPrestados(libro1.getEjemplaresPrestados() + 1);
            libro1.setEjemplaresRestantes(libro1.getEjemplaresRestantes() - 1);
            em.getTransaction().begin();
            em.persist(prestamo);
            em.merge(libro1);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }

    }

    public Prestamo buscarPrestamo(Cliente cliente, Libro libro) {
        try {

            Prestamo prestamo = (Prestamo) em.createQuery("select p from Prestamo p where p.cliente.documento=:doc and p.libro.id=:isb").setParameter("doc",
                    cliente.getDocumento()).setParameter("isb", libro.getId()).getSingleResult();
            return prestamo;
        } catch (Exception e) {
            throw e;
        }
    }

    public void devolucion(Libro libro, Cliente cliente, Date fachaDevolucion) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("Libro invalido");
            }
            if (cliente == null) {
                throw new Exception("Cliente invalido");
            }

            Prestamo prestamo = buscarPrestamo(cliente, libro);
            prestamo.setFechaDevolucion(fachaDevolucion);
            Libro librod = ls.buscarPorISBN(libro.getId());
            librod.setEjemplaresPrestados(librod.getEjemplaresPrestados() - 1);
            librod.setEjemplaresRestantes(librod.getEjemplaresRestantes() + 1);

            em.getTransaction().begin();
            em.merge(librod);
            em.merge(prestamo);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

}
