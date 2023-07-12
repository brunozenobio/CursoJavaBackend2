
package libreria.services;

import java.util.Scanner;
import libreria.entities.Autor;
import libreria.entities.Editorial;
import libreria.entities.Libro;

public class SistemaLibreria {
    LibroServicio ls = new LibroServicio();
    ClienteServicio cs = new ClienteServicio();
    PrestamoServicio ps = new PrestamoServicio();
    Scanner read = new Scanner(System.in);
    
    public void crearAutor() throws Exception{
         try {
            System.out.println("Se esta creando un Autor");
            System.out.print("Ingrese el nombre del Autor:");
            String nombre = read.next();
            Autor autor = new Autor(nombre);
            ls.getAs().creaAutor(autor);
      
        } catch (Exception e) {
            throw e;
        }
    }
    public void crearEditorial() throws Exception{
         try {
            System.out.println("Se esta creando una Editorial");
            System.out.print("Ingrese el nombre de la editorial:");
            String nombre = read.next();
            Editorial editorial = new Editorial(nombre);
            ls.getEs().crearEditorial(editorial);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void crearLibro() throws Exception{
        try {
            System.out.println("Se esta creando un libro");
            System.out.print("Ingrese el titulo del libro: ");
             String titulo = read.next();
            System.out.print("Ingrese el año de fabricacion: ");
            Integer anio = read.nextInt();
            System.out.print("Ingrese la cantidad de ejemplares: ");
            Integer cantidad = read.nextInt();
            System.out.print("Ingrese el id del autor: ");
            Integer id = read.nextInt();
            Autor autor = ls.getAs().buscarPorId(id);
            System.out.print("Ingrese el id de la editorial: ");
            Integer idd = read.nextInt();
            Editorial editorial = ls.getEs().buscarPorId(idd);
            Libro libro = new Libro(titulo,anio,cantidad,autor,editorial);
            ls.crearLibro(libro);
            
            
            
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
