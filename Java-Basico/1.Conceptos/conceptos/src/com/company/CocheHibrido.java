package com.company;

public class CocheHibrido extends Coche{

    String motorHibrido;

    public CocheHibrido() {}

    public CocheHibrido(String color, String modelo, String fabricante, Double peso, Double largo, String motorHibrido) {
        super(color, modelo, fabricante, peso, largo);
        this.motorHibrido = motorHibrido;
    }



}
