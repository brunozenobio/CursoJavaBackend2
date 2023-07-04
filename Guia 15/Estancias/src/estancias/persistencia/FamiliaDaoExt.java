/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Casa;
import estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author brunopc
 */
public final class FamiliaDaoExt extends DAO{
    
    
    public Collection<Familia> consultarFamilia3Y10() throws Exception{
        try {
            Collection<Familia> familias = new ArrayList();
            String sql = "SELECT * FROM familias WHERE num_hijos >= " +  3 + " AND edad_maxima< " + 10;
            consultarBase(sql);
            while(resultado.next()){
                Familia familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
                familias.add(familia);
                
            }
            return familias;
        } catch (Exception e) {
            throw e;
        }
        
    
    
}
    public Collection<Familia> consultarHotmail() throws Exception{
        try {
            Collection<Familia> familias = new ArrayList();
           String sql = "SELECT * FROM familias WHERE email LIKE '%Hotmail%'";
            consultarBase(sql);
            while(resultado.next()){
                Familia familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
                familias.add(familia);
                
            }
            return familias;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    
    
}