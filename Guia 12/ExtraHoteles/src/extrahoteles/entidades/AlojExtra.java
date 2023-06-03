
package extrahoteles.entidades;

public class AlojExtra extends Alojamiento {
    protected boolean privado;
    protected double area;

    public AlojExtra() {
    }

    public AlojExtra(boolean privado, double area, String nombre, String direccion, String localidad, Gerente gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.area = area;
    }

    public AlojExtra(boolean privado, double area) {
        this.privado = privado;
        this.area = area;
    }
    

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    
}
