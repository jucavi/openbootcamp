package observer;

public class ReceptorTV implements Receptor {
    @Override
    public void recive() {
        System.out.println("Recivido por TV");
    }
}
