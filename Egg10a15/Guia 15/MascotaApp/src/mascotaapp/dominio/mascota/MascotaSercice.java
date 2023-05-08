
package mascotaapp.dominio.mascota;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import mascotaapp.dominio.usuario.Usuario;
import mascotaapp.persistencia.MascotaDAO;
import mascotaapp.persistencia.UsuarioDAO;

public class MascotaSercice {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void crearMascota() throws Exception{
        Mascota mascota = new Mascota();
        mascota.setId(UUID.randomUUID().toString());
        System.out.println("Ingrese los datos de la mascota");
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.print("raza: ");
        String raza = read.next();
        System.out.print("Correo electronico dueño: ");
        String correoElectronico = read.next();
        Usuario user = UsuarioDAO.consulEmail(correoElectronico);
        
        
        try {
            if((nombre == null || nombre.trim().isEmpty()) && (raza == null || raza.trim().isEmpty())){
                throw new Exception("Debe indicar nombre y raza de mascota");
            }
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Debe indicar un nombre");
            }
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            if (correoElectronico.contains("@") == false) {
                throw new Exception("No existe un usuario con ese correo electronico");
            }
            
        } catch (Exception e) {
            throw e;
        }
        
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setUser(user);
        
        MascotaDAO.saveMascota(mascota);  
    }
    
    public void consultarMascotasPorUsers(Usuario user){
        String correo = user.getCorreoElectronico();   
        List<Mascota> mascotas = MascotaDAO.consulMascotasPorUsuario(correo);
        

        System.out.print("Mascotas para " + user.getNombre());
        System.out.println("");
        for(Mascota mas:mascotas){
            System.out.print("Nombre: " + mas.getNombre() +  " ");     
            System.out.print("Raza: " + mas.getRaza());
            System.out.println("");
        }
        System.out.println("");
        
    }
}
