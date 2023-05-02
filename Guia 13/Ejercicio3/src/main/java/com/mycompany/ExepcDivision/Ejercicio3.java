/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ExepcDivision;

import Entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DivisionNumero div;
        System.out.println("Ingrese dos numeros");
        System.out.print("Numero A:  ");
        String stringA = read.next();
        System.out.print("Numero B:  ");
        String stringB = read.next();
        
        try{
              int numeroA = Integer.parseInt(stringA);
              int numeroB = Integer.parseInt(stringB);
              div = new DivisionNumero(numeroA,numeroB);
              System.out.println("El resultado de la division es " + div.dividir());
             
            
        }catch(Exception e){
            System.out.println("Los valores ingresados no son numericos: " + e.getMessage());
        }
         
        
    }
}
