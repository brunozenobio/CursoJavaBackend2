/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;

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
    public Editorial buscarPorId(Integer id) throws Exception{
        try {
            
            Editorial editorial = em.find(Editorial.class, id);
            if(!editorial.getAlta()){
                throw new Exception("La editorial esta dada de baja");
            }
            return editorial;
            
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
