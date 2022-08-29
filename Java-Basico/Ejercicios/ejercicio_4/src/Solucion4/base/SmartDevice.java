package Solucion4.base;

public class SmartDevice {

    String marca;
    String model;
    String color;
    double size;

    public SmartDevice() {}

    public SmartDevice(String marca, String model, String color, double size) {
        this.marca = marca;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size + '\'' +
                '}';
    }
}
