package com.company;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un nombre");
        String nombre = scanner.nextLine();

        System.out.println("----------------");
        System.out.println("Introduzca un numero");
        int numero = scanner.nextInt();

        System.out.println("El nombre es " + nombre);
        System.out.println("El numero es " + numero);
    }
}
