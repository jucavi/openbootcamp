package factory;

public class Main {

    public static void main(String[] args) {
        PrecioFactory precioEur = new PrecioFactory("españa");
        PrecioFactory precioUsd = new PrecioFactory("usa");
        PrecioFactory precioGbp = new PrecioFactory("england");

        System.out.println("EUR " + precioEur.getPrecio());
        System.out.println("USD " + precioUsd.getPrecio());
        System.out.println("GBP " + precioGbp.getPrecio());
    }
}
