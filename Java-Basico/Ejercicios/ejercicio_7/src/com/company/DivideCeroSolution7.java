package com.company;

public class DivideCeroSolution7 {

    public static void main(String[] args) {

        try {
            double res = divideCero(6, 0);
            System.out.println(res);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    private static double divideCero(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}
