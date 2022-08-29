package Solucion4.clases;

import Solucion4.base.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class SmartWatch extends SmartDevice {

    String osCompatibility;
    List<String> fitnessFeatures = new ArrayList<String>();

    public SmartWatch() {}

    public SmartWatch(String marca, String modelo, String color, double size, List<String> fitnessFeatures, String osCompatibility) {
        super(marca, modelo, color, size);
        this.fitnessFeatures = fitnessFeatures;
        this.osCompatibility = osCompatibility;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "fitnessFeatures=" + fitnessFeatures +
                ", osCompatibility='" + osCompatibility + '\'' +
                "} " + super.toString();
    }
}
