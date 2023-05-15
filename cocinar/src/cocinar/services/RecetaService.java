/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinar.services;

import cocinar.entidades.Receta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class RecetaService {
    
    public static Receta agregarReceta(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Creando una receta");
        System.out.print("Nombre receta: ");
        String nombre = read.next();
        System.out.println("Ingredientes: ");
        int i = 1;
        ArrayList<String> ingredientes = new ArrayList();
        boolean var = true;
        do{
            
            System.out.print("Ingrediente " + i + " : ");
            String ingrediente = read.next();
            ingredientes.add(ingrediente);
            System.out.print("Desea agregar otro ingrediente?(s/n) :  ");
            var = read.next().equalsIgnoreCase("s");
        }while(var);
        
        
        return new Receta(nombre,ingredientes);
        
    }
    
}
