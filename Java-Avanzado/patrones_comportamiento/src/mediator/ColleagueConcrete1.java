package mediator;

public class ColleagueConcrete1  extends Colleague {

    @Override
    void receiveMessage() {
        System.out.println("He recibido un mensaje, soy colleagueConcrete1");
    }

    @Override
    void sendMessage() {
        System.out.println("Soy collegaConcrete1, envio un mensaje");
        mediator.resend(this);
    }
}
