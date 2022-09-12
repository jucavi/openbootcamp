import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(sumaIterativa(5));
        System.out.println(sumaRecursiva(5));
        System.out.println(sumaFuncional(5));
        tailRecursion(5);
        headRecursion(5);

         */

        System.out.println(factorialIterativa(5));
        System.out.println(factorialRecursiva(5));
        System.out.println(factorialFuncional(5));
    }

    public static int sumaIterativa(int max) {

        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        return sum;
    }



    public static int sumaRecursiva(int max) {
        if (max <= 0) return 0;
        return max + sumaRecursiva(max - 1);
    }

    // Recursividad de cola, cuando ejecutamos la lógica y lo último que se ejecuta es la llamada recursiva
    public static void tailRecursion(int num) {
        if (num < 0) return;

        System.out.println(num);
        tailRecursion(num - 1);
    }

    // Recursividad de cabeza, cuando lo primero se realiza la llamada recursiva y luego la lógica
    public static void headRecursion(int num) {
        if (num < 0) return;

        headRecursion(num - 1);
        System.out.println(num);
    }

    // Suma funcional
    public static int sumaFuncional(int num) {
        return IntStream.rangeClosed(1, num).reduce(0, Integer::sum);
    }


    // Cálculo de Factorial
    // Iterativa
    public static int factorialIterativa(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    // Recursiva
    public static int factorialRecursiva(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * factorialRecursiva(num - 1);
    }

    // Funcional
    public static int factorialFuncional(int num) {
        return IntStream.rangeClosed(1, num).reduce(1, (x, y) -> x * y);
    }

    // Ventajas de la recursividad
    // _ Reduce complejidad de tiempo
    // _ Añade cierta claridad a la hora de escribir y depurar código
    // _ Especialmente en el trabajo con árboles

    // Desventajas
    // _ Consumo de recursos

}