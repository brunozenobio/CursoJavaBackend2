package org.example.services;

import org.example.entities.Armadura;

import java.util.Random;

public class JarvisService {

    //DISEÑANDO ARMADURA
    public Armadura crearArmadura(){
        Armadura a = new Armadura();
        System.out.println("Iniciando sistema de armadura");
        a.setSalud(100);
        System.out.println("Salud:   100" );
        System.out.println("Resistencia:  10");
        a.setResistencia(10);
        System.out.println("Color primario:   rojo");
        System.out.println("Color secundario:   negro");

        a.setColorPrimario("Rojo");
        a.setColorSecundario("Negro");
        System.out.println("Carga de la bateria:  " + a.getBateria());
        System.out.println("Generando bota derecha");
        System.out.println("Generando bota izquierda");
        System.out.println("Generando guante derecho");
        System.out.println("Generando guante izquierdo");
        System.out.println("Totdos los sistemas estan en funcionamiento");
        a.getBotaDerecha().setConsumo(a.getBateria()* 0.001f);
        a.getBotaIzquierda().setConsumo(a.getBateria()* 0.001f);
        a.getBotaIzquierda().setDaniado(false);
        a.getBotaDerecha().setDaniado(false);
        a.getGuanteDerecho().setConsumo(a.getBateria()* 0.002f);
        a.getGuanteIzquierdo().setConsumo(a.getBateria()* 0.002f);
        a.getGuanteIzquierdo().setDaniado(false);
        a.getGuanteDerecho().setDaniado(false);
        a.getCasco().getConsola().setConsumo(a.getBateria()* 0.001f);
        a.getCasco().getSintetizador().setConsumo(a.getBateria()* 0.001f);
        a.getCasco().setDaniado(false);
        System.out.println("Totdos los sistemas estan en funcionamiento");
        return a;
    }

    //DESPLAZAMIENTO

    public float caminar(Armadura a,float tiempo){
        // verificar cantidad disponible de bateria
        if(sufrirDanio(a) < 30 && sufrirDanio(a)<30){
            a.getBotaDerecha().setDaniado(true);
            a.getBotaIzquierda().setDaniado(true);
            consumoConsola(a);
            System.out.println("Las botas estan dañadas");
            return 0;
        }
        return (a.getBotaDerecha().getConsumo() + a.getBotaIzquierda().getConsumo())  * tiempo;
    }
    public float correr(Armadura a,float tiempo){
        //Verificar daños
        // verificar cantidad disponible de bateria
        if(sufrirDanio(a) < 30 && sufrirDanio(a)<30){
            a.getBotaDerecha().setDaniado(true);
            a.getBotaIzquierda().setDaniado(true);
            consumoConsola(a);
            System.out.println("Las botas estan dañadas.");
            return 0;
        }
        return  (a.getBotaDerecha().getConsumo() + a.getBotaIzquierda().getConsumo())  * tiempo * 2;
    }

    public float propulsarse(Armadura a,float tiempo){
        //Verificar daños
        // verificar cantidad disponible de bateria
        if(sufrirDanio(a) < 30 || sufrirDanio(a)<30){
            a.getBotaDerecha().setDaniado(true);
            a.getBotaIzquierda().setDaniado(true);
            consumoConsola(a);
            System.out.println("Las botas estan bañdas");
            return 0;
        }
        if(sufrirDanio(a) < 30 || sufrirDanio(a)<30){
            a.getGuanteIzquierdo().setDaniado(true);
            a.getGuanteDerecho().setDaniado(true);
            consumoConsola(a);
            System.out.println("Los guantes estan dañados.");
            return 0;
        }
        return  (a.getBotaDerecha().getConsumo() + a.getBotaIzquierda().getConsumo())  * tiempo * 3;
    }

    public float volar(Armadura a, float tiempo) {
        //Verificar daños
        // verificar cantidad disponible de bateria
        if(sufrirDanio(a) < 30 || sufrirDanio(a)<30){
            a.getBotaDerecha().setDaniado(true);
            a.getBotaIzquierda().setDaniado(true);
            consumoConsola(a);
            System.out.println("Las botas estan bañdas");
            return 0;
        }
        if(sufrirDanio(a) < 30 || sufrirDanio(a)<30){
            a.getGuanteIzquierdo().setDaniado(true);
            a.getGuanteDerecho().setDaniado(true);
            consumoConsola(a);
            System.out.println("Los guantes estan dañados.");
            return 0;
        }
        return  ((a.getBotaDerecha().getConsumo() + a.getBotaIzquierda().getConsumo())  * 3 + 2 * (a.getGuanteDerecho().getConsumo()
        + a.getGuanteIzquierdo().getConsumo())) * tiempo;
    }

    //llamar cada vez que hay que mostar en consola //FALTAN DESDEE ACA COMPROBAR EL DAÑO
    public float consumoConsola(Armadura a){

        return a.getCasco().getConsola().getConsumo();
    }
    public float consumoSintetizador(Armadura a){
        return a.getCasco().getSintetizador().getConsumo();
    }

    public void consumoDeBateria(float consumo,Armadura a){
        a.setBateria(a.getBateria() - consumo);
    }

    public void mostarEstado(Armadura a){
        System.out.println("Informe del sistema");
        System.out.println("Armadura:  ");
        System.out.println("Color primario:  " + a.getColorPrimario());
        System.out.println("Color primario:  " + a.getColorSecundario());
        System.out.println("Resistencia:  " + a.getResistencia());
        System.out.println("Salud:  " + a.getSalud());
        System.out.println("Bota derecha: ");
        System.out.println("Estado: " + a.getBotaDerecha().isDaniado());
        System.out.println("Bota izquierda: ");
        System.out.println("Estado: " + a.getBotaIzquierda().isDaniado());
        System.out.println("Guante derech: ");
        System.out.println("Estado: " + a.getGuanteDerecho().isDaniado());
        System.out.println("Guante izquierdo: ");
        System.out.println("Estado: " + a.getGuanteIzquierdo().isDaniado());
        System.out.println("Casco: ");
        System.out.println("Estado: " + a.getCasco().isDaniado());


        consumoDeBateria(consumoConsola(a),a);
        if(sufrirDanio(a) < 30){
           a.getCasco().setDaniado(true);
        }
    }
    public void estadoBateria(Armadura a){
        System.out.println("Bateria del sistema: " + a.getBateria() * 100 / Float.MAX_VALUE);
        consumoDeBateria(consumoConsola(a),a);
        if(sufrirDanio(a) < 30){
            a.getCasco().setDaniado(true);
        }
    }
    //MOSTRAR BATERIA EN DOS UNIDADES MAS


    public float sufrirDanio(Armadura a){
        Random rand = new Random();
        return rand.nextFloat(100) + 1;

    }





    






}
