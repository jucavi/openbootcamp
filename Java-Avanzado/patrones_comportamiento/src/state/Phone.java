package state;

public class Phone {

    public State state;

    public Phone() {
        state = new BlockedState(this);
    }

    public void setState(State state) {
        System.out.println("Estado inicial: " + this.state.getClass().getName());
        this.state = state;
        System.out.println("Estado final: " + this.state.getClass().getName());
    }

    public State getState() {
        return state;
    }
}
