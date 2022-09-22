public class UsuariosException extends Exception {

    public UsuariosException() {}
    public UsuariosException(String message) {
        super("Error de Usuario: " + message);
    }
}
