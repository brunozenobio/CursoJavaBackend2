/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author brunopc
 */
public class RevolverAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
        
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    public void llenarRevolver(){
        posicionActual = (int) (Math.random()*6 + 1);
        posicionAgua = (int) (Math.random()*6 + 1);
    }
    public boolean mojar(){
        return posicionActual == posicionAgua;
        
    }
    public void siguienteChorro(){
        if(posicionActual == 6){
            setPosicionActual(1);
        }else{
            setPosicionActual(getPosicionActual() + 1);
        }
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
