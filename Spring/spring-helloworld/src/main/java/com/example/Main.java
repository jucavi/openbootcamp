package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Opción 1: Crear un objeto de forma normal
        CalculatorService service = new CalculatorService();

        // Opción 2: Recibir un objeto de Spring
        CalculatorService springService = (CalculatorService) context.getBean("calculatorService");


        CalculatorService calculadora = (CalculatorService) context.getBean("calculatorService");
        String texto = calculadora.holaMundo();
        System.out.println(texto);

        CalculatorService calculadora2 = (CalculatorService) context.getBean("calculatorService");
        String texto2 = calculadora2.holaMundo();
        System.out.println(texto2);

        System.out.println(calculadora + " " + calculadora2);


        // EJEMPLO 2
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");

        System.out.println(
                "Ejecutando CalculadoraService desde GestorFacturas "
                + "'" + gestor.calculatorService.holaMundo() + "'"
                + " con nombre " + gestor.name
        );
        System.out.println("Objeto CalculatorService en GestorFacturas " + gestor.calculatorService);
    }
}
