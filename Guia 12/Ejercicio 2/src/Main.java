import Entidades.Electrodomesticos;
import Entidades.Lavador;
import Entidades.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println(televisor);
        televisor.precioFinal();
        Lavador lavadora = new Lavador();
        lavadora.crearLavadora();
        System.out.println(lavadora);
        lavadora.precioFinal();

    }
}