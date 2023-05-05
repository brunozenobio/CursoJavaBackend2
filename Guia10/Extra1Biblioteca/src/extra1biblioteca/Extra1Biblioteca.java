package extra1biblioteca;

import Entidades.Libro;
import Services.LibroServices;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Extra1Biblioteca {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Set<Libro> libros = new HashSet();
        String opcion = "";

        do {
            Libro nuevoLibro = new Libro();
            System.out.println("Se esta creando un libro...");
            System.out.print("Titulo: ");
            nuevoLibro.setTitulo(read.next());
            System.out.print("Autor: ");
            nuevoLibro.setAutor(read.next());
            System.out.print("Numero de ejemplares: ");
            nuevoLibro.setNumeroEjemplares(read.nextInt());
            System.out.print("Numero de ejemplares prestados: ");
            nuevoLibro.setNumeroEjemplaresPrestados(read.nextInt());
            libros.add(nuevoLibro);
            System.out.println("Libro creado correctamente.");
            System.out.println("==========================");
            System.out.println("Desea ingresar otro libro? (s/n)");
            opcion = read.next();

        } while (opcion.equalsIgnoreCase("s"));
        System.out.println("==================");
        
        System.out.println("=====================");
        System.out.println("Bienvenido al sistema de gestion de libros");
        System.out.println("=====================");

        int opMenu = 0;
        do {
            System.out.println("1. Prestamo");
            System.out.println("2. Devolución");
            System.out.println("3. Salir");
            opMenu = read.nextInt();
            switch (opMenu) {
                case 1:
                    System.out.println("Bienvenido al sistema de prestamos de libros.");
                    do {
                        System.out.println("De que libro desea que se le realice un prestamo");
                        String tituloPres = read.next();

                        for (Libro lib : libros) {
                            if (tituloPres.equalsIgnoreCase(lib.getTitulo())) {
                                LibroServices.prestamo(lib);
                            }
                        }
                        System.out.println("Desea otro prestamo? (s/n)");
                        opcion = read.next();
                    } while (opcion.equalsIgnoreCase("s"));
                    break;
                case 2:
                    System.out.println("Bienvenido al sistema de devolucion de libros.");
                    do {
                        System.out.println("De que libro desea hacer la devolucion?");
                        String tituloPres = read.next();

                        for (Libro lib : libros) {
                            if (tituloPres.equalsIgnoreCase(lib.getTitulo())) {
                                LibroServices.devolucion(lib);
                            }
                        }
                        System.out.println("Desea otra devolucion? (s/n)");
                        opcion = read.next();
                    } while (opcion.equalsIgnoreCase("s"));
                    break;
            }
        } while (opMenu != 3);
        
        System.out.println("===============");
        System.out.println("Programa Finalizado");
        System.out.println("===============");

    }

}
