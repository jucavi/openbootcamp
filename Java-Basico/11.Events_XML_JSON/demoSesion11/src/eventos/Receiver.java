package eventos;

public class Receiver implements Listener{
    @Override
    public void onMessage() {
        System.out.println("Hola amigo de la colmena");
    }
}
