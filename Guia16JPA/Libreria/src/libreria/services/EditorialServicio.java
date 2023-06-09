/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.services;

import libreria.entities.Editorial;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static libreria.entities.Libro_.editorial;

/**
 *
 * @author brunopc
 */
public class EditorialServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSIS");
    EntityManager em = emf.createEntityManager();

    public void crearEditorial(Editorial editorial) throws Exception {
        try {
            if (editorial == null) {
                throw new Exception("Debe indicar una editorial");
            }
            if (editorial.getNombre() == null || editorial.getNombre().isEmpty()) {
                throw new Exception("Nombre de la editorial incorrecto");
            }
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public Editorial buscarPorId(Integer id) throws Exception {
        try {

            Editorial editorial = em.find(Editorial.class, id);
            if (editorial != null) {
                if (!editorial.getAlta()) {
                    throw new Exception("La editorial esta dada de baja");
                }
            } else {
                throw new Exception("La editorial no existe");
            }

            return editorial;

        } catch (Exception e) {
            throw e;
        }
    }

    public void darDeAlta(Editorial editorial) {
        try {

            editorial.setAlta(true);
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public void darDeBaja(Editorial editorial) {
        try {

            editorial.setAlta(false);
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }
}
