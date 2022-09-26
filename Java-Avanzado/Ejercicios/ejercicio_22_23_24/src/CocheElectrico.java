public class CocheElectrico extends Coche implements Acelerador {

    public CocheElectrico() {
        super(new Motor("Electrico"));
    }

    @Override
    public void acelerar() {
        super.acelerar(3, 120);
    }

    @Override
    public void frenar() {
        super.frenar(3);
    }
}
