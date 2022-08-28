package com.company;

public class CocheElectrico extends Coche{

    String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String color, String modelo, String fabricante, Double peso, Double largo, String motorElectrico) {
        super(color, modelo, fabricante, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        cantidad *= 2;
        super.acelerar(cantidad);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}



