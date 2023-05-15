/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        RevolverAgua revolver = new RevolverAgua();
        Juego nuevoJuego = new Juego();
        
        ArrayList<Jugador> listaDeJugadores = new ArrayList();
        String opcion = "";
        System.out.println("Agregue jugadores, para la ruleta rusa, de 1 a 6 jugadores ");
        int idJugador = 1;
        do {
            Jugador jugador = new Jugador();
            System.out.println("Agregando jugador " + idJugador);
            
            jugador.setId(idJugador);
            jugador.setNombre();
            idJugador++;
            listaDeJugadores.add(jugador);
            System.out.println("Desea agregar otro jugador?");
            opcion = read.next();
        } while (opcion.equalsIgnoreCase("s"));
        
        nuevoJuego.llenarJuego(listaDeJugadores, revolver);
        nuevoJuego.ronda();
        
        for(Jugador var:listaDeJugadores){
            System.out.println(var);
        }
        
        
    }
}
