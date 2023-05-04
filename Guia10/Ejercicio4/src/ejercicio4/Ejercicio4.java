/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Entidades.Pelicula;
import Services.PeliculaService;
import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Pelicula> listPelicula = new ArrayList<>();
        PeliculaService ps = new PeliculaService();
        listPelicula = ps.crearPelis();
        ps.mostrarPelicula(listPelicula);
        ps.ordenarPeliculasMenorMayor(listPelicula);
        ps.ordenarPeliculasMayorMenor(listPelicula);
        ps.ordenarTitulo(listPelicula);
        ps.ordenarDirector(listPelicula);
    }
    
}
