package eventos;

public class Main {

    public static void main(String[] args) {
        Sender sender = new Sender();

        Receiver receiver1 = new Receiver();
        Receiver receiver2 = new Receiver();
        Receiver receiver3 = new Receiver();
        Receiver receiver4 = new Receiver();

        sender.addListener(receiver1);
        sender.addListener(receiver2);
        sender.addListener(receiver3);
        sender.addListener(receiver4);

        sender.sendMessage();
    }
}
