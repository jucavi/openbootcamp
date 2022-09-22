package seccion17;

public class FacturaElectricaUsuarios extends FacturaElectrica {
    @Override
    double calcularPrecio() {
        return 0.55 + obtenerImpuesto(0.55);
    }
}
