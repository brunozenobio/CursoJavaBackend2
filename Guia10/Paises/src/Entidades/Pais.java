/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author brunopc
 */
public class Pais implements Comparable<Pais>{/*IMPLEMETO EL COMPARABLE PARA PERMITIR COMPARAR AL OBJETO CON OTRO DE LA MISMA CLASE*/
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /* GENERO UN VALOR NUMERICO PARA ASIGNAR AL OBJETO EN FUNCION DE SUS
    ATRIBUTOS PARA Y RETORNO ESE VALOR*/
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    
    /*VERIFICA SI SON IUALES DOS OBJETOS EL THIS Y EL DEL PARAMETRO  */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
        /*IMPLEMENTO EL METODO ABSTRACTO compareTo LE PASA UN OBJETO POR PARAMTRO Y LO COMPARO CON EL THIS*/
    @Override
    public int compareTo(Pais p) {
        return this.nombre.compareTo(p.getNombre());
    }
    
    
    
}
