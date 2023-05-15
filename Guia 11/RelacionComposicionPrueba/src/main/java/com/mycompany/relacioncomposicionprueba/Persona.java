/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacioncomposicionprueba;

/**
 *
 * @author brunopc
 */
public class Persona {
    private Pelo tipodePelo;

    public Persona() {
        tipodePelo = new Pelo();
    }
    
    public void colorPelo(String color){
        tipodePelo.setColor(color);
    }
    
    
}
