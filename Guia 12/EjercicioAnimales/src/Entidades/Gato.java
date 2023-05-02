package Entidades;

public class Gato implements  AnimalIn{
    private String raza;

    public Gato() {

    }

    @Override
    public void hacerRuido(){
        System.out.println("MIAU");
    }

}
