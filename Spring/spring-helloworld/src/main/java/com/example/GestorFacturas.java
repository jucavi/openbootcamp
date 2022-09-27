package com.example;

public class GestorFacturas {

    // 1. Atributos
    CalculatorService calculatorService;
    String name;

    // 2. Constructor
    public GestorFacturas(CalculatorService calculatorService, String name) {
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculatorService = calculatorService;
        this.name = name;
    }

    // 3. Métodos ...
}
