/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_1.entidades.services;

import extra_1.entidades.Perro;
import extra_1.enums.Razas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class PerroServicio {

    private Scanner read = new Scanner(System.in);

    public Perro crearPerro() {
        Perro p = new Perro();
        System.out.println("Creando un perro");
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.print("Tamaño: ");
        String tamanio = read.next();
        System.out.println("RAZA: " + Razas.values().toString());
        String op = read.next();
        for(Razas raza:Razas.values()){
            if(raza.toString().equalsIgnoreCase(op)){
                p.setRaza(raza);
            }else{
                p.setRaza(Razas.OTROS);
            }
        }
        
        p.setNombre(nombre);
        p.setTamanio(tamanio);
        p.setTamanio(tamanio);
        return p;
    }
    
    public ArrayList<Perro>  fabricaPerros(int cantidad){
        ArrayList<Perro> perros = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            perros.add(crearPerro());
            
        }
        return perros;
    }

}
