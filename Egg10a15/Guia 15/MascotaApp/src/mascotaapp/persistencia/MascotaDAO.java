/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mascotaapp.dominio.mascota.Mascota;
import mascotaapp.dominio.usuario.Usuario;
import mascotaapp.dominio.usuario.UsuarioService;

/**
 *
 * @author brunopc
 */
public class MascotaDAO {
     public static void saveMascota(Mascota mascota) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotaApp");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(mascota);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }

    }

    public static List<Mascota> consulMascotasPorUsuario(String correo) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotaApp");
            EntityManager em = emf.createEntityManager();
            List<Mascota> mascotas =  em.createQuery("SELECT m FROM Mascota m"
                    + " WHERE m.user.correoElectronico = :correoElectronico").setParameter("correoElectronico", correo).getResultList();
         
            return mascotas;
        } catch (Exception e) {
            throw e;
        }
        

    }
    
}
