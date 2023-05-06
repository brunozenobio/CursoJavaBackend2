/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.dominio.usuario;

import java.util.ArrayList;
import mascotaapp.persistencia.UsuarioDAO;


public class UsuarioService {
    
    private UsuarioDAO dao;
    
    public UsuarioService(){
        this.dao = new UsuarioDAO();
    }
    
    public void crearUsuario(String correoElectronico,String clave) throws Exception{
        try{
            /*PRIMERO VALIDO*/
            if(correoElectronico == null || correoElectronico.trim().isEmpty()){
                throw new Exception("Debe indicar un correo electronico");
                
            }
            if(correoElectronico.contains("@") == false){
                throw new Exception("El correo electronico es incorrecto");
                
            }
            
            if(clave == null || clave.trim().isEmpty()){
                throw new Exception("Debe indicar la clave");
            }
            if(clave.length() < 8 ){
                throw new Exception ("La clave no puede ser menor a 8 digios");
            }
            
            if(dao.buscarUsuarioPorCorreoElectronico(correoElectronico) !=null){/*NO SE REPITE*/
                throw new Exception("Ya existe un usuario con ese correo electronico");
                
            }
            
            /*SI EL USUARIO CUMPLE CON LA VALIDACION LO CREAMOS*/
            
            Usuario usuario = new Usuario();
            usuario.setCorreoElectronico(correoElectronico);
            usuario.setClave(clave);
            dao.guardarUsuario(usuario);
            
            
        }catch(Exception e){
            throw e;
        }
    }
    
    public void crearListaUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList();
        
    }
    
    
}
