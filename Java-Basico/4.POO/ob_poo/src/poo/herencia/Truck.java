package poo.herencia;

import poo.clases.Engine;
import poo.clases.Vehiculo;

public class Truck extends Vehiculo {

    int weight;

    public Truck(){}
    public Truck(String brand, String model, Engine engine, double cc, int year, boolean sport, int weight) {
        super(brand, model, engine, cc, year, sport);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                ", engine=" + engine +
                '}';
    }
}
