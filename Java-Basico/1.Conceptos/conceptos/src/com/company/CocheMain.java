package com.company;



public class CocheMain {


    public static void main(String[] args) {

        /*
        Coche cocheObj = new Coche();


        Coche cocheObj2 = new Coche("rojo", "civic", "honda", 1440.45, 5.4);

        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.56;
        System.out.println(cocheObj2);
         */


        CocheElectrico cocheElectricoObj = new CocheElectrico();
        cocheElectricoObj.motorElectrico = "Ejemplo de motorElectrico";
        cocheElectricoObj.color = "red";
        cocheElectricoObj.modelo = "civic";
        cocheElectricoObj.fabricante = "honda";
        cocheElectricoObj.peso = 1350.56;
        cocheElectricoObj.largo = 4.56;

        System.out.println(cocheElectricoObj);

        CocheElectrico cocheElectricoObj2 = new CocheElectrico("rojo", "civic", "honda", 1440.45, 5.45, "TXZ");

        cocheElectricoObj2.acelerar(34);

        System.out.println(cocheElectricoObj2);

    }
}
