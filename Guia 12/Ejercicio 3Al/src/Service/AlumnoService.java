package Service;

import Entidades.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    private Scanner read = new Scanner(System.in);
    public ArrayList<Alumno> crearAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList();
        String opcion = "";
        do {
            ArrayList<Integer> nuevaNota = new ArrayList<>();
            Alumno nuevoAlumno = new Alumno();
            System.out.println("Creando un alumno...");
            System.out.print("Nombre: ");
            nuevoAlumno.setNombre(read.next());
            System.out.print("Nota1: ");
            nuevaNota.add(read.nextInt());
            System.out.print("Nota2: ");
            nuevaNota.add(read.nextInt());
            System.out.print("Nota3: ");
            nuevaNota.add(read.nextInt());
            nuevoAlumno.setListNotas(nuevaNota);
            System.out.println("Desea agregar otro alumno? s/n");
            System.out.print("Opcion: ");
            opcion = read.next();
            alumnos.add(nuevoAlumno);
        }while(opcion.equalsIgnoreCase("s"));
        return alumnos;

    }

    public double notaFinal(Alumno al){
        int sum = 0;
        for(Integer var: al.getListNotas()){
            sum+=var;
        }
        return sum/al.getListNotas().size();
    }
}