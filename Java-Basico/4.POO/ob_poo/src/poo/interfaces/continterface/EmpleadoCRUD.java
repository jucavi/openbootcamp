package poo.interfaces.continterface;

import poo.interfaces.sininterface.Empleado;

import java.util.List;

public interface EmpleadoCRUD {

    public void save(Empleado empleado);

    public List<Empleado> findAll();
}
