package poo.clases;

import poo.herencia.Car;
import poo.herencia.Truck;

public class Main {

    public static void main(String[] args) {
        // 1. Clases y objetos
        // Clase identificador = new Clase();
        Vehiculo jhonDoe = new Vehiculo();
        Engine toyotaEngine = new Engine("toyota", 120, 2.6);
        Vehiculo toyotaPrius = new Vehiculo("toyota", "prius", toyotaEngine, 2.1, 2010, false);

        jhonDoe.brand = "ford";
        jhonDoe.model = "mondeo";
        jhonDoe.cc = 1.4;
        jhonDoe.year = 2011;
        jhonDoe.sport = false;

        System.out.println(toyotaPrius);
        System.out.println(jhonDoe);

        Truck taino = new Truck();
        taino.brand = "Taino";


        // 2. Herencia
        Engine pegasusEngine = new Engine("Criollo", 90, 1.0);
        Truck pegasus = new Truck("pegasus", "Cti", pegasusEngine, 4.5, 1012, false, 1200);

        System.out.println(taino);
        System.out.println(pegasus);


        // 3. Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Truck();
        vehiculo.setSpeed(100);

        vehiculo = new Car();
        vehiculo.setSpeed(50);

        // 4. Clases abstractas: no se pueden instanciar, solo instancian las clases hijas
    }
}
