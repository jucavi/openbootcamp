package decorador;

public class TelefonoNextGen extends TelefonoDecorator {

    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    // wrapper
    public void crear() {
        super.crear();
        System.out.println("    -> nextGen: Tengo también 5G");
        System.out.println("    -> nextGen: Tengo también VoLTe");
    }
}
