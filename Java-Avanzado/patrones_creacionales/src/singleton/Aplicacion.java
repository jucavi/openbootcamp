package singleton;

public class Aplicacion {
    private static Aplicacion aplicacion;
    boolean isRunning = false;

    private Aplicacion() {}

    public static Aplicacion getInstance() {
        if (aplicacion == null) {
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }

    public void run() {
        if (!isRunning) {
            System.out.println("Starting aplicacion");
            isRunning = true;
        } else {
            System.out.println("Already running");
        }
    }
}
