package mediator;

abstract public class Mediator {
    abstract void register(Colleague colleague);
    abstract void resend(Colleague colleague);
}
