package ejercicio3ultimo;

import ejercicio3ultimo.entidades.Baraja;
import ejercicio3ultimo.services.BarajaService;
import java.util.Scanner;

public class Ejercicio3Ultimo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        BarajaService barajaS = new BarajaService();
        Baraja barajaNueva = new Baraja();
        int op = 0;
        System.out.println("============================================");
        System.out.println("Sistema de maso de cartas, que desea hacer?");
        System.out.println("============================================");
        do {
            System.out.println("1. Crear una baraja");
            System.out.println("2. Barajar");
            System.out.println("3. Pasar a la siguiente carta");
            System.out.println("4. Ver cantidad de cartas disponibles");
            System.out.println("5. Repartir cartas a un usuario");
            System.out.println("6. Ver las cartas que han salido del maso");
            System.out.println("7. Ver las cartas que quedan en el maso");
            System.out.println("8. salir");
            System.out.print("Opcion: ");
            op = read.nextInt();
            switch (op) {
                case 1:
                    System.out.println("============================================");
                    barajaNueva = barajaS.crearBaraja();
                    System.out.println("============================================");
                    break;
                case 2:
                    System.out.println("============================================");
                    barajaS.barajar(barajaNueva);
                    System.out.println("============================================");

                    break;
                case 3:
                    System.out.println("============================================");
                    barajaS.siguienteCarta(barajaNueva);
                    System.out.println("============================================");

                    break;
                case 4:
                    System.out.println("============================================");
                    barajaS.cartasDisponibles(barajaNueva);
                    System.out.println("============================================");

                    break;
                case 5:
                    System.out.println("============================================");
                    System.out.print("Que cantidad de cartas desea: ");
                    int cant = read.nextInt();
                    barajaS.darCartas(barajaNueva, cant);
                    System.out.println("============================================");

                    break;
                case 6:
                    System.out.println("============================================");
                    barajaS.cartasDelMonton(barajaNueva);
                    System.out.println("============================================");

                    break;
                case 7:
                    System.out.println("============================================");
                    barajaS.mostrarBaaraja(barajaNueva);
                    System.out.println("============================================");
                    break;
                case 8:

                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 8);

    }

}
