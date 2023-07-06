/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

/**
 *
 * @author brunopc
 */
public class AutorServicio {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSIS");
    EntityManager em = emf.createEntityManager();
    
    public void creaAutor(Autor autor) throws Exception{
        try {
            if(autor==null){
                throw new Exception("Debe indicar un autor");
            }
            if(autor.getNombre()==null || autor.getNombre().isEmpty()){
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
    public Autor buscarPorId(Integer id) throws Exception{
        try {
            
            Autor editorial = em.find(Autor.class, id);
            if(!editorial.getAlta()){
                throw new Exception("El autor esta dada de baja");
            }
            return editorial;
            
            
        } catch (Exception e) {
            throw e;
        }
    }    
        
    
}
