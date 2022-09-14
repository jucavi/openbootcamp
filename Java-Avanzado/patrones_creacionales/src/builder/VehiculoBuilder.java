package builder;

public class VehiculoBuilder {

    Vehiculo vehiculo;

    // Solo setters que devuelven la instancia
    public VehiculoBuilder(String marca) {
       vehiculo = new Vehiculo();
       vehiculo.marca = marca;
    }

    public VehiculoBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this;
    }

    public VehiculoBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }

    // método que devuelve el objeto creado
    public Vehiculo build() {
        return vehiculo;
    }
}
