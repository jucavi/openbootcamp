package tipos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Testing {

    public static void main(String[] args) {

        /*
            Vector<Integer> vector = new Vector<>();

            // Añadir elementos
            vector.add(1);
            vector.add(2);
            vector.add(3);
            System.out.println("Contenido del vector: " + vector);

            vector.remove(1);
            System.out.println("Contenido del vector en la posición 1: " + vector.get(1));
         */

        ArrayList<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");


        LinkedList<String> listaEnlazada = new LinkedList<>(lista);

        System.out.println("----------------------------------------------------------------");
        System.out.println("ForLoop");
        for (String elemento : listaEnlazada) {
            System.out.println(elemento);
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println(listaEnlazada.element());
        System.out.println("----------------------------------------------------------------");
        System.out.println(listaEnlazada.remove());
        System.out.println(listaEnlazada.remove());
        System.out.println(listaEnlazada);
        System.out.println("----------------------------------------------------------------");
        System.out.println(listaEnlazada.pop());
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.pollLast());
        System.out.println(listaEnlazada);
        System.out.println("----------------------------------------------------------------");


        // Math es muy preciso con decimales utilizando BigDecimal.
        double valorInicial = 3.14f;
        BigDecimal valorA = BigDecimal.valueOf(valorInicial);
        //BigDecimal valorA = new BigDecimal(valorInicial);

        double valorSecundario = 3.15f;
        BigDecimal valorB = BigDecimal.valueOf(valorSecundario);
        // BigDecimal valorB = new BigDecimal(valorSecundario);

        // Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        // Imprime la suma
        System.out.println(resultado);
        System.out.println(resultado.toString());
    }

}
