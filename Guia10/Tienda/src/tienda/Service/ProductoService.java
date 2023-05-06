/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class ProductoService {

    public void crearProductos(HashMap<String, Integer> productos) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresando productos");
        String opcion = "";
        do {
            System.out.print("Nombre: ");
            String nombre = read.next();
            System.out.print("Precio: ");
            int precio = read.nextInt();
            productos.put(nombre, precio);
            System.out.print("Desea agregar otro producto? (s/n): ");
            opcion = read.next();
        } while (opcion.equalsIgnoreCase("s"));

    }

    public void modificarPrecio(HashMap<String, Integer> productos) {
        Scanner read = new Scanner(System.in);
        System.out.println("De que producto desea modificar el precio");
        System.out.print("nombre: ");
        String nombre = read.next();
        System.out.println("Que precio desea cambiar");
        System.out.print("precio nuevo");
        int precio = read.nextInt();

        productos.replace(nombre, precio);
        System.out.println("El precio de " + nombre + " ahora es " + precio );

    }

    public void eliminarProducto(HashMap<String, Integer> productos) {
        Scanner read = new Scanner(System.in);
        System.out.println("Que producto desea eliminar");
        System.out.print("nombre: ");
        String nombre = read.next();

        productos.remove(nombre);
        System.out.println("El producto " + nombre + " ah sido eliminado de la lista");

    }

    public void mostrarProductos(HashMap<String, Integer> productos) {
        System.out.println("====================");
        System.out.println("Lista de productos.");

        for (Map.Entry maps : productos.entrySet()) {
            System.out.println("Nombre: " + maps.getKey());
            System.out.println("Precio: " + maps.getValue());
            System.out.println("");
        }
    }

    public void menu(HashMap<String, Integer> productos) {
        Scanner read = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Bienvido al sistema de gestion de productos");
        System.out.println("Que desea hacer");
        int opcion = 0;
        System.out.println("=========================================");

        do {
            System.out.println("============MENU============");
            System.out.println("1. Agregar prudctos");
            System.out.println("2. Modificar el precio de un prudcto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Visualizar los productos");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    crearProductos(productos);
                    break;
                case 2:
                    modificarPrecio(productos);
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    mostrarProductos(productos);
                    break;
                case 5:
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 5);
        System.out.println("=========================================");
        System.out.println("Ejecucion Finalizada");
        System.out.println("=========================================");        

    }

}
