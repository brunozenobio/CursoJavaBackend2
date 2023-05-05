/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class PersonaService {
    
    public static ArrayList<Persona> crearPersonas(){
        Scanner read = new Scanner(System.in);
        ArrayList<Persona> paux = new ArrayList();
        String opcion = "";
        
        do{
            Persona p = new Persona();
            System.out.println("======================");
            System.out.println("Creando un usuario....");
            System.out.println("Ingrese los datos de la persona");
            System.out.print("Nombre: ");
            p.setNombre(read.next());
            System.out.print("Apellido: ");
            p.setApellido(read.next());
            System.out.print("Nacimiento: ");
            System.out.print("Año: ");
            int anio = read.nextInt();
            System.out.print("Mes: ");
            int mes = read.nextInt();
            System.out.print("Dia: ");
            int dia = read.nextInt();
            Date fecha = new Date(anio - 1900,mes - 1, dia);
            p.setNacimiento(fecha);
            System.out.print("dni: ");
            p.setDni(read.nextLong());
            paux.add(p);
            System.out.println("Desea volver a ingresar ua persona s/n");
            opcion = read.next();
        }while(opcion.equalsIgnoreCase("s"));
        System.out.println("=========================");
        
        return paux;
        
    }
    
}
