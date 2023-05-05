/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import Entidades.Perro;
import Entidades.Persona;
import Service.PerroService;
import Service.PersonaService;
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
        ArrayList<Perro> perros = new ArrayList();
        
        personas = PersonaService.crearPersonas();
        perros = PerroService.crearPerros();
        
        for(Persona per:personas){
            System.out.println("Datos " + per.getNombre());
            System.out.println(per);
        }

    }
}
