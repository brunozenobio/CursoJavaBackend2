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
import libreria.services.SistemaLibreria;

/**
 *
 * @author bruno
 */
public class Libreriaa {

    public static void main(String[] args) throws Exception {
       LibroServicio ls = new LibroServicio();
       SistemaLibreria sl = new SistemaLibreria();
       sl.crearLibro();
      
       
               
    }
}
