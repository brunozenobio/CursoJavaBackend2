
package areaformas.entidades;

import areaformas.interfaces.calculosFormas;

public class Cuadrado implements calculosFormas{
    
    private double base;
    private double altura;

    public Cuadrado() {
    }

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public double calcularArea() {
        
        return base*altura;
        
    }

    @Override
    public double calcularPermietro() {
        return 2 * base + 2 * altura;
    }
    
    
    
}
