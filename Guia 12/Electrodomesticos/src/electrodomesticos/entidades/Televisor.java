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
public class Televisor extends Electrodomestico {

    private double pulgadas;
    private boolean TDT;
    private Scanner read = new Scanner(System.in);

    public Televisor() {
    }

    public Televisor(double precio, String color, String consomuEnergetico, double peso, double pulgadas) {
        super(precio, color, consomuEnergetico, peso);
        this.pulgadas = pulgadas;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Creando televisor...");
        System.out.print("Pulgadas: ");
        pulgadas = read.nextDouble();
        System.out.print("Tiene sintonizador TDT?(true o false)");
        TDT = read.nextBoolean();
        System.out.println("Televisor creador.");

    }

    @Override
    public void precioFinal() {

        super.precioFinal();
        
        if (TDT) {
            precio += 500d;
        }
        if (pulgadas > 40) {
            precio *= 1.3d;
        }
    }

    @Override
    public String toString() {
        return "Televisor{"
                + "pulgadas=" + pulgadas
                + ", TDT=" + TDT
                + ", read=" + read
                + ", precio=" + precio
                + ", color='" + color + '\''
                + ", consomuEnergetico=" + consomuEnergetico
                + ", peso=" + peso
                + '}';
    }
}
