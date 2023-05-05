
package codigospostales;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigosPostales {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashMap<Integer,String> ciudades = new HashMap();
        
        String opcion = "";
        
        do{
            System.out.println("Igrese un codigo postal y su ciudad");
            System.out.print("Codigo postal: ");
            int codigoPostal = read.nextInt();
            System.out.print("Nombre ciudad");
            String ciudad = read.next();
            ciudades.put(codigoPostal, ciudad);
            System.out.println("Desea ingresar otra ciudad?(s/n)");
            opcion = read.next();
        }while(opcion.equalsIgnoreCase("s"));
        
        for(Map.Entry ciud: ciudades.entrySet()){
            System.out.println("Codigo postal: " + ciud.getKey());
            System.out.println("Ciudad: " + ciud.getValue());
        }
        
        System.out.println("Ingrese un codigo postal para buscar entre las ciudades");
        int codigoNuevo = read.nextInt();
        
        boolean aux = true;
        
        for(Map.Entry ciud: ciudades.entrySet()){
            if(ciud.getKey().equals(codigoNuevo)){
                System.out.println("La ciudaded encontrada con ese codigo fue: " + ciud.getValue());
            }else{
                aux = false;
            }
        }
        
        if(!aux){
            System.out.println("No hubieron coicidencias de la ciudad con ese codigo postal.");
        }
        
        System.out.println("Ingrese el nombre de un codigo postal, para eliminar a ka ciudad de la lista");
        
        int removerCiudad = read.nextInt();
        
        ciudades.remove(removerCiudad);
        
        
        
        
    }
    
}
