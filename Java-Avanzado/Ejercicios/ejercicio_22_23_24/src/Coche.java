public class Coche {
    private Motor motor;
    private String marca;
    private String modelo;
    private int anyo;
    private int velocidad = 0;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void acelerar() {
        acelerar(1, 120);
    }
    public void acelerar(double factorAceleracion, int velocidadMaxima) {
        int velocidadInicial = getVelocidad();
        if (velocidadInicial >= velocidadMaxima) {
            setVelocidad(velocidadMaxima);
            return;
        }

        int incremento = (int) (1 * factorAceleracion);
        setVelocidad(velocidadInicial + incremento);
    }

    public void frenar() {
        frenar(1);
    }
    public void frenar(double factorFrenado) {
        int velocidadInicial = getVelocidad();
        if (velocidadInicial <= 0) {
            setVelocidad(0);
            return;
        }

        int decremento = (int) (1 * factorFrenado);
        setVelocidad(velocidadInicial - decremento);
    }
}
