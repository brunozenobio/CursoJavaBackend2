package Entidades;
import java.util.*;
import Enum.*;
public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasMonton;
    private ArrayList<Carta> cartasDisponibles;
    private Iterator<Carta> iteradorCartas;
    private Scanner read = new Scanner(System.in);

    public Baraja() {
        cartas = new ArrayList<>();
        cartasMonton = new ArrayList<>();
        iteradorCartas = cartas.iterator();
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }

    public ArrayList<Carta> getCartasDisponibles() {
        return cartasDisponibles;
    }

    public void setCartasDisponibles(ArrayList<Carta> cartas) {
        cartasDisponibles = cartas;
    }

    public void crearBaraja(){

    }
    public void barajar(){

    }
    public void siguienteCarta(){
        if(!iteradorCartas.hasNext()){
            System.out.println("No hay mas cartas para mostrar");
        }else{
            System.out.println("Proxima carta: " + iteradorCartas.next().toString());
        }

    }
    public int cartaCDisponibles(){
        return cartasDisponibles.size();
    }
    public ArrayList<Carta> darCartas(){

        //Creo un iterador para recorrer las cartas de la lista de cartas disponibles

        Iterator<Carta> iteradorCartasActuales = cartasDisponibles.iterator();
        //Consulto la cantidad de cartas a ingresar

        System.out.println("Ingrese una cantidad de cartas deseada");
        System.out.print("Cantidad: ");
        int cantidad = read.nextInt();

        //Inicio la lista de cartas que se dan

        ArrayList<Carta> cartasDadas = new ArrayList<>();
        int i = 0;

        //Pregunto si la cantida de cartas disponibles es menor  o no a la cantidad que desea el usuario

        if(cartasDisponibles.size() < cantidad){
            System.out.println("No hay esa cantidad de cartas para repartir");
        }else{

            //Si hay suficintes cartas recorro el iterador agrego la carta a la lista de retorno
            // ademas elimino la carta de cartas actuales y la agrego a las cartas del monton

            while(iteradorCartasActuales.hasNext()){
                Carta aux = iteradorCartasActuales.next();
                cartasDadas.add(aux);
                iteradorCartasActuales.remove();
                cartasMonton.add(aux);
                i++;
                if(i == cantidad){
                    break;
            }

        }


    }
        return cartasDadas;
}

public void cartasMonton(){
    System.out.println("Las cartas del monton que salieron de la baraja son: ");
    for(Carta var: cartasMonton){
        System.out.println(var.toString());

    }
}

public void mostrarBaraja(){
    System.out.println("Las cartas que aun quedan en la baraja son " + cartasDisponibles.size());
    for(Carta var: cartasDisponibles){
        System.out.println(var.toString());

    }
}
}