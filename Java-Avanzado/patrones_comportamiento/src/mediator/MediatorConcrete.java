package mediator;

import java.util.ArrayList;

public class MediatorConcrete extends Mediator {
    ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }

    }

    @Override
    void resend(Colleague colleague) {
        for (Colleague current : colleagues) {
            if (!current.equals(colleague)) {
                current.receiveMessage();
            }
        }
    }
}
