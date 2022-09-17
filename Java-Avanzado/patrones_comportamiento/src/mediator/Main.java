package mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new MediatorConcrete();

        Colleague colleague1 = new ColleagueConcrete1();
        Colleague colleague2 = new ColleagueConcrete2();
        Colleague colleague3 = new ColleagueConcrete3();

        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.register(colleague3);

        colleague1.sendMessage();
        colleague2.sendMessage();
        colleague3.sendMessage();
    }
}
