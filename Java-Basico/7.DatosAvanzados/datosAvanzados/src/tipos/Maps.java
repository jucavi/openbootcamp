package tipos;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void demoMap() {
        // Los mapas implementan colecciones "clave" = "valor".


        // Crear un mapa del tipo "HashMap":
        HashMap<String, Integer> mapa = new HashMap<>();

        // Añadir elementos:
        mapa.put("clave1", 1);
        mapa.put("clave2", 2);
        mapa.put("clave3", 3);

        // Imprimir un valor de una clave del mapa accediendo a él:
        System.out.println("Valor de \"clave2\": " + mapa.get("clave2"));

        // Eliminar una clave del mapa:
        mapa.remove("clave2");

        // Un mapa no puede tener claves duplicadas, esto no se añadirá de nuevo, pero si reemplazará
        // su valor por "4":
        mapa.put("clave3", 4);
        System.out.println("Valor de \"clave3\": " + mapa.get("clave3"));

        // Un mapa puede cambiar el valor de una clave. Es más rapido reemplazar una clave que conozcamos
        // con replace que mediante mapa.put:
        mapa.replace("clave3", 100);

        // Recorrer un mapa:
        for (Map.Entry<String, Integer> elemento : mapa.entrySet()) {
            System.out.println("Clave: " + elemento.getKey() + " - Valor: " + elemento.getValue());
        }
    }

    public static void demoMath() {
        // Math es muy preciso con decimales utilizando BigDecimal.
        double valorInicial = 3.14f;
        BigDecimal valorA = BigDecimal.valueOf(valorInicial);

        double valorSecundario = 3.15f;
        BigDecimal valorB = BigDecimal.valueOf(valorSecundario);

        // Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        // Imprime la suma
        System.out.println(resultado);

    }
}
