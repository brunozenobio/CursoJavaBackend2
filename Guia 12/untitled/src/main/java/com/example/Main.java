package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CalculatorService calcular = (CalculatorService) context.getBean("calculatorService");
        String hola = calcular.holaMundo();
        System.out.println(hola);
    }
}
