package observer;

import java.util.ArrayList;

public class Emisor {
    public ArrayList<Receptor> receptores = new ArrayList<>();

    public void addReceptor(Receptor receptor) {
        receptores.add(receptor);
    }

    public void emite() {
        for(Receptor receptor : receptores) {
            receptor.recive();
        }
    }

}
