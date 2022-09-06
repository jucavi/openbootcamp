package com.company;

import java.util.Vector;

public class VectorSolution3_4 {

    public static void main(String[] args) {
        Vector<Integer> position = new Vector<Integer>();
        position.add(0);
        position.add(1);
        position.add(2);
        position.add(3);
        position.add(4);
        position.add(5);
        position.add(6);

        position.remove(1);
        position.remove(1);



        System.out.println(position);

        /*
        Si creamos un vector con capacidad por defecto para incluir
        1000 elementos:
        Un vector por defecto tiene una capacidad de 10 elementos aumentando
        su capacidad de forma automática una vez lleno un 100%: 10, 20, 30...
        Esto significa que cada vez que insertamos 10 elementos el vector tiene
        que hacer un rezise lo que conlleva el copiar todos los elementos almacenados
        a un nuevo vector con una capacidad mayor de 10 elementos. La copia es costosa
        computacionalmente y en nuestro caso tendríamos para almacenar 1000 elementos
        que realizar este proceso 100 veces.
         */
    }
}
