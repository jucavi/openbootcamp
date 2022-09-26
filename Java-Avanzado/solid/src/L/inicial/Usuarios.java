package L.inicial;

import java.util.ArrayList;

public class Usuarios {
    UsuariosEstadisticas usuarioDB = new UsuariosEstadisticas("usuarios.txt");

    public ArrayList<Usuario> listar() {
        return usuarioDB.listarUsuarios();
    }

    public Usuario obtener(String username) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);

        return usuarioDB.buscar(usuario);
    }

    public void insertar(Usuario usuario) {
        if (usuarioDB.buscar(usuario) != null) {
            return;
        }

        usuarioDB.insertar(usuario);
    }

    public void eliminar(String username) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuarioDB.eliminar(usuario);
    }
}
