package Entidades;

public class Perro extends  Animal {
    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Especia: Perro");
        System.out.println("Raza: " + super.raza);
        System.out.println("Nombre: " +super.nombre);
        System.out.println("Edad: " + super.edad);
        System.out.println("Alimento: " + super.alimento);
    }
}
