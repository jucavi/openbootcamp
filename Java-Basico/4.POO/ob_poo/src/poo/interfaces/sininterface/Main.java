package poo.interfaces.sininterface;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", "Garcia", 30000, true);
        Empleado empleado2 = new Empleado("Ana", "Lopez", 30000, true);
        Empleado empleado3 = new Empleado("Felix", "Brito", 30000, true);


        // Usando la primera version de clase con el uso de array como base de datos
        /*
        EmpleadoCRUDArray empleadoCRUD = new EmpleadoCRUDArray();

        empleadoCRUD.add(empleado1);
        empleadoCRUD.add(empleado2);
        empleadoCRUD.add(empleado3);

        List<Empleado> empleados = empleadoCRUD.getEmpleados();
        System.out.println(empleados);
         */
   


        // Ussndo nueva version almacenando empleados en base de datos MySQL
        EmpleadosCRUDMySQL empleadoCRUD = new EmpleadosCRUDMySQL();

        empleadoCRUD.createEmpleado(empleado1);
        empleadoCRUD.createEmpleado(empleado2);
        empleadoCRUD.createEmpleado(empleado3);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

    }
}
