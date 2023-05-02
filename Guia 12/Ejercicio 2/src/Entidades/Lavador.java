package Entidades;

import java.util.Scanner;

public class Lavador extends Electrodomesticos {
    private double carga;
    private Scanner read = new Scanner(System.in);

    public Lavador() {
    }



    public Lavador(double precio, String color, char consomuEnergetico, double peso, double carga) {
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
        if(carga > 30){
            precio += 500d;
        }
        System.out.println("El precio final de la Lavadora es: " + precio + " pesos ");

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
