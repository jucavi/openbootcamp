public class BGColorListener implements EventListener {
    String color;

    public BGColorListener(String color) {
        this.color = color;
    }

    public void update() {
        System.out.println("Cambiando el color de background a color '" + color + "'");
    }
}
