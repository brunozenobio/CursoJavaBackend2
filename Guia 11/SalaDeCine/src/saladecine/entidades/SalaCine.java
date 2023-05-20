/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saladecine.entidades;

/**
 *
 * @author brunopc
 */
public class SalaCine {
    private Pelicula peliluca;
    private Asiento[][] asientos;

    public SalaCine() {
        this.asientos = new Asiento[8][6];
    }

    public Pelicula getPeliluca() {
        return peliluca;
    }

    public void setPeliluca(Pelicula peliluca) {
        this.peliluca = peliluca;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
    
    
}
