/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import estancias.persistencia.CasaDaoExt;
import estancias.persistencia.ClienteDaoExt;
import java.util.Collection;

/**
 *
 * @author brunopc
 */
public class ClienteServicio {
    CasaDaoExt cdao = new CasaDaoExt();
    ClienteDaoExt cldao = new ClienteDaoExt();
    public void clienteEstancia() throws Exception{
        try {
            Collection<Casa> clienCasas = cdao.clienCasas();
            System.out.println("Los clientes que realizaron estancia en una casa son: ");
            System.out.println("----------------------------");
            
            for (Casa var : clienCasas) {
                System.out.println("Cliente: ");
                System.out.println("");
                Cliente buscarPorCasa = cldao.buscarPorCasa(var);
                System.out.println(buscarPorCasa.toString());
                System.out.println("Casa: ");
                System.out.println("");
                System.out.println(var.toString());
                System.out.println("----------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;

        }
        
        
        
        
        
    }
}
