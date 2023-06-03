
package extrahoteles.entidades;

public final class Hotel5 extends Hotel4{
    private int cantSalonesConferencia;
    private int cantSuits;
    private int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalonesConferencia, int cantSuits, int cantLimosinas, String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitacions, int cantCamas, int cantPisos, double precioDeHabitacion, String nombre, String direccion, String localidad, Gerente gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitacions, cantCamas, cantPisos, precioDeHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuits = cantSuits;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(int cantSalonesConferencia, int cantSuits, int cantLimosinas) {
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuits = cantSuits;
        this.cantLimosinas = cantLimosinas;
    }
    

    
    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuits() {
        return cantSuits;
    }

    public void setCantSuits(int cantSuits) {
        this.cantSuits = cantSuits;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
    @Override
    public void calcularPrecioHabitacion(){
        super.calcularPrecioHabitacion();
        precioDeHabitacion += 15 * cantLimosinas;
    }
    
    
    
}
