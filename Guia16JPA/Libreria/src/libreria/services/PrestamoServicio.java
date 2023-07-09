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
    
    public void registrarPrestamo(Libro libro,Cliente cliente,Date fechaPrestamo) throws Exception{
        try {
            Date fechaActual = new Date();
            if(libro == null ){
                throw new Exception("Libro invalodo");
            }
            if(cliente == null){
                throw new Exception("Cliente invalido");
            }
            if(fechaPrestamo==null || fechaActual.getYear() - fechaPrestamo.getYear()>1 ){
                throw new Exception("Fecha invalida");
            }
            Prestamo prestamo = new Prestamo(fechaPrestamo,null,libro,cliente);
            Libro libro1 = ls.buscarPorISBN(libro.getId());
            libro1.setEjemplaresPrestados(libro1.getEjemplaresPrestados()+1);
            libro1.setEjemplaresRestantes(libro1.getEjemplaresRestantes()-1);
            em.getTransaction().begin();
            em.persist(prestamo);
            em.merge(libro1);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    public void devolucion(Libro libro,Cliente cliente,Date fachaDevolucion){
        try {
            if(libro == null){
                throw new Exception("Libro invalido");
            }
            if(cliente == null){
                throw new Exception("Cliente invalido");
            }
            
            //METODO PARA BUSCAR PRESTAMO POR DOCUMENTO E ISBN DE LIBRO 
            
            
        } catch (Exception e) {
        }
    }
    
}
