package poo.interfaces.sininterface;

public class Empleado {

    String nombre;
    String apellido;
    int salario;
    boolean alta;

    public Empleado() {}

    public Empleado(String nombre, String apellido, int salario, boolean alta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
