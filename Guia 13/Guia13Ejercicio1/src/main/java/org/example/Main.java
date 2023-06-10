package org.example;

public class Main {
    public static void main(String[] args) {
        ClaseArray claseArray = new ClaseArray();
        claseArray.getArray()[0] = "hello";
        claseArray.getArray()[1] = "world";
        claseArray.getArray()[2] = "adios";
        claseArray.getArray()[3] = "bruno";
        claseArray.getArray()[4] = "angela";
        try {
            claseArray.ingresarElemento("re",6);

        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Error al ingresar el elemento");
        }
        System.out.println("Hola");
    }
}