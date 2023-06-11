package org.example.entities;

public class Casco {
    private Consola consola;
    private Sintetizador sintetizador;
    private boolean daniado;

    public Casco() {
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }
}
