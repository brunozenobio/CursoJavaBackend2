/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import tienda.entidades.Producto;

/**
 *
 * @author brunopc
 */
public final class ProductoDaoExt extends DAO{
    
    
     public void guardarProducto(Producto producto) throws Exception{
        try{
            if(producto == null){
                throw new Exception("Debe indicar un producto.");
            }
            if(buscarPorId(producto.getCodigo())!=null){
                 throw new Exception("No puede agregar un producto con ese codigo porque ya existe");
             }
            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante)" 
                    + "VALUES (" + producto.getCodigo()+ " , '" + producto.getNombre() + "', " + producto.getPrecio()+ "," + producto.getCodigoFabricante()+ ");";
            /*comillas dobles hace referencia al string de java Y COMILLAS SIMPLES AL VARCHAR SQL*/
            instaModificarEliminar(sql);
            
            
        }catch(Exception e){
            throw e;
        }
        
    }
     public Producto buscarPorId(int codigo) throws Exception{
          Producto nuevoProducto = null;
         try {
            
             String sql = "SELECT nombre,precio from producto WHERE "
                     + " codigo = " + codigo;
             consultarBase(sql);
             if(resultado.next()){
                 nuevoProducto = new Producto();
                 nuevoProducto.setNombre(resultado.getString("nombre"));
                 nuevoProducto.setPrecio(resultado.getDouble("precio"));           
             }
             
         } catch (Exception e) {
             System.out.println("Busqueda por id error");
             e.getMessage();
             throw e;
             
         }
         return nuevoProducto;
         
     }
     
     public Collection<Producto> listarProductos() throws Exception{
         Collection<Producto> listaProductos = null;
         try {
             listaProductos = new ArrayList();
             String sql = "SELECT nombre from producto";
             consultarBase(sql);
             while(resultado.next()){
                 Producto nuevoProducto = new Producto();
                 nuevoProducto.setNombre(resultado.getString("nombre"));
                 listaProductos.add(nuevoProducto);
                 
             }
             
         } catch (Exception e) {
             System.out.println("listarProductos error");
             e.getMessage();
             throw e;
             
         }
         return listaProductos;
     }
     
     public Collection<Producto> listarProductosConPrecio() throws Exception{
         Collection<Producto> listaProductos = null;
         try {
             String sql = "SELECT nombre,precio from producto";
             consultarBase(sql);
             listaProductos = new ArrayList();
             while(resultado.next()){
                 Producto nuevoProducto = new Producto();
                 nuevoProducto.setNombre(resultado.getString("nombre"));
                 nuevoProducto.setPrecio(resultado.getDouble("precio"));
                 listaProductos.add(nuevoProducto);
                 
             }
             
         } catch (Exception e) {
             System.out.println("listarProductos error");
             e.getMessage();
             throw e;
             
         }
         return listaProductos;
     }
     
     public Collection<Producto> listarProductos120202() throws Exception{
         Collection<Producto> listaProductos = null;
         try {
             listaProductos = new ArrayList();
             String sql = "SELECT nombre,precio from producto WHERE"
                     + " precio between   120  AND  202";
             consultarBase(sql);
             while(resultado.next()){
                 Producto nuevoProducto = new Producto();
                 nuevoProducto.setNombre(resultado.getString("nombre"));
                 nuevoProducto.setPrecio(resultado.getDouble("precio"));
                 listaProductos.add(nuevoProducto);
                 
             }
             
         } catch (Exception e) {
             System.out.println("listarProductos error");
             e.getMessage();
             throw e;
             
         }
         return listaProductos;
     }
     
     public Collection<Producto> listarPortatiles() throws Exception{
         Collection<Producto> listaProductos = null;
         try {
             listaProductos = new ArrayList();
             String sql = "SELECT codigo,nombre,precio,codigo_fabricante from producto WHERE "
                     + " nombre LIKE 'Portátil%'";
             consultarBase(sql);
             while(resultado.next()){
                 Producto nuevoProducto = new Producto();
                 nuevoProducto.setCodigo(resultado.getInt("codigo"));
                 nuevoProducto.setNombre(resultado.getString("nombre"));
                 nuevoProducto.setPrecio(resultado.getDouble("precio"));
                  nuevoProducto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                 listaProductos.add(nuevoProducto);
                 
             }
             
         } catch (Exception e) {
             System.out.println("listarProductos error");
             e.getMessage();
             throw e;
             
         }
         return listaProductos;
     }
      
     public Producto productoMasBarato() throws Exception{
         Producto nuevoProducto = null;
         try {
            
             String sql = "SELECT codigo,nombre,precio,codigo_fabricante from producto ORDER BY "
                     + " precio LIMIT 1";
             consultarBase(sql);
             if(resultado.next()){
                 nuevoProducto = new Producto();
                 nuevoProducto.setCodigo(resultado.getInt("codigo"));
                 nuevoProducto.setNombre(resultado.getString("nombre"));
                 nuevoProducto.setPrecio(resultado.getDouble("precio"));    
                 nuevoProducto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
             }
             
         } catch (Exception e) {
             System.out.println("listarProductos error");
             e.getMessage();
             throw e;
             
         }
         return nuevoProducto;
         
         
     } 
     
     public void modificarProducto(Producto producto) throws Exception{
         
         try {
             if(producto == null){
                 throw  new Exception("Debe ingresar un producto a modificar");
             }
             if(buscarPorId(producto.getCodigo())==null){
                 throw new Exception("No puede modificar un producto con ese codigo porque no existe");
             }
             String sql = "UPDATE fabricante set " 
                    + "nombre = '" + producto.getNombre() + "',precio= '" + producto.getPrecio() + "' WHERE codigo = " + producto.getCodigo();
             instaModificarEliminar(sql);
         } catch (Exception e) {
             System.out.println("Error al modificar el producto");
             e.getMessage();
             throw e;
         }
         
     }
     
    
}
