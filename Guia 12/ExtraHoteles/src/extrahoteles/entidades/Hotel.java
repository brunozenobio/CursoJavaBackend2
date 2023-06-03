
package extrahoteles.entidades;

public class Hotel extends Alojamiento{
    
    protected int cantHabitacions;
    protected int cantCamas;
    protected int cantPisos;
    protected double precioDeHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitacions, int cantCamas, int cantPisos, double precioDeHabitacion, String nombre, String direccion, String localidad, Gerente gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitacions = cantHabitacions;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioDeHabitacion = precioDeHabitacion;
    }

    public Hotel(int cantHabitacions, int cantCamas, int cantPisos, double precioDeHabitacion) {
        this.cantHabitacions = cantHabitacions;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioDeHabitacion = precioDeHabitacion;
    }
    

    

    public int getCantHabitacions() {
        return cantHabitacions;
    }

    public void setCantHabitacions(int cantHabitacions) {
        this.cantHabitacions = cantHabitacions;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioDeHabitacion() {
        return precioDeHabitacion;
    }

    public void setPrecioDeHabitacion(double precioDeHabitacion) {
        this.precioDeHabitacion = precioDeHabitacion;
    }
    
    public void calcularPrecioHabitacion(){
        precioDeHabitacion = 50d + cantCamas;
    }
    
    
    
}
