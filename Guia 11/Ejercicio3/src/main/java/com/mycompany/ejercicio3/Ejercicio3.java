package com.mycompany.ejercicio3;

import Entidades.*;
import java.util.*;
import Enum.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Baraja nuevaBaraja = new Baraja();
        ArrayList<Carta> auxCartas = new ArrayList<>();
        for (NumeroCarta var : NumeroCarta.values()) {
            for (Palo var2 : Palo.values()) {

                Carta nuevaCarta = new Carta();
                nuevaCarta.setNumero(var);
                nuevaCarta.setPaloCarta(var2);
                auxCartas.add(nuevaCarta);
            }

        }

        System.out.println("Sistema de maso, que desea hacer?");
        System.out.println("===============================");
        int opc = 0;
        do {
            System.out.println("===============================");
            System.out.println("1. Crear baraja");
            System.out.println("2. Mostrar baraja");
            System.out.println("3. barajar");
            System.out.println("4. Ver cartas disponibles");
            System.out.println("5. Ver siguiente carta");
            System.out.println("6. Dar cartas");
            System.out.println("7. Cartas del monton salido");
            System.out.println("8. Salir del menu");
            System.out.println("===============================");
            System.out.print("Opcion: ");
            opc = read.nextInt();
            
            switch (opc) {
                case 1:
                    nuevaBaraja.setCartas(auxCartas);
                    nuevaBaraja.setCartasDisponibles(nuevaBaraja.getCartas());
                    nuevaBaraja.setIteradorCartas(auxCartas);
                    break;
                case 2:
                    nuevaBaraja.mostrarBaraja();
                    break;
                case 3:
                    nuevaBaraja.barajar();
                    break;
                case 4:
                    nuevaBaraja.cartaCDisponibles();
                    break;
                case 5:
                    nuevaBaraja.siguienteCarta();
                    break;
                case 6:
                    nuevaBaraja.darCartas();
                    break;
                case 7:
                    nuevaBaraja.cartasMonton();
                    break;
                case 8:

                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 8);
        System.out.println("===============================");
        System.out.println("Programa finalizado");
    }
}
