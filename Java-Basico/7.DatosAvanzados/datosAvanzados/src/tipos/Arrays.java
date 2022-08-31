package tipos;

public class Arrays {

    @SuppressWarnings("ManualArrayCopy")
    public static void demoArrays() {
        // Declarar un array
        int []arrayUno = new int[5];

        // Asignar valores a un array previamente declarado:
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        // Declarar e inicializar un array
        String []arrayDos = {"Naranja", "Limon", "Pomelo"};

        // Recorrer un array:
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println("Posicion del array " + i + " contiene el valor " + arrayUno[i]);
        }

        // Recorrer un array con la forma corta:
        for (String citrico : arrayDos) {
            System.out.println("Cítrico actual " + citrico);
        }

        // Declarar un array multidimensional
        int [][]arrayBidiUno = new int[2][4];

        // Asignar valores a un array multidimensional previamente declarado:
        arrayBidiUno[0][0] = 1;
        arrayBidiUno[0][1] = 2;
        arrayBidiUno[0][2] = 3;
        arrayBidiUno[0][3] = 4;

        arrayBidiUno[1][0] = 10;
        arrayBidiUno[1][1] = 20;
        arrayBidiUno[1][2] = 30;
        arrayBidiUno[1][3] = 40;

        // Recorrer un array bidimensional:
        for (int i = 0; i < arrayBidiUno.length; i++) {
            for (int j = 0; j < arrayBidiUno[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiUno[i][j]);
            }
        }

        // Declarar e inicializar un array multidimensional
        int [][]arrayBidiDos = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
        };

        // Recorrer un array bidimensional:
        for (int i = 0; i < arrayBidiDos.length; i++) {
            for (int j = 0; j < arrayBidiDos[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiDos[i][j]);
            }
        }

        // "Crecer" un array.
        // Solo podemos hacerlo creando uno nuevo de más tamaño y llenándolo con el contenido del original.
        int nuevoArrayLen = arrayUno.length * 2;
        int []nuevoArray = new int[nuevoArrayLen];

        // Esto dará un warning: Copia manual del array
        for (int i = 0; i < arrayUno.length; i++) {
            nuevoArray[i] = arrayUno[i];
        }

        // Para copiar un array "elegántemente":
        System.arraycopy(nuevoArray, 0, arrayUno, 0, arrayUno.length);
    }

}
