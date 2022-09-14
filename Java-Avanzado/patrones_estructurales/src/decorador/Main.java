package decorador;

public class Main {

    public static void main(String[] args) {
        // TelefonoBasico tlfBasico = new TelefonoBasico();
        // tlfBasico.crear();

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crear();

        TelefonoNextGen ng = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        ng.crear();

        TelefonoNextGen ng1 = new TelefonoNextGen(new TelefonoBasico());
        ng1.crear();
    }
}
