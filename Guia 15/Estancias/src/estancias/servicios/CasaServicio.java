/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.entidades.Casa;
import estancias.persistencia.CasaDaoExt;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brunopc
 */
public class CasaServicio {

    Scanner read = new Scanner(System.in);
    CasaDaoExt cdao = new CasaDaoExt();

    public void casas1_31() throws Exception {
        try {
            Collection<Casa> casasDisponibles1_31 = cdao.casasDisponibles1_31();
            System.out.println("Las casas que hay con fecha disponible entre el 1 y 31 de agosto de 2020 son");
            System.out.println("----------------------------");
            if (casasDisponibles1_31.isEmpty()) {
                System.out.println("No hay casas disponibles entre el 1 y el 31 de agosto de 2020.");
            } else {
                // Imprimir las casas
            }
            for (Casa var : casasDisponibles1_31) {
                System.out.println(var.toString());
                System.out.println("----------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;

        }

    }

    public void casaFecha() throws Exception {
        try {
            System.out.println("Ingrese la fecha en la que desea el hospedaje y el numero maximo de dias");
            System.out.print("Fehca(YYYY-MM-DD): ");
            String fecha = read.nextLine();
            LocalDate fechaNueva = LocalDate.parse(fecha);
            Date date = Date.from(fechaNueva.atStartOfDay(ZoneId.systemDefault()).toInstant());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = dateFormat.format(date);
            System.out.print("Numero de dias de hospedaje?: ");
            int numeroDias = read.nextInt();
            Collection<Casa> casasDisponibles = cdao.casasFecha(fechaFormateada, numeroDias);
            System.out.println("------------------------");
            for (Casa var : casasDisponibles) {
                System.out.println(var.toString());
                System.out.println("----------------------------");
            }

        } catch (Exception e) {
            throw e;
        }

    }
    public void casaPorPais() throws Exception{
        try {
            Collection<Collection<String>> numeroDeCasasPorPais = cdao.numeroDeCasasPorPais();
            System.out.println("Numero de casas por pais:");
            for(Collection<String> var:numeroDeCasasPorPais){
                System.out.println(var);
            }
            
        } catch (Exception e) {
            throw  e;
        }
    }

}
