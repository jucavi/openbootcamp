package L.aplicacion;

import java.util.ArrayList;

public class UsuariosDBMemoria extends UsuariosDB{
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuariosDBMemoria() {}

    @Override
    public ArrayList<Usuario> listar() {
        return usuarios;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.getUsername().equals(usuario.getUsername())) {
                return usuarioActual;
            }
        }

        return null;
    }

    @Override
    public void insertar(Usuario usuario) {
        if (buscar(usuario) == null) {
            usuarios.add(usuario);
        }
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarios.removeIf(current -> current.getUsername().equals(usuario.getUsername()));
    }


}
