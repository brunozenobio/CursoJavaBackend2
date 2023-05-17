
package ejercicio2_ultimo.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private Scanner read = new Scanner(System.in);
    private List<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        jugadores = new ArrayList();
    }
    
    public List<Jugador> agregarJugadores(){
        System.out.println("Agregando la lista de los jugadores para el juego");
        System.out.print("Ingrese la cantidad de jugadores entre 1 y 6: ");
        int cantidadJug = read.nextInt();
        //GENERO LOS ATRIBUTOS DE LA CLASE
        List<Jugador> auxJug = new ArrayList();
        if(cantidadJug > 6 || cantidadJug < 1){
            cantidadJug = 6;
        }else{
            for (int i = 0; i < cantidadJug; i++) {
                Jugador jug = new Jugador(i);
                auxJug.add(jug);
            }
        }
        
        return auxJug;
    }
    
    public Revolver crearRevolver(){
        return new Revolver();
    }
    
    
    
    public void llenarJuego(List<Jugador> jugadores,Revolver r){
        this.jugadores = jugadores;
        this.revolver = r;
        
    }
    
    public void ronda(){
        List<Jugador> jugadores = agregarJugadores();
        Revolver rev = crearRevolver();
        llenarJuego(jugadores, rev);
        revolver.llenarRevolver();
        boolean perdedor;
        
        System.out.println("Se jugara a la ruleta rusa de agua, la cantidad de jugadores es " + this.jugadores.size());
        System.out.println("=================================");
        System.out.println("El juego inicia");
        System.out.println("=================================");
        for(int i = 1;i <= 6;i++){
            System.out.println("El jugador " + this.jugadores.get(i).getNombre() + " se apunta");
            perdedor = this.jugadores.get(i).disparo(revolver);
            if(perdedor){
                
                System.out.println("El jugador " + this.jugadores.get(i).getNombre() + " se mojó.");
                System.out.println("Fin del juego");
                System.out.println("===========================");
                
                break;
            }else{
                 System.out.println("El jugador " + this.jugadores.get(i).getNombre() + " se ah salvado.");
                 System.out.println("===========================");
            }
            
        }
    }
    
    
    
    
}
