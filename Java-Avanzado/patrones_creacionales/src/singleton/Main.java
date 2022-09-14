package singleton;

public class Main {
    public static void main(String[] args) {

        // Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();

        singleton.setContador(15);
        System.out.println("Valor: " + singleton.getContador() + " posición en memoria: " + singleton);

        // Singleton singleton1 = new Singleton();
        Singleton singleton1 = Singleton.getInstance();

        // singleton1.setContador(10);
        System.out.println("Valor: " + singleton1.getContador() + " posición en memoria: " + singleton1);

        Aplicacion aplicacion1 = Aplicacion.getInstance();
        Aplicacion aplicacion2 = Aplicacion.getInstance();

        aplicacion1.run();
        aplicacion2.run();

        System.out.println(aplicacion1 + " " + aplicacion2);
    }
}
