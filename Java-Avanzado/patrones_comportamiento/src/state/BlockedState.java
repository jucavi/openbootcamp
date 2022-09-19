package state;

public class BlockedState extends State {

    public BlockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String unblocked() {
        this.phone.setState(new UnblockedState(this.phone));
        return "(unblocked) Móvil desbloqueado";
    }

    @Override
    public String openCamera() {
        return "(openCamera) La camara esta bloqueada. Desbloquea el móvil antes";
    }

    @Override
    public String takePicture() {
        return "(takePicture) La camara esta bloqueada. Desbloquea la camara antes";
    }
}
