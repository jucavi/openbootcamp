package mediator;

public class ColleagueConcrete3  extends Colleague {

    @Override
    void receiveMessage() {
        System.out.println("He recibido un mensaje, soy colleagueConcrete3");
    }

    @Override
    void sendMessage() {
        System.out.println("Soy collegaConcrete3, envio un mensaje");
        mediator.resend(this);
    }
}
