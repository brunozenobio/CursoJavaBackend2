/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author brunopc
 */
public final class CasaDaoExt extends DAO{
    public Collection<Casa> casasDisponibles1_31() throws Exception{
        try {
            Collection<Casa> casasDisp = new ArrayList();
            Casa casa = null;
            String sql = "SELECT * FROM casas WHERE fecha_desde >= '2020-08-01' AND fecha_hasta <= '2020-08-31' AND pais = 'Reino Unido'" ;
            consultarBase(sql);
            while(resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                casasDisp.add(casa);
                
                
            }
            return casasDisp;
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    public Collection<Casa> casasFecha(String fecha,int dias) throws Exception{
        try {
            Collection<Casa> casasDisp = new ArrayList();
            Casa casa = null;
            String sql = "SELECT * FROM casas WHERE '" + fecha + "' between fecha_desde AND fecha_hasta AND DATE_ADD(fecha_desde, INTERVAL " + dias + " DAY)<fecha_hasta";
            consultarBase(sql);
            while(resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                casasDisp.add(casa);
                
                
            }
            return casasDisp;
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    public Collection<Casa> clienCasas() throws Exception{
        try {
            Collection<Casa> casasDisp = new ArrayList();
            Collection<Cliente> clientes = new ArrayList();
            Casa casa = null;
            Cliente cliente = null;
            
            String sql = "SELECT ca.* FROM clientes c inner join estancias e on c.id_cliente = e.id_cliente inner join "
                    + " casas ca on e.id_casa = ca.id_casa";
            consultarBase(sql);
            while(resultado.next()){
                casa = new Casa();
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                casasDisp.add(casa);
                clientes.add(cliente);
                
            }
            return casasDisp;
        } catch (Exception e) {
            throw e;
        }
    }
    public void ModificarPrecio() throws Exception{
        try {
            Collection<Casa> casasDisp = new ArrayList();
            Casa casa = null;
            String sql = "UPDATE casas SET precio_habitacion = precio_habitacion * 1.5 WHERE pais = 'Reino unido'" ;
            instaModificarEliminar(sql);
            System.out.println("Se han modificado los precio de las habitaciones de reino unido");
            precioActualizado();
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    public Collection<Casa> precioActualizado() throws Exception{
        try {
            Collection<Casa> casasDisp = new ArrayList();
            Casa casa = null;
            String sql = "SELECT * FROM casas WHERE pais = 'Reino unido'";
            consultarBase(sql);
            while(resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setCodigo_postal(resultado.getString(3));
                casa.setCiudad(resultado.getString(4));
                casa.setFecha_desde(resultado.getDate(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_hasta(resultado.getDate(7));
                casa.setTiempo_minimo(resultado.getInt(8));
                casa.setTiempo_maximo(resultado.getInt(9));
                casa.setPrecio_habitacion(resultado.getDouble(10));
                casa.setTipo_vivienda(resultado.getString(11));
                casasDisp.add(casa);
                
                
            }
            return casasDisp;
        } catch (Exception e) {
            throw e;
        }
    }
    public Collection<Collection<String>> numeroDeCasasPorPais() throws Exception{
        try {
            
            Collection<Collection<String>> casas  = new ArrayList();
            
            String sql = "SELECT pais,count(*) FROM casas GROUP BY pais";
            consultarBase(sql);
            while(resultado.next()){

                Collection<String> casaDisp = new ArrayList();
                
                casaDisp.add(resultado.getString(1));
                casaDisp.add(Integer.toString(resultado.getInt(2)));
                casas.add(casaDisp);
                
                
            }
            return casas;
        } catch (Exception e) {
            throw e;
        }
    }
    public Collection<Casa> casasLimpias() throws Exception{
        try {
            Collection<Casa> casasDisp = new ArrayList();
            Casa casa = null;
            String sql = "SELECT casa.* FROM casas "
                    + "inner join comentarios on casas.id_casa = comentarios.id_casa "
                    + "WHERE pais = 'Reino unido' AND comentario LIKE '%Limpia%' ";
            consultarBase(sql);
            while(resultado.next()){
                casa = new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setCodigo_postal(resultado.getString(3));
                casa.setCiudad(resultado.getString(4));
                casa.setFecha_desde(resultado.getDate(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_hasta(resultado.getDate(7));
                casa.setTiempo_minimo(resultado.getInt(8));
                casa.setTiempo_maximo(resultado.getInt(9));
                casa.setPrecio_habitacion(resultado.getDouble(10));
                casa.setTipo_vivienda(resultado.getString(11));
                casasDisp.add(casa);
                
                
            }
            return casasDisp;
        } catch (Exception e) {
            throw e;
        }
    }
    
     
    
}


