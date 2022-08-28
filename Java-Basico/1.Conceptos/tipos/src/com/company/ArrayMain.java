package com.company;

public class ArrayMain {
    public static void main(String[] args) {

        String[] letras1 = new String[4];
        String[] letras2 = new String[] { "a", "b", "c", "d"};

        int[] numeros =  new int[4];
        Coche[] coches = new Coche[4];

        letras1[0] = "a";
        letras1[1] = "b";
        letras1[2] = "c";
        letras1[3] = "d";

        letras1[1] = "e";

        for (int i = 0; i < letras1.length; i++) {
            System.out.println(letras1[i]);
        }

        // el mismo for
        for (String nombre : letras1) {
            System.out.println(nombre);
        }

    }
}
