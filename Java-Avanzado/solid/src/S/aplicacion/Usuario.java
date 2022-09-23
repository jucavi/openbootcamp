package S.aplicacion;

public class Usuario {
    private String username;
    private String name;
    private String email;
    private int age;

    public Usuario() {}
    public Usuario(String username, String name, String email, int age) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
