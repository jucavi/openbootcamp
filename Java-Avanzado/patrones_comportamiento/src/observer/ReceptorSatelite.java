package observer;

public class ReceptorSatelite implements Receptor {
    @Override
    public void recive() {
        System.out.println("Recivido por Satelite");
    }
}
