package saladecine.servicios;

import java.util.Scanner;
import saladecine.entidades.Asiento;
import saladecine.entidades.Pelicula;
import saladecine.entidades.Persona;
import saladecine.entidades.SalaCine;

public class CineServices {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    //METODO PARA INICIAR LA SALA CREANDO LOS ASIENTOS CON LAS BUTACAS VACIA
    public SalaCine iniciarSala() {
        SalaCine sala = new SalaCine();
        String[] filas = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] columnas = {"A", "B", "C", "D", "E", "F"};
        Asiento[][] asientos = new Asiento[8][6];
        for (int i = 0; i < filas.length; i++) {
            for (int j = 0; j < columnas.length; j++) {
                Asiento asiento = new Asiento();
                asiento.setColumna(columnas[j]);
                asiento.setFila(filas[i]);
                asientos[i][j] = asiento;
            }
        }
        sala.setAsientos(asientos);
        return sala;

    }

    //METODO PARA MOSTAR LA SALA TENIENDO EN CUENTA SI HAY BUTACAS OCUPADAS
    public void mostrarSala(SalaCine sala) {
        System.out.println("Sala de Cine");
        int cont = 0;
        int cont2 = 0;
        
        for(int i = 0; i<9;i++){
            for(int j = 0;j<7;j++){
                if(i==0 && j== 0){
                    System.out.println(sala.getAsientos()[i][j].getFila());
                }
                if(i==0  && j<6){
                    System.out.print(" " + sala.getAsientos()[i][j].getColumna() + " ");
                }
                
                if(i > 0 && j > 0){
                    if(sala.getAsientos()[i-1][j-1].isOcupado()){
                    System.out.print("| X |");
                }else{
                    System.out.print("| |");
                }
                }
                
            }
            System.out.println("");
        }
        
//        for (Asiento[] fila : sala.getAsientos()) {
//            for (Asiento col : fila) {
//                if(cont ==0){
//                    System.out.print(col.getColumna() + " ");
//                }
//                if (col.isOcupado()) {
//                    System.out.print("| " + col.getFila() + " " + col.getFila() + "X |");
//                } else {
//                    System.out.print("| " + col.getFila() + " " + col.getColumna() + " |");
//                }
//                cont = 1;
//            }
//            cont2 = 1;
//            System.out.println("");
//        }
    }

    //VEREIFICAR SI UNA BUTACA PASADA POR PARAMETRO ESTA OCUPADA
    public boolean verificarButaca(SalaCine sala, String fil, String col) {
        for (Asiento[] fila : sala.getAsientos()) {
            for (Asiento columna : fila) {
                if (columna.getColumna().equalsIgnoreCase(col)
                        && columna.getFila().equalsIgnoreCase(fil)) {
                    if (columna.isOcupado()) {
                        return false;
                    } else {
                        return true;
                    }

                }

            }

        }
        System.out.println("Butaca inexistente");
        return false;
    }

    //RECIBE UNA FILA Y UNA COLUMNA Y DEVUELVE UN ARREGLO CON LOS INDICES DE LA 
    //MATRIZ DE ASIENTOS QUE ESTAN ASOCIADOS A LOS ATRIBUTOS FILA Y COLUMNA DE LA BUTACA
    public int[] devolverIndices(SalaCine sala, String fila, String columna) {
        int[] indices = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (sala.getAsientos()[i][j].getColumna().equalsIgnoreCase(columna)
                        && sala.getAsientos()[i][j].getFila().equalsIgnoreCase(fila)) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public void comprarEntrada(SalaCine sala, Persona persona) {

        System.out.println("Bievenido al sistema de cine para ver la pelicula " + sala.getPeliluca());
        System.out.println("La entrad cuesta " + sala.getPeliluca().getPrecio() + " pesos.");
        if (persona.getDineroDisponble() >= sala.getPeliluca().getPrecio()) {
            System.out.println("Las butacas mostradas con una X estan ocupadas");
            mostrarSala(sala);
            System.out.println("Que butaca desae elegir?");
            System.out.print("Fila: ");
            String fila = read.next();
            System.out.print("Columna: ");
            String colmna = read.next();
            if (verificarButaca(sala, fila, colmna)) {
                int[] indices = devolverIndices(sala, fila, colmna);
                sala.getAsientos()[indices[0]][indices[1]].setOcupado(true);
                System.out.println("");
                System.out.println("===========================");
                System.out.println("     ====TICKET====        ");
                System.out.println("Nombre persona: " + persona.getNombre());
                System.out.println("Pelicula: " + sala.getPeliluca().getNombre());
                System.out.println("Duracion: " + sala.getPeliluca().getDuracion());
                System.out.println("Precio: " + sala.getPeliluca().getPrecio());
                System.out.println("Butaca: \n"
                        + "Fila: " + sala.getAsientos()[indices[0]][indices[1]].getFila()
                        + "\n Columna: " + sala.getAsientos()[indices[0]][indices[1]].getColumna());
                System.out.println("============================");
            } else {
                System.out.println("Lo siento la butaca no esta disponible");
            }

        }

    }

    public Pelicula crearPelicula() {
        System.out.println("Creando pelicula");
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.print("Duracion(horas): ");
        double duracion = read.nextDouble();
        System.out.print("Precio de la entrada: ");
        double precio = read.nextDouble();
        return new Pelicula(nombre, duracion, precio);
    }
    
    public Persona crearPersona(){
         System.out.println("Creando Persona");
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.print("Edad: ");
        int edad = read.nextInt();
        System.out.print("Dinero disponible: ");
        double precio = read.nextDouble();
        return new Persona(nombre, edad, precio);
    }
}
