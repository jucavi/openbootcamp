package I.inicial;

import java.util.ArrayList;

abstract public class UsuariosDB {

    abstract public ArrayList<Usuario> listar();
    abstract public Usuario buscar(Usuario usuario);
    abstract public void insertar(Usuario usuario);
    abstract public void eliminar(Usuario usuario);
}
