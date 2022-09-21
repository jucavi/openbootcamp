package funciones;

public class Radio {

    private boolean estaEncendido;
    private float frecuencia;
    private int volumen;

    public Radio() {
        this.estaEncendido = false;
        this.volumen = 0;
        this.frecuencia = 87.5f;
    }

    public void encenderRadio() {
        this.estaEncendido = true;
    }

    public void apagarRadio() {
        this.estaEncendido = false;
    }

    public void sintonizarRadio(float frecuencia) {
        float MIN_FREC = 87.5f;
        float MAX_FREC = 108.0f;
        this.frecuencia = Math.max(Math.min(frecuencia, MAX_FREC), MIN_FREC);
    }

    public void subirVolumen() {
        volumen++;
        if (volumen > 100) volumen = 100;
    }

    public void bajarVolumen() {
        volumen--;
        if (volumen < 0) volumen = 0;
    }
}
