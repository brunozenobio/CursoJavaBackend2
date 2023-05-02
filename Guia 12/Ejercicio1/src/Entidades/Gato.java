package Entidades;

public class Gato extends  Animal {
    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Especia: Gato");
        System.out.println("Raza: " + super.raza);
        System.out.println("Nombre: " +super.nombre);
        System.out.println("Edad: " + super.edad);
        System.out.println("Alimento: " + super.alimento);
    }
}
