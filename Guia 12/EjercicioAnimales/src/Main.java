import Entidades.Animal;
import Entidades.AnimalIn;
import Entidades.Gato;
import Entidades.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AnimalIn> animales = new ArrayList<>();
        AnimalIn a = new Perro();
        AnimalIn c = new Gato();

        animales.add(a);
        animales.add(c);
        for(AnimalIn aux:animales){
            aux.hacerRuido();
        }
    }
}