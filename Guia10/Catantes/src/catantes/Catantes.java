package catantes;

import catantes.Entidades.CantanteFamoso;
import catantes.Service.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;

public class Catantes {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();

        CantanteFamoso cantante1 = new CantanteFamoso("charlie garcia", "noche");
        CantanteFamoso cantante2 = new CantanteFamoso("ricardo gonzales", "que ves");
        CantanteFamoso cantante3 = new CantanteFamoso("ricky martin", "aleluya");
        CantanteFamoso cantante4 = new CantanteFamoso("morat", "mirada");
        CantanteFamoso cantante5 = new CantanteFamoso("el polaco", "estrellas");

        listaCantantes.add(cantante1);
        listaCantantes.add(cantante2);
        listaCantantes.add(cantante3);
        listaCantantes.add(cantante4);
        listaCantantes.add(cantante5);

        CantanteFamosoService.mostrar(listaCantantes);

        System.out.println("=============================================");
        System.out.println("BIENVENIDO AL SISTEMA DE GESTION DE CANTANTES");
        System.out.println("QUE DESEA HACER?");
        System.out.println("=============================================");

        int opcion = 0;
        do {
            System.out.println("=======MENU======");
            System.out.println("1. Agregar un cantante.");
            System.out.println("2. Mostrar cantantes.");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.print("opcion: ");
            opcion = read.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del nuevo cantante.");
                    System.out.print("Nombre: ");
                    String nombre = read.next();
                    System.out.print("Disco mas vendido: ");
                    String discoMasvendido = read.next();
                    listaCantantes.add(CantanteFamosoService.agregarCantante(nombre, discoMasvendido));
                    System.out.println("");

                    break;
                case 2:
                    System.out.println("Mostrando cantantes.");
                    CantanteFamosoService.mostrarCantantes(listaCantantes);
                    System.out.println("");

                    break;
                case 3:
                    System.out.println("Que cantante desea eliminar de la lista?");
                    System.out.print("Nombre: ");
                    String nombreDel = read.next();
                    CantanteFamosoService.delete(nombreDel, listaCantantes);
                    System.out.println("");
                    break;
                case 4:

                    break;

                default:
                    throw new AssertionError();
            }
        } while (opcion != 4);
        
        CantanteFamosoService.mostrar(listaCantantes);

    }

}
