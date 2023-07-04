/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDaoExt;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.gestionServicio;

/**
 *
 * @author brunopc
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        gestionServicio gs = new gestionServicio();
        gs.menu();
        
        
    }
    
}
