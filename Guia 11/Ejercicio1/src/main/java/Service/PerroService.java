/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class PerroService {
    
    public static ArrayList<Perro> crearPerros(){
        Scanner read = new Scanner(System.in);
        ArrayList<Perro> perrosaux = new ArrayList();
        String opcion = "";
        
        do{
            Perro p = new Perro();
            System.out.println("======================");
            System.out.println("Creando un perro....");
            System.out.println("Ingrese los datos del perro");
            System.out.print("Nombre: ");
            p.setNombre(read.next());
            System.out.print("Raza: ");
            p.setRaza(read.next());
            System.out.print("Edad: ");
        
            p.setEdad(read.nextInt());
            System.out.print("Tamaño: ");
            p.setTamaño(read.nextDouble());
            perrosaux.add(p);
            System.out.println("Desea volver a ingresar ua persona s/n");
            opcion = read.next();
        }while(opcion.equalsIgnoreCase("s"));
        System.out.println("=========================");
        
        return perrosaux;
        
    }
}
