package state;

public class UnblockedState extends State {

    public UnblockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String unblocked() {
        return "(unblocked) Móvil ya estaba desbloqueado";
    }

    @Override
    public String openCamera() {
        this.phone.setState(new OpenCamaraState(this.phone));
        return "(openCamera) La camara esta desbloqueada";
    }

    @Override
    public String takePicture() {
        return "(takePicture) La camara esta bloqueada. Desbloquee la cámara primero.";
    }
}
