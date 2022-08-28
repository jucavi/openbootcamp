package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Coche coche1 = service1.crearCocheDemo();
    }
}
