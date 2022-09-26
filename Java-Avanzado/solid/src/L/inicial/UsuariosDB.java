package L.inicial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosDB {
    private final String filePath;

    public UsuariosDB(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] tokens = line.split(",");

                Usuario current = new UsuarioBuilder(tokens[0])
                        .setName(tokens[1])
                        .setEmail(tokens[2])
                        .setNivelAcceso(Integer.parseInt(tokens[3]))
                        .build();

                usuarios.add(current);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return usuarios;
    }

    public Usuario buscar(Usuario usuario) {
        ArrayList<Usuario> usuarios = listarUsuarios();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.getUsername().equals(usuario.getUsername())) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void insertar(Usuario usuario) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath, true);
            PrintStream out = new PrintStream(fos);

            out.println(separarUsuarioPorComa(usuario));
            out.flush();
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private String separarUsuarioPorComa(Usuario usuario) {
        return usuario.getUsername() + ","
                + usuario.getName() + ","
                + usuario.getEmail() + ","
                + usuario.getNivelAcceso();
    }

    public void eliminar(Usuario usuario) {
        ArrayList<Usuario> usuarios = listarUsuarios();

        usuarios.removeIf(current -> current.getUsername().equals(usuario.getUsername()));

        guardar(usuarios);
    }

    private void guardar(ArrayList<Usuario> usuarios) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            PrintStream out = new PrintStream(fos);

            for (Usuario usuario : usuarios) {
                out.println(separarUsuarioPorComa(usuario));
                out.flush();
            }

            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
