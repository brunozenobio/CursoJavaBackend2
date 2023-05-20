
package saladecine.entidades;

public class Persona {
    private String nombre;
    private int edad;
    private double dineroDisponble;

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, int edad, double dineroDisponble) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponble = dineroDisponble;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisponble() {
        return dineroDisponble;
    }

    public void setDineroDisponble(double dineroDisponble) {
        this.dineroDisponble = dineroDisponble;
    }
    
    
    
}
