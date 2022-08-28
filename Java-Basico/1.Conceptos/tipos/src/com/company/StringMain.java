package com.company;

public class StringMain {

     public static void main(String[] args) {
          // la clase String

         /*
               length()
               startsWith()
               endsWith()
               indexOf()
               substring(1, 4)
               trim()
               equals()
               compareTo()
          */

          String mensaje1 = "Este es un mensaje de texto";
          String mensaje2 = " Este es un mensaje de texto  ";

          System.out.println(mensaje1.length());
          String mensajeMayusculas = mensaje2.toUpperCase();
          System.out.println(mensajeMayusculas);
          System.out.println(mensajeMayusculas.trim());

          if (mensajeMayusculas.equals(mensaje2)) {
              System.out.println("Verdadero");
          } else {
               System.out.println("Falso");
          }

          if (mensajeMayusculas.equalsIgnoreCase(mensaje2)) {
               System.out.println("Verdadero");
          }
     }

}
