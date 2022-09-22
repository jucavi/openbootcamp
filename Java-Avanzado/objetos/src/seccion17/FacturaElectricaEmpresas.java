package seccion17;

public class FacturaElectricaEmpresas extends FacturaElectrica {
    @Override
    double calcularPrecio() {
        return 0.99 + obtenerImpuesto(0.99);
    }
}
