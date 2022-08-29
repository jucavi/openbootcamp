package com.company;

public class TryCatchMain {


    public static void main(String[] args) {

         try {
             int result = 5 / 5;
         } catch (ArithmeticException e) {
             e.printStackTrace();
         } finally {
             System.out.println("Ciere de recursos");
         }


        System.out.println("fin");

    }
}
