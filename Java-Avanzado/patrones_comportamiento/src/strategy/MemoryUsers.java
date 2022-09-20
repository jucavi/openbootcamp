package strategy;

import java.util.ArrayList;

public class MemoryUsers implements Users {
    private final ArrayList<String> users = new ArrayList<String>();

    @Override
    public void add(String username) {
        users.add(username);
    }

    @Override
    public ArrayList<String> findAll() {
        return users;
    }
}
