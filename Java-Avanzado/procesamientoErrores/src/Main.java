import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        /*
        try {
            int valor = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            for (StackTraceElement element:  e.getStackTrace()) {
                System.out.println(element.getLineNumber());
                System.out.println(element.getMethodName());
                System.out.println(element.getClassLoaderName());
            }
        }
         */

        try {
            divisionPorCero(5, 1);
        } catch (ArithmeticException | IOException e) {
            System.out.println(e.getMessage());
        }

        Usuarios users = new Usuarios();
        try {
            users.addUsuarios("pepe", "juan", "esteban", "yoe");
        } catch (UsuariosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divisionPorCero(int valor, int dividendo) throws ArithmeticException, IOException  {
        int resultado = 0;

        try {
            resultado = valor / dividendo;

            if (valor == 1) throw new IOException();
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

        return resultado;
    }
}
