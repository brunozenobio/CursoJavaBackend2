
package areaformas.entidades;

import areaformas.interfaces.calculosFormas;

public class Circulo implements calculosFormas{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        
        return calculosFormas.pi*(Math.pow(radio, 2));
    }

    @Override
    public double calcularPermietro() {
        return 2 * calculosFormas.pi*radio;
    }
    
    
    
}
