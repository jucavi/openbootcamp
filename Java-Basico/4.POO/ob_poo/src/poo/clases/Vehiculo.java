package poo.clases;

public class Vehiculo {

    // 1. Atributos
    protected String brand;
    protected String model;
    protected Double cc;
    protected int year;
    protected boolean sport;
    // Encapsulación
    private int speed;
    protected Engine engine;

    // 2. Constructores
    public Vehiculo(){}
    public Vehiculo(String brand, String model, Engine engine, Double cc, int year, boolean sport) {
        this.brand = brand;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
        this.engine = engine;
    }

    // 3. Métodos
    //      public
    //      protected
    //      private

    public void setSpeed(Integer quantiy) {
        this.speed += quantiy;
        if (this.speed < 0) this.speed = 0;
        if (this.speed > 120) this.speed = 120;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                ", speed=" + speed +
                ", engine=" + engine +
                '}';
    }
}
