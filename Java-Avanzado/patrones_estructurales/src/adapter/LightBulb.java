package adapter;

public class LightBulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("Lightbukb turned on with voltage " + voltage + " V");

    }

    public void turnOff() {
        poweredOn = false;
        this.voltage = 0;
        System.out.println("Lightbukb turned off with voltage " + voltage + " V");
    }

    public boolean isPowerOn() {
        return poweredOn;
    }
}
