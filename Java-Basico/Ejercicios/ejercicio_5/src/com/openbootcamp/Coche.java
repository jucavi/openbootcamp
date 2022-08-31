package com.openbootcamp;

public class Coche {
    String marca;
    String modelo;
    String color;
    int numPuertas;

    public Coche() {};

    public Coche(String marca, String modelo, String color, int numPuertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPuertas = numPuertas;
    };

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numPuertas=" + numPuertas +
                '}';
    }
}
