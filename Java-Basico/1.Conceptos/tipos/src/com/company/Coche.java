package com.company;

public class Coche {

    String marca;

    public Coche() {}
    public Coche(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                '}';
    }

}
