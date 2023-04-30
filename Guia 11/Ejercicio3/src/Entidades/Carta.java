package Entidades;
import Enum.*;
public class Carta {
    private Palo paloCarta;
    private NumeroCarta numero;

    public Carta() {
    }

    public NumeroCarta getNumero() {
        return numero;
    }

    public void setNumero(NumeroCarta numero) {
        this.numero = numero;
    }

    public Palo getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(Palo paloCarta) {
        this.paloCarta = paloCarta;
    }


    @Override
    public String toString() {
        return "Carta{" +
                "paloCarta=" + paloCarta +
                ", numero=" + numero +
                '}';
    }
}
