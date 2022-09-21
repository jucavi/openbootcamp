package observer;

public class Main {
    public static void main(String[] args) {
        Emisor emisora = new Emisor();

        ReceptorRadio radio = new ReceptorRadio();
        ReceptorTV tv = new ReceptorTV();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisora.addReceptor(radio);
        emisora.addReceptor(tv);
        emisora.addReceptor(satelite);

        emisora.emite();
    }
}
