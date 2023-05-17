
package ejercicio2_ultimo.entidades;

public class Revolver {
    private int posicionActual;
    private int posicionDelAgua;

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDelAgua() {
        return posicionDelAgua;
    }

    public void setPosicionDelAgua(int posicionDelAgua) {
        this.posicionDelAgua = posicionDelAgua;
    }
    
    //METODOS
    
    public void llenarRevolver(){
        posicionActual = (int) (Math.random()*6 + 1);
        posicionDelAgua = (int) (Math.random()*6 + 1);
    }
    
    public boolean mojar(){
        return posicionActual == posicionDelAgua;
    }
    
    public void siguienteChorro(){
        if(posicionActual == 6){
            posicionActual = 1;
        }else{
            posicionActual++;
        }
        
        
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionDelAgua=" + posicionDelAgua + '}';
    }
    
    
}
 