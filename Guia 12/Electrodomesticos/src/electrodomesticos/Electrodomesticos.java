/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

import electrodomesticos.entidades.Electrodomestico;
import electrodomesticos.entidades.Lavadora;
import electrodomesticos.entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author brunopc
 */
public class Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        televisor.precioFinal(); 
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();;
        Televisor televisor2 = new Televisor();
        televisor.crearTelevisor();
        Lavadora lavadora2 = new Lavadora();
        lavadora.crearLavadora();;

        double sumaLavadoras = 0;
        double sumaTelevisores = 0;
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(televisor);
        electrodomesticos.add(lavadora);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor2);

        for (Electrodomestico var : electrodomesticos) {
            if (var instanceof Televisor) {
                System.out.println("El precio final del  televisor es: ");
                var.precioFinal();
                sumaTelevisores += var.getPrecio();
                continue;
            }
            if (var instanceof Lavadora) {
                System.out.println("El precio final de la lavadora es: ");
                var.precioFinal();
                System.out.println(var.getConsomuEnergetico());
                sumaLavadoras += var.getPrecio();
                continue;

            }
        }
        
        System.out.println("El precio final de todas las lavoras es: " + sumaLavadoras);
        System.out.println("El precio final de todos los televisores es: " + sumaTelevisores);
        System.out.println("La suma de los electrodomesticos es: " + sumaLavadoras + sumaTelevisores);
    }   

}
