/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.persistencia;

import java.util.ArrayList;
import java.util.Collection;

import mascotaapp.dominio.usuario.Usuario;

/**
 *
 * @author brunopc
 */
public final class UsuarioDAO extends DAO{
    
    public void guardarUsuario(Usuario usuario) throws Exception{
        try{
            if(usuario == null){
                throw new Exception("Debe indicar un usuario.");
            }
            String sql = "INSERT INTO Usuario (correoElectronico,clave)" 
                    + "VALUES ('" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "');";
            /*comillas dobles hace referencia al string de java Y COMILLAS SIMPLES AL VARCHAR SQL*/
            insertarModificarEliminar(sql);
            
            
        }catch(Exception e){
            throw e;
        }
        
    }
    
    
    public void modificarUsuario(Usuario usuario) throws Exception{
        try{
            if(usuario == null){
                throw new Exception("Debe indicar un usuario.");
            }
            String sql = "UPDATE Usuario SET " + 
                       "clave = '" + usuario.getClave() + "'WHERE correoElectrinico = '" + usuario.getCorreoElectronico();
            insertarModificarEliminar(sql);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void eliminarUsuario(Usuario usuario) throws Exception{
        try{
            if(usuario == null){
                throw new Exception("Debe indicar un usuario.");
            }
            String sql = "DELETE FROM Usuario SET  WHERE correoElectronico = '" + usuario.getCorreoElectronico() + "'";
            insertarModificarEliminar(sql);
        }catch(Exception e){
            throw e;
        }
    }
    
    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception{
        
        try{
            String sql = "SELECT * FROM Usuario" + " WHERE correoElectronico = '" + correoElectronico + "'";
            
            /*TODAS LAS COLUMNAS DE LA TABLA USUARIO; Y ME SELECCIONE LA FILA QUE COINDICE CON EEL CORREO*/
            
            consultarBase(sql);
            
            Usuario usuario = null;
            
            while(resultado.next()){/*SI EN RESuLTADO HAY ALGUN VALOR (RESULTADO ES DEVUELTO POR EL METOD CONSULTADO)*/
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));/*getIint() DE RESULTADO DA LA COLUMnA DEL INDICE DADO
                SI NO CONOZCO EL INDICE PUEDO PONER ENTRE COMILLAS EL NOMBRE DE ESTA*/
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
                
            }
            desconectarBase();
            return usuario;
            
        }catch(Exception e){
            desconectarBase();
            throw e;
        }
        
        
    }
    
    public Collection<Usuario> listaDeUsuarios() throws Exception{
        try{
          String sql = "SELECT correoElectronico,clave FROM Usuario";
          consultarBase(sql);
          Usuario usuario = null;
          Collection<Usuario> listaUsers = new ArrayList();
          while(resultado.next()){
              usuario = new Usuario();
              usuario.setCorreoElectronico(resultado.getString(1));
              usuario.setClave(resultado.getString(2));
              listaUsers.add(usuario);
          }
          desconectarBase();
          return listaUsers;
        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema.");
        }
    } 
    
}
