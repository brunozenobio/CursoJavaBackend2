/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinar.entidades;

import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public class Cocina {
    
    private ArrayList<Receta> recetas;

    public Cocina(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
    
    
    
}
