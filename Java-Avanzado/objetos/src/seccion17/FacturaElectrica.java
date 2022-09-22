package seccion17;

abstract public class FacturaElectrica {
    double impuesto = 21;

    abstract double calcularPrecio();

    public double obtenerImpuesto(double precio) {
        return precio * impuesto/ 100.0;
    }
}
