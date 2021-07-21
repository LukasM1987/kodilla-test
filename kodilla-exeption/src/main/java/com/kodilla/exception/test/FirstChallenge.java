package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("You can't devide by zero. Error: " + e);
            return 0;
        } finally {
            System.out.println("Operation has been completed.");
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}