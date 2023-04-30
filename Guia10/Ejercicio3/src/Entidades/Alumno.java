package Entidades;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> listNotas;

    public Alumno() {
        listNotas = new ArrayList<>();
    }

    public Alumno(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListNotas() {
        return listNotas;
    }

    public void setListNotas(ArrayList<Integer> listNotas) {
        this.listNotas = listNotas;
    }
}
