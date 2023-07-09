/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.services;

import java.util.List;
import libreria.entities.Libro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author brunopc
 */
public class LibroServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSIS");
    EntityManager em = emf.createEntityManager();
    private AutorServicio as = new AutorServicio();
    private EditorialServicio es = new EditorialServicio();

    public AutorServicio getAs() {
        return as;
    }

    public void setAs(AutorServicio as) {
        this.as = as;
    }

    public EditorialServicio getEs() {
        return es;
    }

    public void setEs(EditorialServicio es) {
        this.es = es;
    }

    public void darDeAlta(Libro libro) {
        try {

            libro.setAlta(true);
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public void darDeBaja(Libro libro) {
        try {

            libro.setAlta(false);
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public void crearLibro(Libro libro) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("Libro incorrecto");
            }
            if (libro.getTitulo() == null || libro.getTitulo().isEmpty()) {
                throw new Exception("Debe ingresar un titulo");
            }
            if (libro.getAnio() == null || libro.getAnio() < 0) {
                throw new Exception("Debe ingresar un año correcto");
            }
            if (libro.getEjemplares() == null || libro.getEjemplares() < 0) {
                throw new Exception("La cantidad de ejemplares es incorrecta");
            }
            if (libro.getEjemplares() == null || libro.getEjemplares() < 0 || libro.getEjemplares() - libro.getEjemplaresRestantes() != libro.getEjemplaresPrestados()) {
                throw new Exception("La cantidad de ejemplares prestados es incorrecta");
            }
            if (libro.getEjemplares() == null || libro.getEjemplares() < 0 || libro.getEjemplares() - libro.getEjemplaresRestantes() != libro.getEjemplaresPrestados()) {
                throw new Exception("La cantidad de ejemplares restantes es incorrecta");
            }
            if (libro.getAutor() == null) {
                throw new Exception("Autor invalido");
            }
            if (libro.getEditorial() == null) {
                throw new Exception("Editorial invalida");
            }
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public Libro buscarPorISBN(Long id) throws Exception {
        try {

            Libro editorial = em.find(Libro.class, id);
            if (!editorial.getAlta()) {
                throw new Exception("El libro esta dado de baja");
            }
            return editorial;

        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Libro> buscarPorTitulo(String titulo){
        try {
            List<Libro> libros = em.createQuery("select li from Libro li where li.titulo=:titutlo").setParameter("titulo", titulo).getResultList();
            return libros;
        } catch (Exception e) {
            throw e;
        }
            
    }
    
    public List<Libro> buscarPorAutor(String nombre){
        try {
            List<Libro> libros = em.createQuery("Select li from Libro li join li.autor a where a.nombre=:nombre ").setParameter("nombre", nombre).getResultList();
            return libros;
            
        } catch (Exception e) {
            throw e;
        }
    }
    public List<Libro> buscarPorEditorial(String nombre){
        try {
            List<Libro> libros = em.createQuery("Select li from Libro li join li.editorial a where a.nombre=:nombre ").setParameter("nombre", nombre).getResultList();
            return libros;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    

}
