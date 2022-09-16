package observer;

public class ReceptorRadio implements Receptor {
    @Override
    public void recive() {
        System.out.println("Recivido por Radio");
    }
}
