package com.company;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {

            count++; // condición de salida
            if (count == 6)
                continue; // salta todas las instrucciones posteriores y continua a la siguiente iteración

            if (count == 8)
                break; // rompe el flujo de ejecución saliendo del bucle

            System.out.println("Iteración " + count);

        }
        System.out.println("fin");
    }
}
