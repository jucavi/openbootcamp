package I.aplicacion;

import java.util.ArrayList;

public class UsuariosDBMemoria implements UsuariosDB, UsuariosDBEstadisticas {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

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
            totalInserciones++;
        }
    }

    @Override
    public void eliminar(Usuario usuario) {
        for (Usuario current : usuarios) {
            if (current.getUsername().equals(usuario.getUsername())) {
                usuarios.remove(current);
                totalEliminaciones--;
            }
        }
    }

    @Override
    public int getTotalInserciones() {
        return totalInserciones;
    }

    @Override
    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }
}
