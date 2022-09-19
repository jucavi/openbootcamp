package state;

public class OpenCamaraState extends State {

    public OpenCamaraState(Phone phone) {
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
        this.phone.setState(new TakePhotoState(this.phone));
        return "(takePicture) Di patata!!! 5, 4, 3...";
    }
}
