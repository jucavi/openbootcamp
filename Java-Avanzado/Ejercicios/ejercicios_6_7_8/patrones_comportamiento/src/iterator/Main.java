package iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios bootcampers = new Usuarios();

        bootcampers.add(new Usuario("Juan", 22));
        bootcampers.add(new Usuario("Ana", 25));
        bootcampers.add(new Usuario("Luis", 32));
        bootcampers.add(new Usuario("Gema", 22));


        while (bootcampers.hasMore()) {
            Usuario user = bootcampers.next();
            System.out.println(user.getUsername());
        }

        bootcampers.reset();
    }
}
