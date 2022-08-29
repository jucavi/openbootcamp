package com.company;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {
        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que lee nimbres de concola y verifica que tengan la misma longitud igual o mayor que 8 caracteres
     * @throws NameFormatException
     */
    public static void leerNombres() throws NameFormatException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre:");
            String nombre = teclado.nextLine();

            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException("El nombre debe contener al menos 8 caracteres");
            }
        }
        teclado.close();
    }

}
