/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona.entidades;

/**
 *
 * @author brunopc
 */
public class Dni {
    
    private char serie;
    private int numero;

    public Dni() {
    }

    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
    
    
}
