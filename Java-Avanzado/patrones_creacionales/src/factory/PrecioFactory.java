package factory;

public class PrecioFactory {

    Precio precio;

    // Constructores ocultos
    private PrecioFactory() {};
    public PrecioFactory(String country) {
        if (country.equalsIgnoreCase("España")) {
            System.out.println("España, precio en euros");
            precio =  new PrecioEUR();
        } else if (country.equalsIgnoreCase("England")){
            System.out.println("Inglaterra, precio en pounds");
            precio =  new PrecioGBP();
        } else {
            System.out.println("Otro pais, precio en usd");
            precio =  new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}
