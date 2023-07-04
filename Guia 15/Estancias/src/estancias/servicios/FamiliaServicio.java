/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDaoExt;
import java.util.Collection;

/**
 *
 * @author brunopc
 */
public class FamiliaServicio {
    FamiliaDaoExt fdao = new FamiliaDaoExt();
    
    public void familia3_10(){
        try {
            Collection<Familia> consultarFamilia3Y10 = fdao.consultarFamilia3Y10();
            System.out.println("Las familias que tienen mas de 3 hijos con menos de 10 años son");
            System.out.println("---------------");
            for(Familia var:consultarFamilia3Y10){
                System.out.println("ID familia: " + var.getId_familia());
                System.out.println("Nombre:" + var.getNombre());
                System.out.println("Edad maxima: " + var.getEdad_maxima());
                System.out.println("Edad minima: " + var.getEdad_minima());
                System.out.println("Numero de hijos: " + var.getNum_hijos());
                System.out.println("Email:" + var.getEmail());
                System.out.println("ID casa de familia: " + var.getId_casa_familia());
                System.out.println("---------------");
            }
            
        } catch (Exception e) {
        }
    }
    public void familiaConHotmail(){
        try {
            Collection<Familia> consultarFamilia3Y10 = fdao.consultarHotmail();
            System.out.println("Las familias que tienen hotmail son: ");
            System.out.println("---------------");
            for(Familia var:consultarFamilia3Y10){
                System.out.println("ID familia: " + var.getId_familia());
                System.out.println("Nombre:" + var.getNombre());
                System.out.println("Edad maxima: " + var.getEdad_maxima());
                System.out.println("Edad minima: " + var.getEdad_minima());
                System.out.println("Numero de hijos: " + var.getNum_hijos());
                System.out.println("Email:" + var.getEmail());
                System.out.println("ID casa de familia: " + var.getId_casa_familia());
                System.out.println("---------------");
            }
            
        } catch (Exception e) {
        }
    }
    
}
