
package ejercicio1extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Extra {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList();
        
        System.out.println("Ingrese numeros:");
        
        int numero = 0;
        
        do {
            System.out.print("Numero: ");
            numero = read.nextInt();
            if(numero != -99){
                numeros.add(numero);
            }
            
            
        } while (numero != -99);
        
        System.out.println("Se han ingresado: " +  numeros.size());
        
        int suma = 0;
        
        for(Integer num:numeros){
            
            suma += num;
        }
        
        System.out.println("La suma de los valores de la lista es: " + suma);
        System.out.println("El promedio es: " + suma/numeros.size());
        
        
        
    }
    
}
