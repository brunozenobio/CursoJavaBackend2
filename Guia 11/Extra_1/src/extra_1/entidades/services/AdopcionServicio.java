package extra_1.entidades.services;

import extra_1.entidades.Perro;
import extra_1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionServicio {

    Scanner read = new Scanner(System.in);

    public Persona buscarPersona(String nombre, ArrayList<Persona> personas) {
        for (Persona pers : personas) {
            if (pers.getNombre().equalsIgnoreCase(nombre)) {
                return pers;
            }
        }

        System.out.println("No se encontro ninguna persona de nombre " + nombre);
        return null;

    }

    public Perro buscarPerro(String nombre, ArrayList<Perro> perros) {
        for (Perro pers : perros) {
            if (pers.getNombre().equalsIgnoreCase(nombre)) {
                return pers;
            }
        }

        System.out.println("No se encontro ningun perro de nombre " + nombre);
        return null;

    }

    public void adoptarPerro(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        System.out.println("Ingrese el nombre de la persona que quiere adoptar");
        String nombrePer = read.next();
        System.out.println("Ingrese el nombre del perro que se desea adoptar");
        String nombrePerro = read.next();
        Persona pers = buscarPersona(nombrePer, personas);
        Perro perro = buscarPerro(nombrePerro, perros);
        if (pers.getMascota() == null) {
            if (!perro.isAdoptado()) {
                pers.setMascota(perro);
                perro.setAdoptado(true);
            } else {
                System.out.println("Es perro ya tiene un dueño");
            }
        }else{
            System.out.println("Esa persona ya tiene un perro adoptado");
        }

    }
    public void mostrarListaPersonas(ArrayList<Persona> personas){
        System.out.println("Personas: ");
        for(Persona pers:personas){
            System.out.println("Nombre: " +  pers.getNombre());
        }
        
    }
    
    public void mostrarListaPerros(ArrayList<Perro> perros){
        System.out.println("Perros: ");
        for(Perro perr:perros){
            System.out.println("Nombre: " +  perr.getNombre() + "Raza: " + perr.getRaza());
        }
        
    }
    
    public void verAdoptados(ArrayList<Persona> personas, ArrayList<Perro> perros){
        
        System.out.println("Perros y dueños");
        for(int i = 0;i<perros.size();i++){
            if(perros.get(i).isAdoptado()){
                System.out.println("Persona : " + personas.get(i).getNombre());
                System.out.println("Perro  : " + perros.get(i).getNombre() +  " " +perros.get(i).getRaza());
            }
            
        }
        
    }
    public void verDisponibles(ArrayList<Perro> perros){
        System.out.println("Los perros disponibles son");
        for(int i = 0;i<perros.size();i++){
            if(!perros.get(i).isAdoptado()){
                
                System.out.println("Perro  : " + perros.get(i).getNombre() +  " " +perros.get(i).getRaza());
            }
            
        }
    }
    
    public void sistemaDeAdoptcion(ArrayList<Persona> personas, ArrayList<Perro> perros){
        
        System.out.println("Sistema de adopcion de perros");
        
        
        
        String op ="";
        do{
            System.out.println("Adoptando perros");
            adoptarPerro(personas, perros);
            System.out.println("Desea seguir adoptando?(s/n)?");
            op = read.next();
        }while(op.equalsIgnoreCase("s"));
        
    }
    
    public void menuAdopcion(){
        PersonaServicio ps = new PersonaServicio();
        PerroServicio prs = new PerroServicio();
        ArrayList<Persona> personas = ps.fabricaPersonas(5);
        ArrayList<Perro> perros = prs.fabricaPerros(5);
        int op = 0;
        
        do{
            System.out.println("1. Ver Personas");
            System.out.println("2. Ver Perros");
            System.out.println("3. Adoptar");
            System.out.println("4. Ver perros disponibles");
            System.out.println("5. Ver perros y dueños");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            op = read.nextInt();
            switch (op) {
                case 1:
                    mostrarListaPersonas(personas);
                    break;
                    case 2:
                        mostrarListaPerros(perros);
                    
                    break;
                    case 3:
                        sistemaDeAdoptcion(personas,  perros);
                    
                    break;
                    case 4:
                        verDisponibles(perros);
                    
                    break;
                    case 5:
                        verAdoptados(personas, perros);
                    break;
                    case 6:
                        
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }while(op != 6);
    }

}
