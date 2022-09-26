import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Basico");
        Coche coche = new Coche(motor);
        Coche cocheElectrico = new CocheElectrico();
        Coche cocheHibrido = new CocheHibrido();
        Coche cocheCombustion = new CocheCombustion();

        ArrayList<Coche> coches = new ArrayList<Coche>();
        coches.add(coche);
        coches.add(cocheElectrico);
        coches.add(cocheHibrido);
        coches.add(cocheCombustion);

        for (Coche actual : coches) {
            System.out.println("Acelerando diez veces coche " + actual.getMotor().getTipo());
            IntStream.range(0, 10).forEach(i -> actual.acelerar());
            System.out.println("Velocidad actual: " + actual.getVelocidad());

            System.out.println("Frenando diez veces coche " + actual.getMotor().getTipo());
            IntStream.range(0, 10).forEach(i -> actual.frenar());
            System.out.println("Velocidad actual: " + actual.getVelocidad());
        }
    }
}
