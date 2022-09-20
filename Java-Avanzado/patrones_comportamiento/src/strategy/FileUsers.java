package strategy;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUsers implements Users{

    private final String fileUsers = "usuarios.txt";
    private PrintStream file;

    public FileUsers() {
        try {
            file = new PrintStream(fileUsers);
        } catch (IOException e) {
            System.out.println("No se encuentra el archivo" + e.getMessage());
        }
    }

    @Override
    public void add(String username) {
        file.println(username);
    }

    @Override
    public ArrayList<String> findAll() {
        ArrayList<String> users = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(fileUsers));

            while (scanner.hasNextLine()) {
                users.add(scanner.nextLine().trim());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("No se encuentra el archivo" + e.getMessage());
        }

        return users;
    }
}
