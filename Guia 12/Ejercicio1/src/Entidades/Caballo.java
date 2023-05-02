package Entidades;

public class Caballo extends  Animal{
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    @Override
    public void Alimentarse() {
        System.out.println("Especie: Caballo");
        System.out.println("Raza: " + this.raza);
        System.out.println("Nombre: " +super.nombre);
        System.out.println("Edad: " + super.edad);
        System.out.println("Alimento: " + super.alimento);
    }
}
