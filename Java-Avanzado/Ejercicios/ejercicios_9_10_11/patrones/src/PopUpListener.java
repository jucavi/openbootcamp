public class PopUpListener implements EventListener {
    String title;
    String message;

    public PopUpListener(String title, String message) {
        this.title = title;
        this.message = message;
    }

    @Override
    public void update() {
        System.out.println("Title: " + title + "\nMessage: " + message);
    }
}
