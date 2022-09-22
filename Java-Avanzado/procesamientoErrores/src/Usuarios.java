import java.util.ArrayList;

public class Usuarios {
    ArrayList<String> usuarios = new ArrayList<>();

    public Usuarios() {}

    public void addUsuarios(String ...nombres) throws UsuariosException, UsuariosNombreCortoException {
        for (String nombre : nombres) {
            if (usuarios.contains(nombre)) {
                throw new UsuariosYaRegistradosException(nombre);
            }

            if (nombre.length() < 4) {
                throw new UsuariosNombreCortoException(nombre);
            }
            this.usuarios.add(nombre);
        }
    }
}
