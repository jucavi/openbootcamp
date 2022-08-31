package poo.interfaces.continterface;

import poo.interfaces.sininterface.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDArray implements EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<Empleado>();

    @Override
    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> findAll() {
        return empleados;
    }
}
