import java.util.ArrayList;

public class ListenerIterator {
    private ArrayList<EventListener> listeners = new ArrayList<>();
    private int indexPos = 0;

    public ListenerIterator() {}
    public ListenerIterator(ArrayList<EventListener> listeners) {
        this.listeners = listeners;
    }

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    public boolean hasNext() {
        return listeners.size() > indexPos;
    }

    public EventListener next() throws IndexOutOfBoundsException{
        int index = indexPos;
        indexPos++;
        return listeners.get(index);
    }

    public void reset() {
        indexPos = 0;
    }
}
