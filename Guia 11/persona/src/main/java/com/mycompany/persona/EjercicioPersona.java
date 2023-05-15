/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

import com.mycompany.persona.entidades.*;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class EjercicioPersona {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Persona persona = new Persona();
        Dni dni = new Dni();
        
        
        System.out.print("Ingrese la serie del dni: ");
        dni.setSerie(read.next().charAt(0));
        System.out.print("Ingrese el numero: ");
        dni.setNumero(read.nextInt());
        
        persona.setDni(dni);
        
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(read.next());
        System.out.print("Ingrese el apellido: ");
        persona.setApellido(read.next());
        
        System.out.println(persona);
        
    }
}
