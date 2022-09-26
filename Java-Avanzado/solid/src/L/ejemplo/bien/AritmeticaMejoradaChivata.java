package L.ejemplo.bien;

public class AritmeticaMejoradaChivata extends Aritmetica {
    @Override
    public int sumar(int a, int b) {
        System.out.println("Estoy en sumar()");
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        System.out.println("Estoy en restar()");
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        System.out.println("Estoy en multiplicar()");
        return a * b;
    }

    @Override
    public int dividir(int a, int b) {
        System.out.println("Estoy en dividir()");
        return a / b;
    }
}
