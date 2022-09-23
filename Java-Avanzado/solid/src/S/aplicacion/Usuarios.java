package S.aplicacion;

import java.util.ArrayList;

public class Usuarios {
    private final UsuarioDB usuarioDB = new UsuarioDB();

    public ArrayList<Usuario> listar() {
        return usuarioDB.convertirUsuariosFicheroEnArrayList();
    }

    public void insertar(Usuario usuario) {
        usuarioDB.insertar(usuario);
    }

    public Usuario obtener(String username) {
        ArrayList<Usuario> usuarios = usuarioDB.convertirUsuariosFicheroEnArrayList();

        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }

        return null;
    }

    public void eliminar(String username) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuarioDB.eliminar(usuario);
    }
}
