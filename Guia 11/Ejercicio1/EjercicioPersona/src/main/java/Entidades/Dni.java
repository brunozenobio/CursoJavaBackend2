/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author brunopc
 */
public class Dni {
    private Integer num;
    private char serie;

    public Dni() {
    }

    public Dni(Integer num, char serie) {
        this.num = num;
        this.serie = serie;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }
    
    
}
