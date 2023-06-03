
package areaformas;

import areaformas.entidades.Circulo;
import areaformas.entidades.Cuadrado;
import areaformas.interfaces.calculosFormas;

public class AreaFormas {

    public static void main(String[] args) {
       Circulo circulo = new Circulo();
       Cuadrado cuadrado = new Cuadrado();
       circulo.setRadio(5.2d);
        System.out.println("El area del ciculo de radio " + circulo.getRadio()
                +" es: " + circulo.calcularArea());
        System.out.println("Y su perimetro es " + circulo.calcularPermietro());
        cuadrado.setAltura(15.6d);
        cuadrado.setBase(4.6d);
        System.out.println("El area del cuadrado de altura "
                +  cuadrado.getAltura()
                +"y base " + cuadrado.getBase() + "es: " + cuadrado.calcularArea());
        System.out.println("Y su perimetro es " + cuadrado.calcularPermietro());
       
       
    }
    
}
