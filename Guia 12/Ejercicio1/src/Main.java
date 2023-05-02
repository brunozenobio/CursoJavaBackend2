import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Main {
    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.Alimentarse();
        Animal perro2= new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.Alimentarse();
        Animal gato1 = new Gato("Pelusa","Galletas",15,"Siames");
        gato1.Alimentarse();
        Animal caballo1 = new Caballo("Sparw","Pasto",25,"Fino");
        caballo1.Alimentarse();

    }
}