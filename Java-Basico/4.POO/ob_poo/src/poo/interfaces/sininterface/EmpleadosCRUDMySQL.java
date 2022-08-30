package poo.interfaces.sininterface;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosCRUDMySQL {


    public void createEmpleado(Empleado empleado) {
        System.out.println("Agregando empleado a base de datos MySQL");
    }

    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<>();
        return empleados;
    }
}
