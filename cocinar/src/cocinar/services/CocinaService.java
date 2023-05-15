/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinar.services;

import cocinar.entidades.Cocina;
import cocinar.entidades.Receta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class CocinaService {
    
    public Cocina iniciarCocina(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Receta> recetas = new ArrayList<>();
        System.out.println("Iniciando la cocina,debe ingresar al menos una receta");
        Receta nuevaReceta = RecetaService.agregarReceta();
        recetas.add(nuevaReceta);
        Cocina cocina = new Cocina(recetas);
        
        
        return cocina;
        
    }
    
    public Cocina agregarReceta(Cocina cocina){
        System.out.println("Agregando una receta a la cocina");
        Receta receta = RecetaService.agregarReceta();
        cocina.getRecetas().add(receta);
        return cocina;
    }
    
}
