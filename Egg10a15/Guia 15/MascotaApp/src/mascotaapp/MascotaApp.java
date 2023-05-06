
package mascotaapp;

import java.util.logging.Level;
import java.util.logging.Logger;
import mascotaapp.dominio.usuario.UsuarioService;


public class MascotaApp {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        
        
        try{
                    usuarioService.crearUsuario("angieeerivero@hotmail.com", "548123123");

        }catch(Exception ex){
            Logger.getLogger(MascotaApp.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        
        
    }
    
}
