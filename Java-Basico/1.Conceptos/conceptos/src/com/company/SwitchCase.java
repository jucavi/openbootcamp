package com.company;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "Sunny";

        switch (weather) {
            case "sunny":
                System.out.println("El tiempo está soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo está nublado");
                break;
            default:
                System.out.println("No es posible identificar el clima");
        }
    }
}
