/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Libro;

/**
 *
 * @author brunopc
 */
public class LibroServicio {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSIS");
    EntityManager em = emf.createEntityManager();
    
    public void crearLibro(Libro libro) throws Exception{
        try {
            if(libro==null){
                throw new Exception("Libro incorrecto");
            }
            if(libro.getTitulo()==null || libro.getTitulo().isEmpty()){
                throw new Exception("Debe ingresar un titulo");
            }
            if(libro.getAnio()==null || libro.getAnio()<0){
                throw new Exception("Debe ingresar un año correcto");
            }
            if(libro.getEjemplares()==null || libro.getEjemplares()<0){
                throw new Exception("La cantidad de ejemplares es incorrecta");
            }
            if(libro.getEjemplares()==null || libro.getEjemplares()<0 || libro.getEjemplares() - libro.getEjemplaresRestantes() == libro.getEjemplaresPrestados()){
                throw new Exception("La cantidad de ejemplares prestados es incorrecta");
            }
            if(libro.getEjemplares()==null || libro.getEjemplares()<0 || libro.getEjemplares() - libro.getEjemplaresRestantes() == libro.getEjemplaresPrestados()){
                throw new Exception("La cantidad de ejemplares restantes es incorrecta");
            }
            if(libro.getAutor()==null){
                throw new Exception("Autor invalido");
            }
            if(libro.getEditorial()==null){
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
    public Libro buscarPorId(Integer id) throws Exception{
        try {
            
            Libro editorial = em.find(Libro.class, id);
            if(!editorial.getAlta()){
                throw new Exception("El libro esta dado de baja");
            }
            return editorial;
            
            
        } catch (Exception e) {
            throw e;
        }
    }   
    public void darDeBajaOAlta(Libro libro){
        try {
            if(libro.getAlta()){
                libro.setAlta(false);
                em.getTransaction().begin();
                em.merge(libro);
                em.getTransaction().commit();
            }else{
                libro.setAlta(true);
                em.getTransaction().begin();
                em.merge(libro);
                em.getTransaction().commit();
            }
            
            
        } catch (Exception e) {
            throw e;
        }
    }
        
    
}
