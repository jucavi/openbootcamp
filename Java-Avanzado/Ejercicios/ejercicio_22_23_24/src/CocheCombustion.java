public class CocheCombustion extends Coche implements Acelerador {

    public CocheCombustion() {
        super(new Motor("Combustion"));
    }

    @Override
    public void acelerar() {
        super.acelerar(1, 120);
    }

    @Override
    public void frenar() {
        super.frenar(1);
    }
}
