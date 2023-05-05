
package paises;

import Service.PaisService;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Paises {

    public static void main(String[] args) {
        
        
        PaisService ps = new PaisService();
        
        ps.crearPaises();
        ps.mostrarPaises();
        ps.elimarPais();
        ps.mostrarPaises();
        
    }
    
}
