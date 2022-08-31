package tipos;

public class Strings {

    @SuppressWarnings("ConstantConditions")
    public static void demoStrings() {
        // Declarar un string
        String cadena = "Esto es una cadena";

        // Obtener longitud de la cadena
        int cadenaLen = cadena.length();
        System.out.println(cadenaLen);

        // Convertir toda la cadena a minúsculas
        String cadenaMinus = cadena.toLowerCase();
        System.out.println(cadenaMinus);

        // Convertir toda la cadena a mayúsculas
        String cadenaMayus = cadena.toUpperCase();
        System.out.println(cadenaMayus);

        // Verificar si una cadena empieza por otra cadena
        if (cadena.startsWith("Es")) {
            System.out.println("La cadena empieza por \"Es\"'");
        }

        if (cadena.startsWith("hola")) {
            System.out.println("La cadena empieza por \"hola\"");
        }

        // Verificar si uan cadena finaliza por otra cadena
        if (cadena.endsWith("cadena")) {
            System.out.println("La cadena finaliza por \"cadena\"");
        }

        if (cadena.endsWith("adios")) {
            System.out.println("La cadena finaliza por \"adios\"");
        }

        // Imprimimr un string carácter a carácter
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            System.out.println("Caracter: " + caracter);
        }
    }
}
