package com.company.interfaces;

import com.company.Coche;
import com.company.CocheHibrido;
import com.company.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        return new CocheHibrido();
    }
}
