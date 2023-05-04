package Entidades;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracionHoras;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracionHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(Integer duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracionHoras=" + duracionHoras +
                '}';
    }

    public static final Comparator<Pelicula> compararDuracionHorasMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getDuracionHoras().compareTo(pelicula2.getDuracionHoras());
        }
    };
    public static final Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
        }
    };
    public static final Comparator<Pelicula> compararAutor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getDirector().compareTo(pelicula2.getDirector());
        }
    };

}
