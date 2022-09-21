public class Main {
    public static void main(String[] args) {
        /*
         He utilizado el patrón de comportamiento Iterator, para recorrer la lista de listeners en la clase
         EventManager, no creo que esto aporte nada a la solución teniendo en cuenta lo simple que es recorrer una lista,
         pero no se me ocurrió con los ejercicios antes tratados la aplicación de este u otro patron de comportamiento.
         */
        EventManager evento1 = new EventManager();

        PopUpListener popup1 = new PopUpListener("Hola", "Primer popup!!");
        BGColorListener bgColorRed = new BGColorListener("Red");

        evento1.subscribe(popup1);
        evento1.subscribe(bgColorRed);
        evento1.sendMessage();

        EventManager evento2 = new EventManager();

        PopUpListener popup2 = new PopUpListener("Adios", "Adios!!");

        evento2.subscribe(popup2);
        evento2.sendMessage();
    }
}
