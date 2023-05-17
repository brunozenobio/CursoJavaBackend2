
package ejercicio2_ultimo.entidades;

public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.nombre = "Jugador " + id;
        mojado = false;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    //METODOS
    
    public boolean disparo(Revolver r){
        boolean mojado = r.mojar();
        this.mojado = mojado;
        r.siguienteChorro();
        return mojado;
        
    }
    
    
    
    
    
}
