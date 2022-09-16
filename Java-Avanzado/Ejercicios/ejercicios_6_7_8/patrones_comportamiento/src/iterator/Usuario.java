package iterator;

public class Usuario {

    private String username;
    private int age;

    private Usuario() {}
    public Usuario(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
