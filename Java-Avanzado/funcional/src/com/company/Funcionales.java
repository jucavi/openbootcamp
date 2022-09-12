package com.company;

import java.util.function.Function;

public class Funcionales {
    static Function<String, String> toMayus = (x) -> x.toUpperCase();
    // private Function<String, String> toMayus = String::toUpperCase;
    static Function<Integer, Integer> sumador = (x) -> Integer.sum(x, x);

    public void pruebas() {
        toMayus.apply("texto");
        sumador.apply(6);
    }

    public void saluda(Function<String, String> function, String nombre) {
        System.out.println("Hola " + function.apply(nombre));
    }
}