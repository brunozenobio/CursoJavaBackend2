/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package libreria;

import java.util.List;
import libreria.entities.Autor;
import libreria.entities.Editorial;
import libreria.entities.Libro;
import libreria.services.AutorServicio;
import libreria.services.LibroServicio;

/**
 *
 * @author bruno
 */
public class Libreriaa {

    public static void main(String[] args) throws Exception {
       LibroServicio ls = new LibroServicio();
       Editorial editorial = new Editorial("Salamanca");
      ls.getEs().crearEditorial(editorial);
       Libro libro = new Libro("Harry Potter",1995,300,100,200, ls.getAs().buscarPorId(1),editorial);
       ls.crearLibro(libro);
       //Libro libro = new Libro("Harry Potter Y La Camara Secreta",1999,500,50,450, ls.getAs().buscarPorId(1),editorial);
      // ls.crearLibro(libro);
       
       
       List<Libro> libros = ls.buscarPorAutor(ls.getAs().buscarPorId(1).getNombre());
       for(Libro var:libros){
           System.out.println(var.getTitulo());
       }
       List<Libro> libross = ls.buscarPorEditorial("Salamanca");
       for(Libro var:libross){
           System.out.println(var.getTitulo());
       }
               
    }
}
