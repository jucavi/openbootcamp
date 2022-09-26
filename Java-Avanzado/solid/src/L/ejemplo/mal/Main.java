package L.ejemplo.mal;

public class Main {
    public static void main(String[] args) {
        // Aritmetica ari = new Aritmetica();
        // No cumple con el principio de sustitución de liskov, no puedo sustituir una clase hija por la clase padre
        // sin modificar el código
        Aritmetica ari = new AritmeticaMejorada();
        // ari.dividir(2, 2);
    }
}
