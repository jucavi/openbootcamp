package adapter;

public class Horno implements Enchufable {
    private boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
        System.out.println("Horno encendido");

    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Horno apagado");

    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
