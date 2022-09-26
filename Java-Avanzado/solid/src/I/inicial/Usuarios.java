package I.inicial;

import java.util.ArrayList;

public class Usuarios {
    UsuariosDB usuariosDB;

    public Usuarios(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }

    public ArrayList<Usuario> listar() {
        return usuariosDB.listar();
    }

    public Usuario obtener(String username) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);

        return usuariosDB.buscar(usuario);
    }

    public void insertar(Usuario usuario) {
        if (usuariosDB.buscar(usuario) != null) {
            return;
        }

        usuariosDB.insertar(usuario);
    }

    public void eliminar(String username) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuariosDB.eliminar(usuario);
    }
}
