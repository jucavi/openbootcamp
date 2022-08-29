package com.openbootcamp;

public class Solution3 {

    public static void main(String[] args) {

        String[] nombres = { "Ana", "Laura", "Felix", "Carlos", "Javier", "Carla"};
        String sep = " ";
        String punto = ".";
        String line = "";

        for (int i = 0; i < nombres.length; i++) {
            line = line.concat(nombres[i]);

            if (i != nombres.length - 1) {
                line = line.concat(sep);
            } else {
                line = line.concat(punto);
            }
        }

        System.out.println(line);
    }
}

