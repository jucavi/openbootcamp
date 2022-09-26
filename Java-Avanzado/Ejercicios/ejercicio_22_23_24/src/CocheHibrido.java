public class CocheHibrido extends Coche implements Acelerador{

    public CocheHibrido() {
        super(new Motor("Hibrido"));
    }

    @Override
    public void acelerar() {
        super.acelerar(2, 120);
    }

    @Override
    public void frenar() {
        super.frenar(2);
    }
}
