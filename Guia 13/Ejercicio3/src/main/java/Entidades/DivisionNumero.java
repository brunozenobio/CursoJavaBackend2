/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author brunopc
 */
public class DivisionNumero {
    private int numeroA;
    private int numeroB;

    public DivisionNumero() {
    }

    public DivisionNumero(int  numeroA, int numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public int  getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }
    
    public int dividir(){
        int resu;
        try{
            resu = numeroA / numeroB;
        }catch(Exception e){
            System.out.println("Error al dividir por " + e.getMessage());
        }
        return numeroA / numeroB;
    }
    
}
