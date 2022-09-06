package com.company;

public class Reverse {

    public static void main(String[] args) {
        String reversed = reverse("Text a revertir");
        System.out.println(reversed);
    }

    public static String reverse(String texto) {
        StringBuilder reversed = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversed.append(texto.charAt(i));
        }
        return reversed.toString();
    }
}
