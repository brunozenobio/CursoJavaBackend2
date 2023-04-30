import Entidades.*;
import java.util.*;
import Enum.*;
public class Main {

    public static void main(String[] args) {
        Baraja nuevaBaraja = new Baraja();
        ArrayList<Carta> auxCartas= new ArrayList<>();
        for(NumeroCarta var: NumeroCarta.values()){
            for(Palo var2: Palo.values()){

                Carta nuevaCarta = new Carta();
                nuevaCarta.setNumero(var);
                nuevaCarta.setPaloCarta(var2);
                auxCartas.add(nuevaCarta);
            }

        }

        nuevaBaraja.setCartas(auxCartas);
        nuevaBaraja.setCartasDisponibles(nuevaBaraja.getCartas());
        nuevaBaraja.mostrarBaraja();


        nuevaBaraja.cartaCDisponibles();
        nuevaBaraja.siguienteCarta();
        nuevaBaraja.darCartas();
        nuevaBaraja.cartasMonton();
        nuevaBaraja.darCartas();
        nuevaBaraja.cartasMonton();
        nuevaBaraja.cartaCDisponibles();
        nuevaBaraja.mostrarBaraja();

    }
}