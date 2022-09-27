package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    // 1. Atributos
    CalculatorService calculatorService;
    @Value("Facturator 3000")
    String name;

    // 2. Constructor
    @Autowired
    public GestorFacturas(CalculatorService calculatorService) {
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculatorService = calculatorService;
    }
    public GestorFacturas(CalculatorService calculatorService, String name) {
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculatorService = calculatorService;
        this.name = name;
    }

    // 3. Métodos ...
}
