/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.servicios;

import com.mycompany.tienda.entidades.Fabricante;
import com.mycompany.tienda.persistencia.FabricanteDaoExt;
import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public class FabricanteServicio {
    
    public void mostrarFabricantes() throws Exception{
        FabricanteDaoExt fbs = new FabricanteDaoExt();
        Fabricante fb =fbs.consultarFabricante();
        
            System.out.println("Id producto: " + fb.getCodigo());
            System.out.println("Nombre: " + fb.getNombre());
            
    }
    
}
