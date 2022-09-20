package strategy;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // MemoryUsers users = new MemoryUsers();
        // FileUsers users = new FileUsers();

        /*
        users.add("fulano");
        users.add("mengano");
        users.add("siclanejo");

        for (String user : users.findAll()) {
            System.out.println(user);
        }
         */


        // Cambio con la implementación de la Interface
        int type = 2;
        Users users;

        if (type == 0) {
            users = new MemoryUsers();
        } else {
            users = new FileUsers();
        }

        add(users, "fulano");
        add(users, "siclano");
        add(users, "menganejo");


        for (String user : findAll(users)) {
            System.out.println(user);
        }
    }

    // Con la implementación de la Interface
    public static void add(Users users, String username) {
        users.add(username);
    }

    public static ArrayList<String> findAll(Users users) {
        return users.findAll();
    }
}
