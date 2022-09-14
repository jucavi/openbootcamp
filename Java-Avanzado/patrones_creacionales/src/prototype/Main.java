package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CocheProtoManual cocheProtoManual = new CocheProtoManual();
        cocheProtoManual.marca = "Ford";
        cocheProtoManual.modelo = "Fiesta";
        cocheProtoManual.puertas = 5;

        System.out.println(cocheProtoManual.marca + " " + cocheProtoManual.modelo + " " + cocheProtoManual.puertas);

        CocheProtoManual clon = cocheProtoManual.clonar();
        clon.puertas = 3;
        System.out.println(clon.marca + " " + clon.modelo + " " + clon.puertas);



        CocheProto cocheProto = new CocheProto();
        cocheProto.marca = "Peugeot";
        cocheProto.modelo = "208";
        cocheProto.puertas = 4;

        System.out.println(cocheProto.marca + " " + cocheProto.modelo + " " + cocheProto.puertas);
        try {
            CocheProto cocheProtoClon = cocheProto.clonar();
            cocheProtoClon.puertas = 8;
            System.out.println(cocheProtoClon.marca + " " + cocheProtoClon.modelo + " " + cocheProtoClon.puertas);
        } catch (CloneNotSupportedException e) {
            System.out.println("Coche no se pudo clonar " + e.getMessage());
        }


    }
}
