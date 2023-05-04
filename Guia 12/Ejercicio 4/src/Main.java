import Entidades.Pelicula;
import Service.PeliculaService;

import java.util.ArrayList;

public class Main {
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