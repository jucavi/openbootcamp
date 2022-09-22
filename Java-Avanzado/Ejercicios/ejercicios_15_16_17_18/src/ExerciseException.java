public class ExerciseException extends Exception {

    public ExerciseException() {}
    public ExerciseException(String message) {
        super("ExerciseException: " + message);
    }

}
