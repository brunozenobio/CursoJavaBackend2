
package extrahoteles.entidades;

public class Camping extends AlojExtra{
    private int capaMaxCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capaMaxCarpas, int cantBanios, boolean restaurante, boolean privado, double area, String nombre, String direccion, String localidad, Gerente gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.capaMaxCarpas = capaMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public Camping(int capaMaxCarpas, int cantBanios, boolean restaurante) {
        this.capaMaxCarpas = capaMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }
    

    public int getCapaMaxCarpas() {
        return capaMaxCarpas;
    }

    public void setCapaMaxCarpas(int capaMaxCarpas) {
        this.capaMaxCarpas = capaMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    
    
}
