package Entidades;

public class Perro implements  AnimalIn{
    private String  raza;

    public Perro() {
        this.raza = raza;
    }

    public Perro(String nombre, int edad, String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerRuido(){
        System.out.println("GUAW-GUAW");
    }
}
