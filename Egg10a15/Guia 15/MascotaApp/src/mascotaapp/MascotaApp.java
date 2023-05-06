package mascotaapp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mascotaapp.dominio.usuario.Usuario;
import mascotaapp.dominio.usuario.UsuarioService;

public class MascotaApp {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        UsuarioService usuarioService = new UsuarioService();
        String correo = "";
        String clave = "";
        String opcion = "";

        do {
            System.out.println("Creando usuarios");
            System.out.print("Correo electronico: ");
            correo = read.next();
            System.out.print("Contraseña: ");
            clave = read.next();
            System.out.print("Desea agregar otro usuario? (s/n)");
            opcion = read.next();
            try {
                usuarioService.crearUsuario(correo, clave);

            } catch (Exception ex) {
                Logger.getLogger(MascotaApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } while (opcion.equalsIgnoreCase("s"));

    }

}
