/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_1.entidades.services;

import extra_1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class PersonaServicio {
    private Scanner read = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona per = new Persona();
        System.out.println("Creando persona");
        System.out.print("Nombre: ");
        per.setNombre(read.next());
        System.out.print("Edad: ");
        per.setEdad(read.nextInt());
        return per;
        
    }
    
    
    public ArrayList<Persona>  fabricaPersonas(int cantidad){
        ArrayList<Persona> personas = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            personas.add(crearPersona());
            
        }
        return personas;
    }
    
}
