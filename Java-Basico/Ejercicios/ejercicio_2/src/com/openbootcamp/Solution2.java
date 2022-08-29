package com.openbootcamp;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio");
        double precio = scanner.nextDouble();

        double precioFinal = precioIVA(precio);
        System.out.printf("Precio final con IVA: %.2f€\n", precioFinal);
    }

    private static double precioIVA(double precio) {
        return precio * (1 + (21.0 / 100));
    }
}
