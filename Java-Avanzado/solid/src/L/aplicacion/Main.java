package L.aplicacion;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new UsuarioBuilder("juan")
                .setName("Juan")
                .setEmail("juan@gmail.com")
                .setNivelAcceso(1)
                .build();

        Usuario usuario2 = new UsuarioBuilder("jane")
                .setName("Jane")
                .setEmail("jane@gmail.com")
                .setNivelAcceso(10)
                .build();

        Usuarios usuarios = new Usuarios(new UsuariosDBMemoria());
        usuarios.insertar(usuario);
        usuarios.insertar(usuario2);

        // usuarios.eliminar("juan");
        // usuarios.eliminar("jane");

        for (Usuario current : usuarios.listar()) {
            System.out.println(current.getName());
        }
    }

}
