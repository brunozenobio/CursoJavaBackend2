/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author brunopc
 */
public class PaisService {
    private  TreeSet<String> paises = new TreeSet();
    
    public  void crearPaises(){
       
        Scanner read = new Scanner(System.in);
        String opcion = "";
        do{
            System.out.println("Se cargaran nombres de paises");
            System.out.print("Nombre: ");
            paises.add(read.next());
            System.out.println("Desea agregar otro pais s/n");
            opcion = read.next();
        }while(opcion.equalsIgnoreCase("s"));
        
    }
    
    public void mostrarPaises(){
        for(String pais:paises){
            System.out.println("Pais: " + pais);
        }
        
    }
    
    public void elimarPais(){
        boolean aux = true;
        Scanner read = new Scanner(System.in);
         System.out.println("Digite el nombre de un pais, si esta se quitara de la lista");
        String nombre = read.next();
        
        Iterator itPais = paises.iterator();
        
        while(itPais.hasNext()){
            if(itPais.next().equals(nombre)){
                itPais.remove();
            }else{
                aux = false;
            }
        }
        
        if(!aux){
            System.out.println("El pais no se encontro en la lista");
        }else{
            System.out.println("El pais " + nombre + " fue eliminado");
        }
        
    }
    
    
    
}
