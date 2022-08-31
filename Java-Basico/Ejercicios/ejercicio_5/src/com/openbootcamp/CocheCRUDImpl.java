package com.openbootcamp;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(Coche coche) {
        System.out.println("save " + coche.toString());
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll:");

        return new ArrayList<>();
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete " + coche.toString());
    }
}
