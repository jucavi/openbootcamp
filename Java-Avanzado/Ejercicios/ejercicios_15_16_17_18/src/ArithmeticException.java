public class ArithmeticException extends ExerciseException {

    public ArithmeticException() {}
    public ArithmeticException(String message) {
        super("ArithmeticException " + message);
    }
}
