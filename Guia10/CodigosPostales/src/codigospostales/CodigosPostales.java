
package codigospostales;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigosPostales {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
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
        
        if(ciudades.containsKey(codigoNuevo)){
            System.out.println("La ciudad asociada al codigo " + codigoNuevo + " es " + ciudades.get(codigoNuevo)  );
            
        }else{
            System.out.println("No hubieron coicidencias de la ciudad con ese codigo postal.");
        }
        
        
        System.out.println("Ingrese el nombre de un codigo postal, para eliminar a la ciudad de la lista");
        
        int removerCiudad = read.nextInt();
        
        if(ciudades.containsKey(removerCiudad)){
            ciudades.remove(removerCiudad);
        }else{
            System.out.println("Codigo inexistente");
        }
        
        
        
        
    }
    
}
