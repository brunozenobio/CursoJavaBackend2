
package saladecine;

import saladecine.entidades.Pelicula;
import saladecine.entidades.Persona;
import saladecine.entidades.SalaCine;
import saladecine.servicios.CineServices;

public class SalaDeCine {

    public static void main(String[] args) {
        CineServices sn = new CineServices();
        SalaCine sala = sn.iniciarSala();
        Persona pers = sn.crearPersona();
        Pelicula pel = sn.crearPelicula();
        
        sn.mostrarSala(sala);
        sala.setPeliluca(pel);
        sn.comprarEntrada(sala, pers);
        sn.mostrarSala(sala);
        
        
        
    }
    
}
