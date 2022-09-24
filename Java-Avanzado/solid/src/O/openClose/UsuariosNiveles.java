package O.openClose;

public class UsuariosNiveles extends Usuarios{
    public UsuariosNiveles() {}

    public boolean esAdministrador(Usuario usuario) {
        return comprobarNivel(usuario, 10);
    }

    public boolean esEstudiante(Usuario usuario) {
        return comprobarNivel(usuario, 5);

    }

    public boolean esInvitado(Usuario usuario) {
        return comprobarNivel(usuario, 1);
    }

    private boolean comprobarNivel(Usuario usuario, int nivel) {
        if (usuarioDB.buscar(usuario) == null) {
            return false;
        }

        return usuario.getNivelAcceso() == nivel;
    }
}
