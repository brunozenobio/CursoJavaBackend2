/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entities.Cliente;

/**
 *
 * @author bruno
 */
public class ClienteServicio {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSIS");
    EntityManager em = emf.createEntityManager();
    
    public void crearCliente(Cliente cliente) throws Exception{
        try {
            if(cliente==null){
                throw new Exception("Cliente invalido");
            }
            
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            
            
            
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
