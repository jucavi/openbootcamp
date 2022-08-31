package com.openbootcamp;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Coche cocheObj1 = new Coche("audi", "a6", "rojo", 5);
        Coche cocheObj2 = new Coche("audi", "a3", "blanco", 5);
        Coche cocheObj3 = new Coche("audi", "a6", "azul", 5);
        Coche cocheObj4 = new Coche("audi", "a4", "gris", 5);

        CocheCRUD cocheCRUDObj = new CocheCRUDImpl();

        cocheCRUDObj.save(cocheObj1);
        cocheCRUDObj.save(cocheObj2);
        cocheCRUDObj.save(cocheObj3);
        cocheCRUDObj.save(cocheObj4);

        List<Coche> coches = cocheCRUDObj.findAll();
        System.out.println("La variable coches nos devulve un resultado vacio '" + coches + "' porque el método findAll aún no se ha implementado.");

        cocheCRUDObj.delete(cocheObj3);
        cocheCRUDObj.delete(cocheObj4);
        cocheCRUDObj.delete(cocheObj1);
    }
}
