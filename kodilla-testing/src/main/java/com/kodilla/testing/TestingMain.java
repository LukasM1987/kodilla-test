package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        Calculator calculator = new Calculator();

        if (calculator.add(4, 9) == 13) {
            System.out.println("add Ok");
        } else {
            System.out.println("add Error");
        }

        if (calculator.subtract(4, 9) == -5) {
            System.out.println("substract Ok");
        } else {
            System.out.println("substract Error");
        }
    }
}
