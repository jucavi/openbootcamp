package decorador;

public class TelefonoInteligente extends TelefonoDecorator {


    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }

    @Override
    // wrapper
    public void crear() {
        super.crear();
        System.out.println("    -> Inteligente: Tengo también 3G");
    }
}
