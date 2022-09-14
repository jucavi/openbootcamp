package builder;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new VehiculoBuilder("Filostros")
                .setPuertas(5)
                .setMotor("Eléctrico")
                .build();

        System.out.println(vehiculo.getMarca());
        System.out.println(vehiculo.getMotor());
        System.out.println(vehiculo.getPuertas());

    }
}
