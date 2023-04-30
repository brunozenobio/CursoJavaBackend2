/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
       
        for (int i = 0; i < 2; i++) {
            
            Persona pers = new Persona();
            System.out.println("Ingrese los datos de la persona " + (i + 1));
            System.out.print("Nombre: ");
            pers.setNombre(read.next());
            System.out.print("Apellido: ");
            pers.setApellido(read.next());
            System.out.print("Edad: ");
            pers.setEdad(read.nextInt());
            System.out.print("Numero Dni: ");
            pers.setDni(read.nextLong());
            Perro perro = new Perro();
            System.out.println("Ingrese los datos de la mascota de la persona " + (i + 1));
            System.out.print("Nombre: ");
            perro.setNombre(read.next());
            System.out.print("Raza: ");
            perro.setRaza(read.next());
            System.out.print("Edad: ");
            perro.setEdad(read.nextInt());
            System.out.print("Tamaño: ");
            perro.setTamaño(read.nextDouble());
            pers.setMascota(perro);
           
            personas.add(pers);
        }
        for(Persona per:personas){
            System.out.println("Datos " + per.getNombre());
            System.out.println(per);
        }

    }
}
