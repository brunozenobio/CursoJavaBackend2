
package mascotaapp.dominio.usuario;

import java.util.Scanner;
import java.util.UUID;
import mascotaapp.persistencia.UsuarioDAO;



public class UsuarioService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void crearUsuario() throws Exception{
        Usuario user = new Usuario();
        user.setId(UUID.randomUUID().toString());
        System.out.println("Ingrese los datos del usuario");
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.print("Correo electronico: ");
        String correoElectronico = read.next();
        System.out.print("Contraseña: ");
        String clave = read.next();
        
        
        try {
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Debe indicar un nombre");
            }
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            if (correoElectronico.contains("@") == false) {
                throw new Exception("El correo electrónico es incorrecto");
            }
            if (clave == null || clave.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave");
            }
            if (clave.length() < 8) {
                throw new Exception("La clave no puede tener menos de 8 caracteres");
            }
        } catch (Exception e) {
            throw e;
        }
        
        user.setNombre(nombre);
        user.setCorreoElectronico(correoElectronico);
        user.setPassword(clave);
        
        
        UsuarioDAO.saveUser(user);  
    }
    
    public Usuario consultarUsuariPorCorreoElectronico(String correoElectronico){
        Usuario user = UsuarioDAO.consulEmail(correoElectronico);
        System.out.println("Usuario:");
        System.out.print("Nombre: " + user.getNombre());
        System.out.println("");
        System.out.print("Correo: " + user.getCorreoElectronico());
        System.out.println("");
        System.out.print("Coontraseña: " + user.getPassword());
        System.out.println("");
        return user;
        
    }
    
    
    
}
