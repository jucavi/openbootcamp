import java.io.*;

public class Session10 {

    public static void main(String[] args) {
        //leerTodo();
        //leerByteAByte();
        leerConBuffer();
    }

    public static void leerTodo() {

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            byte[] datos = fichero.readAllBytes();
            for (byte dato : datos) {
                System.out.print((char) dato);
            }
        } catch (IOException e) {
            System.out.println("No puedo leerlo: " + e.getMessage());
        }

    }

    public static void leerByteAByte() {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte []datos = new byte[5];
                int data = fichero.read(datos);


                while (data != -1) {
                    System.out.println("Leído: '" + (char) data + "' que es el código " + data);
                    data = fichero.read();
                }

            } catch (IOException e) {
                System.out.println("Error al leer: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir fichero: " + e.getMessage());
        }
    }

    public static void leerConBuffer() {

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffer.read();

                while (dato != -1) {
                    System.out.println((char)dato);
                    dato = ficheroBuffer.read();
                }
                fichero.close();

            } catch (IOException e) {
                System.out.println("Error al leer: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir fichero: " + e.getMessage());
        }
    }
}
