/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.services;

import java.util.List;
import libreria.entities.Autor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author brunopc
 */
public class AutorServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSIS");
    EntityManager em = emf.createEntityManager();

    public void creaAutor(Autor autor) throws Exception {
        try {
            if (autor == null) {
                throw new Exception("Debe indicar un autor");
            }
            
            if (autor.getNombre() == null || autor.getNombre().isEmpty()) {
                throw new Exception("Nombre del autor incorrecto");
            }
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public Autor buscarPorId(Integer id) throws Exception {
        try {

            Autor editorial = em.find(Autor.class, id);
            if (!editorial.getAlta()) {
                throw new Exception("El autor esta dada de baja");
            }
            return editorial;

        } catch (Exception e) {
            throw e;
        }
    }

    public void darDeAlta(Autor autor) {
        try {

            autor.setAlta(true);
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }
    public void darDeBaja(Autor autor) {
        try {

            autor.setAlta(false);
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }
    public List<Autor> buscarPorNombre(String nombre) {
        try {
            List<Autor> autores = em.createQuery("Select a from Autor a where a.nombre=:nombre").setParameter("nombre", nombre).getResultList();
            return autores;
        } catch (Exception e) {
            throw e;
        }
    }

}
