/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Estancia;

/**
 *
 * @author brunopc
 */
public final class EstanciaDaoExt extends DAO{
    public void insertarEstancia(Estancia estancia) throws Exception{
        try {
            if(estancia ==null){
                throw new Exception("Debe ingresar una estancia");
            }
            String sql = "INSERT INTO estancias (id_estancia,id_cliente,id_casa,nombre_huesped,fecha_desde,fecha_hasta)"
                    + " VALUES (" + estancia.getId_estancia() + "," + estancia.getId_cliente() +"," + 
                    estancia.getId_casa() + ",'" + estancia.getNombre_huesped() + "'," + estancia.getFecha_desde() + "," + estancia.getFecha_hasta() +")";
            insertarEstancia(estancia);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    
}
