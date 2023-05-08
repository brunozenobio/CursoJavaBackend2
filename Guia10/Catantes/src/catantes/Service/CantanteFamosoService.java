
package catantes.Service;

import catantes.Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;


public class CantanteFamosoService {
    
    public static CantanteFamoso agregarCantante(String nombre,String discm){
        return new CantanteFamoso(nombre,discm);
    }
    
    public static void mostrar(ArrayList<CantanteFamoso> listaCantantes){
         for (CantanteFamoso var : listaCantantes) {
            System.out.println("Cantante: '" + var.getNombre() + "' , Disco con mas ventas: '" + var.getDiscoConMasVentas() + "'");
        }
    }
    
    public static void mostrarCantantes(ArrayList<CantanteFamoso> listaCantantes){
         for (CantanteFamoso var : listaCantantes) {
            System.out.println("Cantante: '" + var.getNombre() + "'");
        }
    }
    
    
    public static void delete(String nombre,ArrayList<CantanteFamoso> listaCantantes){
        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        
        while(it.hasNext()){
            if(it.next().getNombre().equals(nombre)){
                it.remove();
            }
        }
        System.out.println("Cantante " + nombre + " removido");
        
        
    }
}
