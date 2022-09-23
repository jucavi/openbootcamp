package S.aplicacion;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new UsuarioBuilder("juan")
                .setName("Juan")
                .setEmail("juan@gmail.com")
                .setAge(29)
                .build();

        Usuario usuario2 = new UsuarioBuilder("jane")
                .setName("Jane")
                .setEmail("jane@gmail.com")
                .setAge(42)
                .build();

        Usuarios usuarios = new Usuarios();
        usuarios.insertar(usuario);
        usuarios.insertar(usuario2);

        // usuarios.eliminar("juan");
        // usuarios.eliminar("jane");

        for (Usuario current : usuarios.listar()) {
            System.out.println(current.getName());
        }
    }

}
