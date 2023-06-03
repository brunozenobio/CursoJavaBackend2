
package extrahoteles.entidades;

public final class Residencias extends AlojExtra{
    
    private int cantHabitacions;
    private boolean descGremios;
    private boolean campoDeportivo;

    public Residencias(int cantHabitacions, boolean descGremios, boolean campoDeportivo, boolean privado, double area, String nombre, String direccion, String localidad, Gerente gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.cantHabitacions = cantHabitacions;
        this.descGremios = descGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(int cantHabitacions, boolean descGremios, boolean campoDeportivo) {
        this.cantHabitacions = cantHabitacions;
        this.descGremios = descGremios;
        this.campoDeportivo = campoDeportivo;
    }
    
    
    
}
