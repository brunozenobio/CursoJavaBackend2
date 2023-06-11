package org.example.entities;

public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int resistencia;
    private int salud;
    private float bateria;
    private Bota botaDerecha;
    private Bota botaIzquierda;
    private Guante guanteDerecho;
    private Guante guanteIzquierdo;
    private Casco casco;

    public Armadura() {
        this.bateria = Float.MAX_VALUE;
        this.botaDerecha = new Bota();
        this.botaIzquierda = new Bota();
        this.guanteDerecho = new Guante();
        this.guanteIzquierdo = new Guante();


    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public Bota getBotaDerecha() {
        return botaDerecha;
    }

    public void setBotaDerecha(Bota botaDerecha) {
        this.botaDerecha = botaDerecha;
    }

    public Bota getBotaIzquierda() {
        return botaIzquierda;
    }

    public void setBotaIzquierda(Bota botaIzquierda) {
        this.botaIzquierda = botaIzquierda;
    }

    public Guante getGuanteDerecho() {
        return guanteDerecho;
    }

    public void setGuanteDerecho(Guante guanteDerecho) {
        this.guanteDerecho = guanteDerecho;
    }

    public Guante getGuanteIzquierdo() {
        return guanteIzquierdo;
    }

    public void setGuanteIzquierdo(Guante guanteIzquierdo) {
        this.guanteIzquierdo = guanteIzquierdo;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }
}
