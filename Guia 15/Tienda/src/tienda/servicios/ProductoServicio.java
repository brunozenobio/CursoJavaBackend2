/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Producto;
import tienda.persistencia.ProductoDaoExt;



/**
 *
 * @author brunopc
 */
public class ProductoServicio {
    ProductoDaoExt pdao = new ProductoDaoExt();
    public void crearProducto(int codigo,String nombre,double precio,int codigoFabricante){
         try {
             if(codigo<0){
                 throw new Exception("Debe indicar un codigo valido");
             }
             if(nombre == null || nombre.trim().isEmpty()){
                 throw  new Exception("El nombre del producto es invalido");
             }
             if(precio <0){
                 throw  new Exception("El precio es invalido");
             }
             if(codigoFabricante<0){
                 throw new Exception("Debe indicar un codigo de fabricante valido");
             }
             if(pdao.buscarPorId(codigo) != null){
                 throw  new Exception("No puede agregar un producto con ese codigo porque ya existe");
             }
             Producto producto = new Producto(codigo, nombre,precio,codigoFabricante);
             pdao.guardarProducto(producto);
            
        } catch (Exception e) {
        }
    }
    public void modificarProducto(int codigo,String nombre,double precio){
        try {
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Error al modificar el nombre");
            }
            if(precio<0){
                throw  new Exception("Precio mal ingresado");
            }
            if(codigo<0){
                throw  new Exception("Codigo mal ingresado");
            }
            if(pdao.buscarPorId(codigo) == null){
                throw new Exception("El producto a modificar no existe");
                
            }
            Producto productoModificado = pdao.buscarPorId(codigo);
            productoModificado.setNombre(nombre);
            productoModificado.setPrecio(precio);
            pdao.modificarProducto(productoModificado);
        } catch (Exception e) {
        }
        
    
}
    
    
    
}
