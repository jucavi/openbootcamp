package poo.interfaces.sininterface;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDArray {

    List<Empleado> empleados = new ArrayList<>();

    public void add(Empleado empleado) {
        System.out.println("Agregando empleado...");
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "EmpleadoCRUDArray{" +
                "empleados=" + empleados +
                '}';
    }
}
