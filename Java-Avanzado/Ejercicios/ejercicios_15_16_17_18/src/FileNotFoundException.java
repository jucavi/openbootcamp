public class FileNotFoundException extends ExerciseException {

    public FileNotFoundException() {}
    public FileNotFoundException(String message) {
        super("FileNotFoundException " + message);
    }
}
