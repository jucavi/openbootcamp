package Solucion4.base;

public class DigitalCamera {

    double resolution;
    int zoomMax;
    boolean videoCompatible;
    int zoomLevel;


    public DigitalCamera() {}

    public DigitalCamera(double resolution, int zoomMax, boolean videoCompatible) {
        this.resolution = resolution;
        this.zoomMax = zoomMax;
        this.videoCompatible = videoCompatible;
        this.zoomLevel = 1;
    }


    public void incrementZoomLevel() {
        if (this.zoomLevel < this.zoomMax) this.zoomLevel++;
    }

    public void decrementZoomLevel() {
        if (this.zoomLevel > 1) this.zoomLevel--;
    }

    @Override
    public String toString() {
        return "DigitalCamera{" +
                "resolution=" + resolution +
                ", zoomMax=" + zoomMax +
                ", videoCompatible=" + videoCompatible +
                ", zoomLevel=" + zoomLevel +
                '}';
    }
}
