/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3ultimo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brunopc
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasDisponibles;
    private ArrayList<Carta> cartasSalidas;
    private int cartaActual;
    private  int[] numeros = {1,2,3,4,5,6,7,10,11,12};

    public Baraja() {
        cartas = new ArrayList();
        cartasDisponibles = new ArrayList();
        cartasSalidas = new ArrayList();
        cartaActual = 0;
        
    }

    public int getCartaActual() {
        return cartaActual;
    }

    public void setCartaActual(int cartaActual) {
        this.cartaActual = cartaActual;
    }
    

    public ArrayList<Carta> getCartasDisponibles() {
        return cartasDisponibles;
    }

    public void setCartasDisponibles(ArrayList<Carta> cartasDisponibles) {
        this.cartasDisponibles = cartasDisponibles;
    }

    public ArrayList<Carta> getCartasSalidas() {
        return cartasSalidas;
    }

    public void setCartasSalidas(ArrayList<Carta> cartasSalidas) {
        this.cartasSalidas = cartasSalidas;
    }
    

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> barajaDeCartas) {
        this.cartas = barajaDeCartas;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    
    
    
}
