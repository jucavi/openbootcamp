package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    /*
    Programación funcional: Es un tipo de programación declarativa, no imperativa

    JAVA: Programación pseudo-funcional

    Función Pura:
        _ Aquella que dada los mismos parámetros de entrada se produzca el mismo resultado de salida (Detereminista).
        _ No puede tener efectos colaterales, modifica parámetros ( no locales ), invoca a una función que no es pura…
        _ Solo hace lo que referencia su nombre

    Función de alto nivel:
        _ Aquella función que recibe como parámetros una función o la devuelve

        Eg. Funciones lambda: ámbito(prívate, public, protected)
            private Function<String, String> toMayus = (x)-> x.toUpperCase()
     */


    public static void main(String[] args) {
        Funcionales f = new Funcionales();
        f.pruebas();

        f.saluda(Funcionales.toMayus, "pedro");

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("pedro");
        nombres.add("juan");
        nombres.add("laura");
        nombres.add("ana");

        nombres.forEach(System.out::println);
        Stream<String> valores = nombres.stream().map(String::toUpperCase); // FUNCIONA COMO UN GENRADOR UNA VEZ RECORRIDA NO ES ACCESIBLE
        Stream<String> valoresFiltrados = nombres.stream()
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("P"));

        valores.forEach(System.out::println);
        valoresFiltrados.forEach(System.out::println);

        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> res = Arrays.stream(numeros);

        int resultado = res.reduce(0, (x, y) -> x + y);
        // int resultado = res.reduce(0, Integer::sum);
        System.out.println(resultado);

    }
}
