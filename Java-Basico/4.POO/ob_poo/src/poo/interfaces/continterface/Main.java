package poo.interfaces.continterface;

import poo.interfaces.sininterface.Empleado;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", "Garcia", 30000, true);
        Empleado empleado2 = new Empleado("Ana", "Lopez", 30000, true);
        Empleado empleado3 = new Empleado("Felix", "Brito", 30000, true);

        // Implementación con interfaces

        // Implementación almacenada en un array
        EmpleadoCRUD empleadoCRUD1 = new EmpleadoCRUDArray();

        // Implementación almacenada en base de datos MySQL
        EmpleadoCRUD empleadoCRUD2 = new EmpleadoCRUDMySQL();

        empleadoCRUD1.save(empleado1);
        empleadoCRUD1.save(empleado2);
        empleadoCRUD1.save(empleado3);

        System.out.println(empleadoCRUD1.findAll());

        empleadoCRUD2.save(empleado1);
        empleadoCRUD2.save(empleado2);
        empleadoCRUD2.save(empleado3);

        System.out.println(empleadoCRUD2.findAll());

        // se puede usar la misma lógica para ambas implementaciones para la clase Main es transparente.
        // y esto se logra con las interfaces.

    }
}
