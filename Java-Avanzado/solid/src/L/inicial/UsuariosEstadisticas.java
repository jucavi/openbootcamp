package L.inicial;

public class UsuariosEstadisticas extends UsuariosDB {
    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

    public UsuariosEstadisticas(String filePath) {
        super(filePath);
    }

    public int getTotalInserciones() {
        return totalInserciones;
    }

    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }

    @Override
    public void insertar(Usuario usuario) {
        super.insertar(usuario);
        totalInserciones++;
    }

    @Override
    public void eliminar(Usuario usuario) {
        super.eliminar(usuario);
        totalEliminaciones++;
    }
}
