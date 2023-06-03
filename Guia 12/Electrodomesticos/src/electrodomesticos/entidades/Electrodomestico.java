/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos.entidades;

import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected String consomuEnergetico;
    protected double peso;
    private Scanner read = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String consomuEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consomuEnergetico = consomuEnergetico;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consomuEnergetico);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsomuEnergetico() {
        return consomuEnergetico;
    }

    public void setConsomuEnergetico(String consomuEnergetico) {
        this.consomuEnergetico = consomuEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(String letra) {
        if (!letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("C")
                && !letra.equalsIgnoreCase("D") && !letra.equalsIgnoreCase("E") && !letra.equalsIgnoreCase("F")) {
            letra = "F";
        }
        this.consomuEnergetico = letra;

    }

    private void comprobarColor(String color) {
        switch (color) {
            case "blanco":
                break;
            case "negro":
                break;
            case "rojo":
                break;
            case "azul":
                break;
            case "gris":
                break;
            default:
                color = "blanco";
        }
        this.color = color;
    }

    public void crearElectrodomestico() {
        System.out.println("Creando electrodomestico.");
        System.out.println("Ingrese la informacion del electrodomestico");
        System.out.print("Color: ");
        String color = read.next();
        comprobarColor(color);
        System.out.print("Consumu energetico(Letras de A a F): ");
        String consumo = read.next();
        comprobarConsumoEnergetico(consumo);
        System.out.print("Peso(kg): ");
        peso = read.nextDouble();
        precio = 1000d;

    }

    public void precioFinal() {
        switch (consomuEnergetico) {
            case "A":
                precio += 1000d;
                break;
            case "B":
                precio += 800d;
                break;
            case "C":
                precio += 600d;
                break;
            case "D":
                precio += 500d;
                break;
            case "E":
                precio += 300d;
                break;
            default:
                precio += 100d;
                break;
        }

        if (peso <= 19) {
            precio += 100d;
        } else if (peso <= 49) {
            precio += 500d;
        } else if (peso <= 79) {
            precio += 800d;
        } else {
            precio += 1000d;
        }

    }
}
