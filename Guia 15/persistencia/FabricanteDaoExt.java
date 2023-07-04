/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.persistencia;

import com.mycompany.tienda.entidades.Fabricante;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public final class FabricanteDaoExt extends  DAO{
    public Fabricante consultarFabricante() throws Exception{
        Fabricante fab = null;
        try {
            String sql = "SELECT codigo,nombre FROM fabricante WHERE codigo = " + 3  ;
            consultarBase(sql);
            
           
                fab.setCodigo(resultado.getInt(0));
                fab.setNombre(resultado.getString(1));
                
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
        return fab;
    }
    
    
}
