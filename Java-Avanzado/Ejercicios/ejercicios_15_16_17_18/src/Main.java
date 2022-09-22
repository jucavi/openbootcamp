import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[] citizens = {"Cuban", "Czech", "German", "English", "Spanish", "Norwegian"};

            System.out.println(getElementAt(citizens, 8));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(readFile("invalid/path/to/file.txt"));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int divide(int x, int y) throws ArithmeticException {
        if (y == 0) throw new ArithmeticException("Zero division is not allowed");
        return x / y;
    }

    public static String getElementAt(String[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (arr.length <= index) throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        return arr[index];
    }

    public static String readFile(String path) throws FileNotFoundException {
        StringBuilder result = new StringBuilder();

        try {
            Scanner file = new Scanner(new File(path));

            while (file.hasNextLine()) {
                result.append(file.nextLine()).append("\n");
            }

        } catch (Exception e) {
            throw new FileNotFoundException("File not found: " + path);
        }

        return result.toString();
    }
}
