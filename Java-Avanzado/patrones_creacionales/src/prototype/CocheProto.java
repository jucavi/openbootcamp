package prototype;

public class CocheProto implements Cloneable {
    public String marca;
    public String modelo;
    public int puertas;

    public CocheProto() {}

    public CocheProto clonar() throws CloneNotSupportedException{
        return (CocheProto) this.clone();
    }
}
