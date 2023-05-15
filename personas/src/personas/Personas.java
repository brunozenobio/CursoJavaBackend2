/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import org.eclipse.persistence.internal.jpa.EntityManagerFactoryDelegate;

/**
 *
 * @author brunopc
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("personasPU");
        EntityManager em = emf.createEntityManager();
        
        Persona personaa = new Persona();
        personaa.setId(10);
        personaa.setNombre("Ezequiel");
        personaa.setNumeroTel(6565454);
        em.getTransaction().begin();
        em.persist(personaa);
        em.getTransaction().commit();
        try {
            Persona persona = (Persona) em.createQuery("SELECT p FROM Persona p WHERE p.id=:id")
                    .setParameter("id", 2)
                    .getSingleResult();

            System.out.println(persona.getNombre() + " " + persona.getNumeroTel());
        } catch (NoResultException e) {
            System.out.println("No se encontró ninguna persona con el ID especificado.");
        } finally {
            em.close();
            emf.close();
        }
    }

}
