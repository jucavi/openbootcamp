public class Singleton {
    private static Singleton instance;
    private static String instanceName;

    // Constructor vacío privado no accesible
    private Singleton() {}

    public static Singleton getInstance(String name) {
        if (instance == null) {
            instance = new Singleton();
            instanceName = name;
        }
        return instance;
    }

    public String whoAmI() {
        return instanceName;
    }
}
