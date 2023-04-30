import Entidades.Alumno;
import Service.AlumnoService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AlumnoService as = new AlumnoService();
        ArrayList<Alumno> alumnos = new ArrayList();
        alumnos = as.crearAlumnos();
        System.out.println("Ingrese el nombre de un alumno:");
        String nombre = read.next();
        Iterator<Alumno> iteratorAlumnos = alumnos.iterator();
        double notafinal = -1;
        while(iteratorAlumnos.hasNext()){
            Alumno alumnoActual = iteratorAlumnos.next();
            if(alumnoActual.getNombre().equalsIgnoreCase(nombre)){
                notafinal = as.notaFinal(alumnoActual);
                break;
            }
        }
        if(notafinal<0){
            System.out.println("No se encontro el alumno");
            System.out.println(notafinal);
        }else{
            System.out.println("El alumno buscado " + nombre + " tiene como nota final " + notafinal);

        }


    }
}