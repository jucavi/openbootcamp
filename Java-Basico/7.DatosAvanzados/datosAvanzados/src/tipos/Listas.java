package tipos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listas {

    public static void demoList() {
        // Similares a los vectores, usando un array de forma subyacente.
        // No están sincronizados, es importante tenerlo en cuenta cuando necesitamos código "thread-safe".

        // Tambien varía la forma de aumentar su capacidad. Por defecto, el vector dobla la capacidad, y
        // el ArrayList aumenta con la formula "capacidad += capacidad * 0.5". En el constructor no podemos
        // darle un tamaño de autocrecimiento (a diferencia del Vector), y utiliza la formula previa.

        // Crear una lista de tipo ArrayList:
        ArrayList<String> lista = new ArrayList<>();

        // Añadir elementos
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        System.out.println("Contenido de la lista: " + lista);

        // Quitar un elemento:
        lista.remove("Dos");
        System.out.println("Contenido de la lista: " + lista);

        // Las listas tienen tamaño:
        System.out.println("Tamaño: " + lista.size());

        // Recorrer una lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Valor en la posicion " + i + " de la lista: " + lista.get(i));
        }

        // Recorrerlo con la forma corta:
        for (String e : lista) {
            System.out.println("Valor actual de la lista: " + e);
        }

        // Comparar dos listas
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Uno");
        lista2.add("Tres");

        if (lista.equals(lista2)) {
            System.out.println("Las dos listas son equivalentes");
            System.out.println("    -> lista: " + lista);
            System.out.println("    -> lista2: " + lista2);
        }

        // Podemos convertir una lista en un array:
        String []array = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (String elemento : array) {
            System.out.println("Elemento de la lista convertida en array es: " + elemento);
        }

        // Otra forma de hacer lo mismo:
        for (Object arrayObjeto : lista.toArray()) {
            System.out.println("Elemento de la lista convertida en array es: " + arrayObjeto.toString());
        }

        // Las listas pueden ser de más tipos, además de ArrayList:
        LinkedList<String> listaEnlazada = new LinkedList<>();

        // Y tienen las mismas operaciones que un ArrayList:
        listaEnlazada.add("Hola");
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove("Hola");

        // Y pueden copiarse unas a otras
        LinkedList<String> listaEnlazadaDos = new LinkedList<>(lista);

        // Podemos recorrer nuestra nueva lista, tipo enlazada, y a la que hemos copiado
        // los valores desde "lista", que es del tipo ArrayList.
        for (String elemento : listaEnlazadaDos) {
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
        }

        // Cada tipo de lista tiene sus pros y sus contras:
        // ArrayList:
        //  - Utiliza un array dinámico internamente
        //  - Es más rápida para almacenar y buscar datos
        //  - Solo implementa la interfaz "List", por lo que solo puede actuar como una lista
        //
        // LinkedList:
        //  - Utiliza una lista doblemente enlazada a nivel interno
        //  - Es más rápida para modificar datos
        //  - Puede funcionar como lista y como cola, ya que implementa las interfaces "List" y "Deque"
        //
        // Hay más tipos, ¡búscalos!
    }
}
