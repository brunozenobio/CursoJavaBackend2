
package Services;

import Entidades.Libro;
import java.util.Scanner;
import java.util.Set;


public class LibroServices {
    
    public static boolean prestamo(Libro libro){
        if(libro.getNumeroEjemplaresPrestados()  >= libro.getNumeroEjemplares()){
            System.out.println("Lo lamento no hay mas ejemplares disponibles con el titulo " + libro.getTitulo());
            return false;
        }else{
            System.out.println("Realizando prestamo de " + libro.getTitulo());
            libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() + 1);
            return true;
        }
        
    }
    
    public static boolean devolucion(Libro libro){
        if(libro.getNumeroEjemplaresPrestados()  > 0){
            System.out.println("Grcias por la dovolucion de: " + libro.getTitulo());
            libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() -1 );
            return true;
        }else{
            System.out.println("Error de devolucion " + libro.getTitulo());
            return false;
        }
        
    }
    
    
}
