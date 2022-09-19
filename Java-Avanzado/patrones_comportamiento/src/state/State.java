package state;

abstract public class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    abstract public String unblocked();
    abstract public String openCamera();
    abstract public String takePicture();
}
