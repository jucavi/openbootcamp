package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        return new CocheElectrico();
    }
}
