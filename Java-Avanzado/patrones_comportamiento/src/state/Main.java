package state;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();

        System.out.println(phone.state.takePicture());
        System.out.println(phone.state.unblocked());
        System.out.println(phone.state.openCamera());
        System.out.println(phone.state.takePicture());
        System.out.println(phone.state.takePicture());
    }
}
