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
public class Lavadora extends Electrodomestico{
    private double carga;
    private Scanner read = new Scanner(System.in);

    public Lavadora() {
    }



    public Lavadora(double precio, String color, String consomuEnergetico, double peso, double carga) {
        super(precio, color, consomuEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }


    public void setCarga(double carga) {
        this.carga = carga;
    }



    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Creando una lavadora....");
        System.out.print("ingrese la carga de la lavadora: ");
        carga = read.nextDouble();
        System.out.println("Lavadora creada");

    }

    @Override
    public void precioFinal(){
        super.precioFinal();
        if(carga > 30d){
            precio += 500d;
        }

    }

    @Override
    public String toString() {
        return "Lavador{" +
                "carga=" + carga +
                ", read=" + read +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consomuEnergetico=" + consomuEnergetico +
                ", peso=" + peso +
                '}';
    }
}
