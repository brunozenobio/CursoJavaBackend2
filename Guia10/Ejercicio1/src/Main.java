import java.util.*;

public class Main {
    public static void main(String[] args) {
        String opcion ="";
        Scanner read = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList();

        do {
            System.out.println("Ingrese una raza de perro");
            System.out.print("Raza: ");
            razasPerros.add(read.next());
            System.out.println("Desea volvera ingresar una raza s/n? ");
            System.out.print("Opcion: ");
            opcion = read.next();



        }while(!"n".equalsIgnoreCase(opcion));

        for(String raza:razasPerros){
            System.out.println("Raza: " + raza);
        }

        System.out.println("Ingrese una raza de perro, se buscara en la lista, si esta se eliminara.");
        System.out.print("Raza: ");
        String nuevaRaza = read.next();
        Collections.sort(razasPerros);
        Iterator<String> iteratorRaza = razasPerros.iterator();
         boolean esta = false;
        while(iteratorRaza.hasNext()){
            if(iteratorRaza.next().equalsIgnoreCase(nuevaRaza)){

                iteratorRaza.remove();
                esta = true;
            }
        }

        if(esta){
            System.out.println("El perro se encontro en la lista y sera removido");
        }else{
            System.out.println("El perro no se encontro en la lista.");
        }
        for(String raza:razasPerros){
            System.out.println("Raza: " + raza);
        }


    }
}