package com.company;

public abstract class Coche {

    // atributos
    String color;
    String modelo;
    String fabricante;
    Double peso;
    Double largo;
    int velocidad = 0;


    // constructores
    public Coche() {

    }

    public Coche(String color, String modelo, String fabricante, Double peso, Double largo) {
        this.color = color;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
    }

    // comportamiento
    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
