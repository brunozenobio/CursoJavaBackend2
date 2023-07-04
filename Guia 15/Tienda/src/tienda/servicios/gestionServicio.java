/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author brunopc
 */
public class gestionServicio {

    Scanner read = new Scanner(System.in);
    ProductoServicio ps = new ProductoServicio();
    FabricanteServicio fs = new FabricanteServicio();

    public void crearProducto() {
        System.out.println("Creando un producto");
        System.out.print("codigo: ");
        int codigo = read.nextInt();
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.print("Precio: ");
        double precio = read.nextDouble();
        System.out.print("Codigo Fabricante:  ");
        int codigoFabricante = read.nextInt();
        ps.crearProducto(codigo, nombre, precio, codigoFabricante);

    }

    public void crearFabricante() {
        System.out.println("Creando un fabricante");
        System.out.print("codigo: ");
        int codigo = read.nextInt();
        System.out.print("Nombre: ");
        String nombre = read.next();
        fs.crearFabricante(codigo, nombre);

    }

    public void modificarProducto() {
        System.out.println("Ingrese el codigo del producto a modificar");
        int codigo = read.nextInt();
        System.out.println("Ingrese el nombre nuevo: ");
        String nombre = read.next();
        System.out.println("Ingrese el precio nuevo:");
        double precio = read.nextDouble();
        ps.modificarProducto(codigo, nombre, precio);

    }

    public void menu() throws Exception {
        int opcion = 0;
        System.out.println("Bienvenido al sistema de gestion de productos y fabricantes");
        System.out.println("Qué desea hacer?");
        do {
            System.out.println("1.Ingresar un nuevo producto");
            System.out.println("2.Ingresar un nuevo fabricante");
            System.out.println("3.Modificar un producto");
            System.out.println("4.Ver el nombre de todos los productos");
            System.out.println("5.Ver el nombre y los precio de los productos");
            System.out.println("6.Ver los productos cuyo precio esta entre 120 y 202");
            System.out.println("7.Buscasr portátiles");
            System.out.println("8.Ver el producto mas barato");
            System.out.println("9.Salir");
            System.out.print("Opcion: ");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    crearFabricante();
                    break;
                case 3:
                    modificarProducto();
                    break;
                case 4:
                    Collection<Producto> productos = ps.pdao.listarProductos();{
                    for(Producto pro:productos){
                        System.out.println("Producto: ");
                        System.out.println("Nombre: " + pro.getNombre());
                        System.out.println("------");
                    }
                }
                    break;
                case 5:
                    Collection<Producto> productosP = ps.pdao.listarProductosConPrecio();
                    for(Producto pro:productosP){
                        System.out.println("Producto: ");
                        System.out.println("Nombre: " + pro.getNombre() + " Precio: " + pro.getPrecio());
                        System.out.println("------");
                    }

                    break;
                case 6:
                    Collection<Producto> productosP120 = ps.pdao.listarProductos120202();
                    for(Producto pro:productosP120){
                        System.out.println("Producto con precio entre 120 y 202: ");
                        System.out.println("Nombre: " + pro.getNombre() + " Precio: " + pro.getPrecio());
                        System.out.println("------");
                    }

                    break;
                case 7:
                    Collection<Producto> portatiles = ps.pdao.listarPortatiles();
                    for(Producto pro:portatiles){
                        System.out.println("Portatil: ");
                        System.out.println("Codigo: " + pro.getCodigo() + " Nombre: " + pro.getNombre() + " Precio: " + pro.getPrecio() + " Codigo Fabricante: " + pro.getCodigoFabricante());
                        System.out.println("------");
                    }
                    break;
                case 8:
                    Producto productoMasBarato = ps.pdao.productoMasBarato();
                    System.out.println("Producto mas bartato:" );
                    System.out.println("Codigo: " + productoMasBarato.getCodigo() + " Nombre: " + productoMasBarato.getNombre()
                    + " Precio: " + productoMasBarato.getPrecio() + " Codigo Fabricante: " + productoMasBarato.getCodigoFabricante());
                    System.out.println("------");
                    break;
                case 9:

                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 9);
    }

}
