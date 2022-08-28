package com.company;

public class IfElse {

    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 6;
        int number3 = 4;
        int number4 = 7;

        boolean check = number1 < number2;

        if (check) {
            System.out.println("verdadero");
        }

        if (number1 < number2 && number2 < number3) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }

        if (number1 < number2 && number2 < number3) {
            System.out.println("verdadero");
        } else if (number4 < 0){
            System.out.println("else if");
        }
    }
}
