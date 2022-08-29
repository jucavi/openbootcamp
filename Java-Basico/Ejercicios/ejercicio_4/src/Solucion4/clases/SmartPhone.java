package Solucion4.clases;

import Solucion4.base.DigitalCamera;
import Solucion4.base.SmartDevice;

public class SmartPhone extends SmartDevice {

    public DigitalCamera camera;
    int ram;
    boolean simCard; // TODO another class

    public SmartPhone() {}

    public SmartPhone(String marca, String modelo, String color, double size, DigitalCamera camera, int ram) {
        super(marca, modelo, color, size);
        this.camera = camera;
        this.ram = ram;
        this.simCard = false;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camera=" + camera +
                ", ram=" + ram +
                ", simCard=" + simCard +
                "} " + super.toString();
    }
}
