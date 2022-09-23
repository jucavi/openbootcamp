package S.ejemplo;

public class Usuario {
    public void crearUsuario(String nombre) {}
    public void obtenerUsuario(String nombre) {}

    public void enviarEmail(String nombre) {
        // rompe con el principio de responsabilidad única si implementamos aquí la lógica
        // LÓGICA
    }

    public void notificarUsuario() {
        // La forma correcta sería tener una clase dedicada al envío de correos
        Correo correo = new Correo();
        correo.enviarEmail(this);
    }
}


