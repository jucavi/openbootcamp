package tipos;

import java.util.Vector;

public class Vectores {

    public static void demoVector() {
        // Un vector es similar a un array, pero puede (de)crecer dinámicamente.
        Vector<Integer> vector = new Vector<>();

        // Añadir elementos
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Contenido del vector: " + vector);

        // Quitar un elemento:
        vector.remove(1);
        System.out.println("Contenido del vector: " + vector);

        // Los vectores tienen capacidad y tamaño:
        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());

        // Podemos ajustar la capacidad al tamaño actual:
        vector.trimToSize();
        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());

        // Al añadir un elemento al vector, si superamos su capacidad, esta aumenta en capacityIncrement.
        // capacityIncrement se declara en el constructor del vector, y si es menor o igual a cero, por
        // defecto es el doble de la capacidad previa.
        vector.add(9);
        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());

        // Recorrer un vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor en la posicion " + i + " del vector: " + vector.get(i));
        }

        // Recorrerlo con la forma corta:
        for (int i : vector) {
            System.out.println("Valor actual del vector: " + i);
        }

        // Comparar dos vectores
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(3);
        vector2.add(9);

        if (vector.equals(vector2)) {
            System.out.println("Los dos vectores son equivalentes");
            System.out.println("    -> vector: " + vector);
            System.out.println("    -> vector: " + vector2);
        }
    }

}
