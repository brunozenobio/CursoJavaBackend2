
package mascotaapp;

import mascotaapp.dominio.mascota.MascotaSercice;
import mascotaapp.dominio.usuario.UsuarioService;
import mascotaapp.persistencia.UsuarioDAO;


public class MascotaApp {

  
    public static void main(String[] args) throws Exception {
        
        UsuarioService us = new UsuarioService();
        MascotaSercice ms = new MascotaSercice();
        ms.consultarMascotasPorUsers(UsuarioDAO.consulEmail("brunozenobio4@gmail.com"));
        

    }
    
}
