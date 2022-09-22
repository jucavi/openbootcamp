public class UsuariosYaRegistradosException extends UsuariosException {

    public UsuariosYaRegistradosException() {}
    public UsuariosYaRegistradosException(String message) {
        super("Usuario " + message + " ya existe");
    }
}
