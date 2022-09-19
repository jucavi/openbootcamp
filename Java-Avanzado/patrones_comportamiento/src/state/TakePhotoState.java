package state;

public class TakePhotoState  extends State {

    public TakePhotoState(Phone phone) {
        super(phone);
    }

    @Override
    public String unblocked() {
        return "(unblocked) Móvil desbloqueado";
    }

    @Override
    public String openCamera() {
        return "(openCamera) Cámara abierta";
    }

    @Override
    public String takePicture() {
        // this.phone.setState(new BlockedState());
        return "(takePicture) Genial";
    }
}
