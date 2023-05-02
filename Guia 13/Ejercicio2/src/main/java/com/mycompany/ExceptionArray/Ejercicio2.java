/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ExceptionArray;

/**
 *
 * @author brunopc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String[] arrayExp = new String[5];
        
        
        try{
            arrayExp[6] = "hola";
        }catch(Exception e){
            System.out.println("Error al agregar el valor al arreglo:   " + e.getMessage());
        }
        
    }
}
