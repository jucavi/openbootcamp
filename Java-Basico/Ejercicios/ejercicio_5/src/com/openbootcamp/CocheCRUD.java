package com.openbootcamp;

import java.util.List;

public interface CocheCRUD {

    public void save(Coche coche);

    public List<Coche> save();

    public void delete(Coche coche);
}
