package decorador;

public class TelefonoBasico implements Telefono{

    @Override
    public void crear() {
        System.out.println("Soy un teléfono básico. Tengo estas características: ");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM() {
        System.out.println(" -> Básico: tengo GSM");
    }

    private void tengoSMS() {
        System.out.println(" -> Básico: tengo SMS");
    }
}
