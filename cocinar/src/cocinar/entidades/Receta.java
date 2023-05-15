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
public class Receta {
    
    private String nombreReceta;
    private ArrayList<String> ingredientes;

    public Receta() {
    }

    public Receta(String nombreReceta, ArrayList<String> ingredientes) {
        this.nombreReceta = nombreReceta;
        this.ingredientes = ingredientes;
    }
    
    

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
}
