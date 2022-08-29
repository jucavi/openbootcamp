package poo.clases;

public class Engine {

    String model;
    int hp;
    double parNm;

    public Engine() {}
    public Engine(String model, int hp, double parNm) {
        this.model = model;
        this.hp = hp;
        this.parNm = parNm;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", parNm=" + parNm +
                '}';
    }
}
