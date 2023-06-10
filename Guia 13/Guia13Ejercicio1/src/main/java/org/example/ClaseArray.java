package org.example;

public class ClaseArray {
    private String[] array;

    public ClaseArray() {
        array = new String[5];
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void ingresarElemento(String elemento,int indice) throws ArrayIndexOutOfBoundsException{
        this.array[indice] = elemento;
    }

}
