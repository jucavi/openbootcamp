
public class EventManager {
    ListenerIterator listeners = new ListenerIterator();

    public EventManager() {}

    public void subscribe(EventListener listener) {
        listeners.addListener(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.removeListener(listener);
    }

    public void sendMessage() {
        while (listeners.hasNext()) {
            EventListener listener = listeners.next();
            listener.update();
        }
        listeners.reset();
    }
}
