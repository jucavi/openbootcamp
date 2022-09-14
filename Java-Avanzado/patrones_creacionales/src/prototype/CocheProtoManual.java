package prototype;

public class CocheProtoManual {
    public String marca;
    public String modelo;
    public int puertas;

    public CocheProtoManual() {}

    public CocheProtoManual clonar() {
        CocheProtoManual clon = new CocheProtoManual();
        clon.marca = marca;
        clon.modelo = modelo;
        clon.puertas = puertas;
        return clon;
    }
}
