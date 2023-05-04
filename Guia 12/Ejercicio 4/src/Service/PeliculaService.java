package Service;

import Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Pelicula>  crearPelis(){
        String opcion = "";
        ArrayList<Pelicula> listPelicula = new ArrayList<>();
        do{
            System.out.println("==================");
            System.out.println("Se esta creando una pelicula");
            System.out.println("Ingrese los datos de esta");
            System.out.print("Titulo: ");
            String titulo =read.next();
            System.out.print("Director: ");
            String director =read.next();
            System.out.print("Duracion(horas): ");
            int duracion =read.nextInt();
            Pelicula nuevaPeli = new Pelicula(titulo,director,duracion);
            System.out.println( "Pelicula creada correctamente.");
            System.out.println("==================");
            System.out.print("Desea ingresar otra pelicula? (s/n) ");
            opcion = read.next();
            listPelicula.add(nuevaPeli);
        }while(opcion.equalsIgnoreCase("s"));
        return listPelicula;
    }

    public void mostrarPelicula(ArrayList<Pelicula> listPelicula){
        System.out.println("Las peliculas son: ");
        for(Pelicula p : listPelicula){
            System.out.println(p);
        }
        System.out.println("==================");
    }
    public void peliculasMayoUnaHora(ArrayList<Pelicula> listPelic){
        System.out.println("Las peloculas con duracion mayor a una hora");
        for(Pelicula p : listPelic){
            if(p.getDuracionHoras() > 1){
                System.out.println(p);
            }
        }
        System.out.println("==================");
    }

    public void ordenarPeliculasMenorMayor(ArrayList<Pelicula> listPelic){
        System.out.println("Las peliculas ordendas de menor duracion a mayor duracion son");
        listPelic.sort(Pelicula.compararDuracionHorasMenorMayor);
        for(Pelicula p : listPelic){
            System.out.println(p);
        }
        System.out.println("==================");
    }
    public void ordenarPeliculasMayorMenor(ArrayList<Pelicula> listPelic){
        System.out.println("Las peliculas ordendas de mayor duracion a menor duracion son");
        Collections.reverse(listPelic);
        for(Pelicula p : listPelic){
            System.out.println(p);
        }
        System.out.println("==================");
    }

    public void ordenarTitulo(ArrayList<Pelicula> listPelic){
        System.out.println("Las peliculas ordenadas por titulo por orden alfabetico");
        listPelic.sort(Pelicula.compararTitulo);
        for(Pelicula p : listPelic){
            System.out.println(p);
        }
        System.out.println("==================");
    }

    public void ordenarDirector(ArrayList<Pelicula> listPelic){
        System.out.println("Las peliculas ordenadas por autor por oden alfabetico");
        listPelic.sort(Pelicula.compararAutor);
        for(Pelicula p : listPelic){
            System.out.println(p);
        }
        System.out.println("==================");
    }




}
