
package extrahoteles.entidades;

public class Hotel4 extends Hotel{
    protected String gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitacions, int cantCamas, int cantPisos, double precioDeHabitacion, String nombre, String direccion, String localidad, Gerente gerente) {
        super(cantHabitacions, cantCamas, cantPisos, precioDeHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4(String gimnasio, String nombreRestaurante, int capacidadRestaurante) {
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    
    

    public String isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
    
    @Override
    public void calcularPrecioHabitacion(){
        super.calcularPrecioHabitacion();
        if(capacidadRestaurante < 30){
            precioDeHabitacion += 10;
        }else if(capacidadRestaurante <= 50){
            precioDeHabitacion += 30; 
        }else{
            precioDeHabitacion += 50;
        }
        
        if(gimnasio.equalsIgnoreCase("A")){
            precioDeHabitacion += 50;
        }else if(gimnasio.equalsIgnoreCase("B")){
            precioDeHabitacion += 30;
        }
    }
    
}
