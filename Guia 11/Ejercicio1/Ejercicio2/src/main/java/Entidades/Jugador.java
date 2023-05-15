/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author brunopc
 */
public class Jugador {
    public int id;
    public String nombre;
    public boolean mojado;

    public Jugador() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        nombre = "Jugador " + id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(RevolverAgua rev){
        boolean mojado = rev.mojar();
        rev.siguienteChorro();
        System.out.println("============================");
        System.out.println(nombre + ": Se apunta con el revovler y...");
        System.out.println("...disparo...");
        if(mojado){
            System.out.println("============================");
            System.out.println("El  " + nombre  + " se ah mojado");
            System.out.println("============================");
            return true;
        }else{
            System.out.println("============================");
            System.out.println("El " + nombre + " se ah salvado");
            System.out.println("============================");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
