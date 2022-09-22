public class UsuariosNombreCortoException extends UsuariosException {

    public UsuariosNombreCortoException() {}
    public UsuariosNombreCortoException(String message) {
        super("Nombre Usuario " + message + " muy corto");
    }
}
