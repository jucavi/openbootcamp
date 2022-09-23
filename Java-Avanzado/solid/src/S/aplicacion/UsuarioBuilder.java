package S.aplicacion;

public class UsuarioBuilder {
    private Usuario usuario;

    private UsuarioBuilder() {}
    public UsuarioBuilder(String username) {
        usuario = new Usuario();
        usuario.setUsername(username);
    }

    public UsuarioBuilder setName(String name) {
        this.usuario.setName(name);
        return this;
    }

    public UsuarioBuilder setEmail(String email) {
        this.usuario.setEmail(email);
        return this;
    }

    public UsuarioBuilder setAge(int age) {
        this.usuario.setAge(age);
        return this;
    }

    public Usuario build() {
        return usuario;
    }
}
