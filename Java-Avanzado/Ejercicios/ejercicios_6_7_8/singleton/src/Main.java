public class Main {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance("Ya llegas tarde");
        Singleton singleton2 = Singleton.getInstance("los últimos serán los primeros");

        System.out.println(singleton1.whoAmI() + " ... " + singleton2.whoAmI());
    }
}
