package com.company;

public class Funciones {

    public static void main(String[] args) {
        holaMundo();
        holaMundo("Juan");
        holaMundo("Juan", "Carlos");

        String hola = devolcerHolaMundo("Alberto");
    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde un método");
    }

    // Sobrecarga
    private static void holaMundo(String name) {
        System.out.println("Hola " + name + " desde un método");
    }

    private static void holaMundo(String name, String surname) {
        System.out.println("Hola " + name + " " + surname + " desde un método");
    }

    private static String devolcerHolaMundo(String name) {
        return "Hola " + name + " desde un método";
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}

