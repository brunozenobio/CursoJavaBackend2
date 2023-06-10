package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a,b;
        try {
            System.out.print("Numero 1: ");
            String numero1 = read.next();
            System.out.print("Numero 2: ");
            String numero2 = read.next();
           a = Integer.parseInt(numero1);
             b = Integer.parseInt(numero2);
            double division = a / b;
            System.out.println("La division da " + division);

        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Datos ingresadoos errononeos");

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Error al pasar el numero");

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Error al dividir");
        }



    }
}