/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDaoExt;
import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public class FabricanteServicio {
    FabricanteDaoExt fdao = new FabricanteDaoExt();
    
    public void crearFabricante(int codigo,String nombre){
         try {
             if(codigo<0){
                 throw new Exception("Debe indicar un codigo valido");
             }
             if(nombre == null || nombre.trim().isEmpty()){
                 throw  new Exception("El nombre del fabricante es invalido");
             }
             if(fdao.consultarFabricante(codigo)!=null){
                 throw new Exception("No puede agregar un fabricante con ese codigo porque ya existe");
             }
             Fabricante fabricante = new Fabricante(codigo, nombre);
             fdao.guardarFabricante(fabricante);
            
        } catch (Exception e) {
        }
    }
    
    
    public void mostrarFabricante(int codigo) throws Exception{
        FabricanteDaoExt fbs = new FabricanteDaoExt();
        Fabricante fb =fbs.consultarFabricante(codigo);
        
            System.out.println("Id producto: " + fb.getCodigo());
            System.out.println("Nombre: " + fb.getNombre());
            
    }
    public void modificarFabricante(int codigo,String nombre){
        try {
             if(codigo<0){
                 throw new Exception("Debe indicar un codigo valido");
             }
             if(fdao.consultarFabricante(codigo)==null){
                 throw new Exception("No puede modificar un fabricante con ese codigo porque no existe");
             }
             
             Fabricante fabricante =fdao.consultarFabricante(codigo);
             fabricante.setNombre(nombre);
             fdao.guardarFabricante(fabricante);
            
        } catch (Exception e) {
        }
        
        
    }
    
}
