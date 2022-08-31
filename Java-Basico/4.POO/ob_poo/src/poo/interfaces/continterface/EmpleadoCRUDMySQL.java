package poo.interfaces.continterface;

import poo.interfaces.sininterface.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD {

    @Override
    public void save(Empleado empleado) {
       System.out.println("save " + empleado);
    }

    @Override
    public List<Empleado> findAll() {
        return new ArrayList<>();
    }
}
