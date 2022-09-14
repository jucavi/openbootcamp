package adapter;

public class PowerAdapter implements Enchufable {
    // adaptador
    public LightBulb lighttBulb = new LightBulb();


    @Override
    public void enciende() {
        lighttBulb.turnOn(100);
    }

    @Override
    public void apaga() {
        lighttBulb.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lighttBulb.isPowerOn();
    }
}
