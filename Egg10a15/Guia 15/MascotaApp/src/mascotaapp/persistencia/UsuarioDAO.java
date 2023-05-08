/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mascotaapp.dominio.usuario.Usuario;

/**
 *
 * @author brunopc
 */
public class UsuarioDAO {

    public static void saveUser(Usuario user) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotaApp");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }

    }

    public static Usuario consulEmail(String correo) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotaApp");
            EntityManager em = emf.createEntityManager();
            Usuario user = (Usuario) em.createQuery("SELECT u FROM  Usuario u WHERE "
                    + "u.correoElectronico=:correoElectronico").setParameter("correoElectronico", correo).getSingleResult();
            return user;
        } catch (Exception e) {
            throw e;
        }
        

    }

}
