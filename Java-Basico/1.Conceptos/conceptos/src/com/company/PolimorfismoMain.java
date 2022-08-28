package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {

        // Coche coche1 = new Coche();

        CocheElectrico cocheElectrico1 = new CocheElectrico();

        CocheHibrido cocheHibrido1 = new CocheHibrido();

        // polimorfismo
        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof Coche) {
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico) {
            System.out.println("Coche electrico");
        }

        if (coche4 instanceof CocheHibrido) {
            System.out.println("Coche hibrido");
        }
    }
}
