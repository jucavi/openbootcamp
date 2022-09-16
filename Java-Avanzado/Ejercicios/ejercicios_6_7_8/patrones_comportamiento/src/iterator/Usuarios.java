package iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {

    private ArrayList<Usuario> bootcampers = new ArrayList<Usuario>();
    private int position = 0;

    public void add(Usuario user) {
        bootcampers.add(user);
    }

    @Override
    public boolean hasMore() {
        return position < bootcampers.size();
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Usuario next() {
        Usuario user = bootcampers.get(position);
        position++;
        return user;
    }
}
