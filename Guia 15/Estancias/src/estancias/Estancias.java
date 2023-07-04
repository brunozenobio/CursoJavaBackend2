/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estancias;

import estancias.servicios.CasaServicio;
import estancias.servicios.ClienteServicio;
import estancias.servicios.FamiliaServicio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class Estancias {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        
        FamiliaServicio fs  = new FamiliaServicio();
        CasaServicio cs = new CasaServicio();
        ClienteServicio cls = new ClienteServicio();
        cs.casaPorPais();
        
    }
    
}
