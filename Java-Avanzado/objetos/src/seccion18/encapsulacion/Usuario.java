package seccion18.encapsulacion;

public class Usuario {
    private String nombre;
    private int edad;
    private String email;
    private double altura;

    public String getNombre() {
        Accceso acceso = new Accceso();
        acceso.setIntentos(acceso.getIntentos() + 1);

        return nombre;
    }

    public void setNombre(String nombre) {
        EnviarCorreo correo = new EnviarCorreo();
        correo.enviarCorreoDeBimebenida();

        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
