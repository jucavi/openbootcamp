package eventos;

import java.util.ArrayList;

public class Sender {
    ArrayList<Listener> listeners = new ArrayList<>(20);

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    public void sendMessage() {
        for (Listener listener : listeners) {
            listener.onMessage();
        }
    }
}
