/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public final class FabricanteDaoExt extends  DAO{
    
    public void guardarFabricante(Fabricante fabricante) throws Exception{
        try{
            if(fabricante == null){
                throw new Exception("Debe indicar un fabricante.");
            }
            if(consultarFabricante(fabricante.getCodigo())!=null){
                 throw new Exception("No puede agregar un fabricante con ese codigo porque ya existe");
             }
            String sql = "INSERT INTO fabricante (codigo,nombre)" 
                    + "VALUES (" + fabricante.getCodigo()+ " , '" + fabricante.getNombre()+ "');";
            /*comillas dobles hace referencia al string de java Y COMILLAS SIMPLES AL VARCHAR SQL*/
            instaModificarEliminar(sql);
            
            
        }catch(Exception e){
            throw e;
        }
        
    }
    
     public void modficicarFabricante(Fabricante fabricante) throws Exception{
        try{
            if(fabricante == null){
                throw new Exception("Debe indicar un fabricante.");
            }
            if(consultarFabricante(fabricante.getCodigo())==null){
                 throw new Exception("No puede modificar un fabricante con ese codigo porque no existe");
             }
            String sql = "UPDATE fabricante set " 
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = " + fabricante.getCodigo();
            /*comillas dobles hace referencia al string de java Y COMILLAS SIMPLES AL VARCHAR SQL*/
            instaModificarEliminar(sql);
            
            
        }catch(Exception e){
            throw e;
        }
        
    }
    
     public void eliminarFabricante(Fabricante fabricante) throws Exception{
        try{
            if(fabricante == null){
                throw new Exception("Debe indicar un fabricante.");
            }
            String sql = "DELETE FROM fabricante set where codigo = " + fabricante.getCodigo();
            /*comillas dobles hace referencia al string de java Y COMILLAS SIMPLES AL VARCHAR SQL*/
            instaModificarEliminar(sql);
            
            
        }catch(Exception e){
            throw e;
        }
        
    }
    
    
    
    
    
    public Fabricante consultarFabricante(int codigo) throws Exception{
        Fabricante fab = null;
        try {
            
            String sql = "SELECT codigo,nombre FROM fabricante WHERE codigo = " + codigo  ;
            consultarBase(sql);
            
           
                if(resultado.next()){
                    fab = new Fabricante();
                    fab.setCodigo(resultado.getInt(1));
                     fab.setNombre(resultado.getString(2));
                }
                
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
        return fab;
    }
    
    
}
