package Entidades;

import java.util.Scanner;

public class Electrodomesticos {
    protected double precio;
    protected  String color;
    protected  char consomuEnergetico;
    protected double peso;
    private Scanner read = new Scanner(System.in);


    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consomuEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consomuEnergetico = consomuEnergetico;
        this.peso = peso;
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

    public char getConsomuEnergetico() {
        return consomuEnergetico;
    }

    public void setConsomuEnergetico(char consomuEnergetico) {
        this.consomuEnergetico = consomuEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void comprobarConsumoEnergetico(char letra){
        if(letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F'){
            consomuEnergetico = 'F';
        }
    }

    public void comprobarColor(String color){
        switch (color){
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
                this.color = "blanco";
        }
    }

    public void crearElectrodomestico(){
        System.out.println("Creando electrodomestico.");
        System.out.println("Ingrese la informacion del electrodomestico");
        System.out.print("Color: ");
        String color = read.next();
        comprobarColor(color);
        System.out.print("Consumu energetico(Letras de A a F): ");
        char consumo = read.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.print("Peso(kg): ");
        peso = read.nextDouble();
        precio = 1000d;


    }

    public void precioFinal(){
        switch(consomuEnergetico) {
            case 'A':
                precio += 1000d;
                break;
            case 'B':
                precio += 800d;
                break;
            case 'C':
                precio += 600d;
                break;
            case 'D':
                precio += 500d;
                break;
            case 'E':
                precio += 300d;
                break;
            default:
                precio += 100d;
                break;
        }

        if(peso <= 19 || peso >1){
            precio += 100d;
        } else if (peso <=49 || peso >= 20) {
            precio += 500d;

        } else if (peso >= 50 || peso <= 79) {
            precio += 800d;

        }else {
            precio += 1000d;
        }

    }
}
