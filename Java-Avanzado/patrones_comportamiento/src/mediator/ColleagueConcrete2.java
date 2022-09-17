package mediator;

public class ColleagueConcrete2  extends Colleague {
    @Override
    void receiveMessage() {
        System.out.println("He recibido un mensaje, soy colleagueConcrete2");
    }

    @Override
    void sendMessage() {
        System.out.println("Soy collegaConcrete2, envio un mensaje");
        mediator.resend(this);
    }
}
