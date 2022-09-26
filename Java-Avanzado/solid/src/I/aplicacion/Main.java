package I.aplicacion;

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


        UsuariosDB usuariosDB;

        String tipo = "memoria";
        if (tipo.equalsIgnoreCase("fichero")) {
            usuariosDB = new UsuariosDBFichero("usuarios.txt");
        } else {
            usuariosDB = new UsuariosDBMemoria();
        }

        Usuarios usuarios = new Usuarios(usuariosDB);
        usuarios.insertar(usuario);
        usuarios.insertar(usuario2);

        // usuarios.eliminar("juan");
        // usuarios.eliminar("jane");

        for (Usuario current : usuariosDB.listar()) {
            System.out.println(current.getName());
        }

        imprimirEstadisticas(usuariosDB);
    }

    public static void imprimirEstadisticas(UsuariosDB usuariosDB) {
        if (usuariosDB instanceof UsuariosDBMemoria) {
            System.out.println("Iserciones " + (((UsuariosDBMemoria) usuariosDB).getTotalInserciones()));
            System.out.println("Eliminaciones " + (((UsuariosDBMemoria) usuariosDB).getTotalEliminaciones()));
        }
    }

}
