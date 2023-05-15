/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    

    public Juego() {
        jugadores = new ArrayList();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores,RevolverAgua r){
        
        this.jugadores = jugadores;
        this.revolver = r;
        
    }
    
    public void ronda(){
        revolver.llenarRevolver();
        for(Jugador var:jugadores){
            System.out.println("Turno del jugador " + var.getNombre());
            boolean jugada = var.disparo(revolver);
            if(jugada){
                var.setMojado(true);
                System.out.println("Juego terminado");
                System.out.println("El " + var.getNombre() + " ah perdido");
                break;
            }else{
                var.setMojado(false);
            }
        }
        System.out.println("El juego ah finalizado");
        
        
    }
    
    
    
}
