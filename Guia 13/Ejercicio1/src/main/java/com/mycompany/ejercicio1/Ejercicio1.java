/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import Entidades.Persona;

/**
 *
 * @author brunopc
 */
public class Ejercicio1 {

    public static void main(String[] args) {

       
        try {
      Persona persona = null; // inicializar objeto persona a null
      persona.esMayorDeEdad(); // invocar método esMayorDeEdad()
    } catch (NullPointerException e) {
      System.out.println("Se produjo una excepción: " + e.getMessage());
    }
  }
       
       
    }

