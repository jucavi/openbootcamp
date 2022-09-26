package L.inicial;

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

        Usuarios usuarios = new Usuarios();
        usuarios.insertar(usuario);
        usuarios.insertar(usuario2);

        //usuarios.eliminar("juan");
        //usuarios.eliminar("jane");

        UsuariosNiveles openbootcamp = new UsuariosNiveles();
        System.out.println("Es administrador? " + openbootcamp.esAdministrador(usuario));
        System.out.println("Es administrador? " + openbootcamp.esAdministrador(usuario2));

        for (Usuario current : usuarios.listar()) {
            System.out.println(current.getName());
        }

        System.out.println(usuarios.usuarioDB.getTotalInserciones());
        System.out.println(usuarios.usuarioDB.getTotalEliminaciones());
    }

}
