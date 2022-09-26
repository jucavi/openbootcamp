package I.aplicacion;

import java.util.ArrayList;

public interface UsuariosDB {

    ArrayList<Usuario> listar();
    Usuario buscar(Usuario usuario);
    void insertar(Usuario usuario);
    void eliminar(Usuario usuario);
}
