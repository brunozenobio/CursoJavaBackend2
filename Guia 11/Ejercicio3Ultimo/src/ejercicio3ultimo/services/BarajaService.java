/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3ultimo.services;

import ejercicio3ultimo.entidades.Baraja;
import ejercicio3ultimo.entidades.Carta;
import ejercicio3ultimo.enums.Palo;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author brunopc
 */
public class BarajaService {

    public Baraja crearBaraja() {
        System.out.println("Creando una baraja de 40 cartas sin los 8 y 9");
        Baraja barajaDeCartas = new Baraja();
        ArrayList<Carta> cartas = new ArrayList();
        for (int i = 0; i < 10; i++) {

            for (Palo var : Palo.values()) {
                Carta carta = new Carta();
                carta.setPalos(var);
                carta.setNumero(barajaDeCartas.getNumeros()[i]);
                cartas.add(carta);
            }

        }
        barajaDeCartas.setCartas(cartas);
        barajaDeCartas.setCartasDisponibles(cartas);
        System.out.println("Baraja creada.");
        return barajaDeCartas;
    }

    public void barajar(Baraja baraja) {
        ArrayList<Carta> cartas = new ArrayList();
        cartas = baraja.getCartas();
        Collections.shuffle(cartas);
        baraja.setCartas(cartas);
        System.out.println("Baraja de cartas mezcada");
        System.out.println("============================");
    }

    public Carta siguienteCarta(Baraja baraja) {
        if (baraja.getCartaActual() >= baraja.getCartasDisponibles().size()) {
            System.out.println("No hay más cartas disponibles en la baraja.");
            return null;
        }

        Carta siguienteCarta = baraja.getCartasDisponibles().get(baraja.getCartaActual());
        baraja.setCartaActual(baraja.getCartaActual() + 1);
        return siguienteCarta;
    }

    public void cartasDisponibles(Baraja baraja) {
        System.out.println("La cantidad de cartas disponibles para usar son " + baraja.getCartas().size());
        System.out.println("============================");
    }

    public void darCartas(Baraja baraja, int numeroPedido) {
        ArrayList<Carta> cartasSalidas = new ArrayList();
        ArrayList<Carta> cartasDisp = baraja.getCartasDisponibles();

        if (baraja.getCartaActual() > baraja.getCartas().size()) {
            System.out.println("No queda esa cantidad de cartas para repartir");
            cartasDisponibles(baraja);
        } else {
            for (int i = 0; i < numeroPedido; i++) {
                Carta carta = siguienteCarta(baraja);
                cartasDisp.remove(baraja.getCartaActual() - 1);
                cartasSalidas.add(carta);
                System.out.println("Su carta es: ");
                System.out.println("Numero " + carta.getNumero() + "Palo: " + carta.getPalos());
                System.out.println("============================");
            }
            baraja.setCartasDisponibles(cartasDisp);
            baraja.setCartasSalidas(cartasSalidas);
        }
    }

    public void cartasDelMonton(Baraja baraja) {
        System.out.println("Las cartas que han salido del maso son ");

        for (Carta var : baraja.getCartasSalidas()) {
            System.out.println("Numero: " + var.getNumero() + " Palo: " + var.getPalos());
        }
        System.out.println("============================");
    }

    public void mostrarBaaraja(Baraja baraja) {
        System.out.println("Las cartas que quedan en la baraja son ");

        for (Carta var : baraja.getCartasDisponibles()) {
            System.out.println("Numero: " + var.getNumero() + " Palo: " + var.getPalos());
        }
        System.out.println("============================");
    }

}
