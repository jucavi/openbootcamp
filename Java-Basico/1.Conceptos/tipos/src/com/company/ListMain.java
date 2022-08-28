package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("a");
        nombres.add("b");
        System.out.println(nombres.contains("a"));

        nombres.add("c");
        nombres.add("d");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        nombres.remove("a");
        System.out.println(nombres);


        List<Coche> coches = new ArrayList<Coche>();

        coches.add(new Coche("alfa romeo"));
        coches.add(new Coche("audi"));
        coches.add(new Coche("seat"));
        coches.add(new Coche("ford"));

        System.out.println(coches);

    }
}
