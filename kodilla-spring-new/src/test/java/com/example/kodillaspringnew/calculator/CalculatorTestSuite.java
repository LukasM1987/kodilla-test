package com.example.kodillaspringnew.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void addMethodTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodillaspringnew.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.add(3, 7);

        //Then
        Assertions.assertEquals(10, result);
    }

    @Test
    void subMethodTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodillaspringnew.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.sub(3, 7);

        //Then
        Assertions.assertEquals(-4, result);
    }

    @Test
    void mulMethodTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodillaspringnew.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.mul(3, 7);

        //Then
        Assertions.assertEquals(21, result);
    }

    @Test
    void divMethodTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodillaspringnew.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.div(10, 5);

        //Then
        Assertions.assertEquals(2, result);
    }

    @Test
    void allMethodsTest() {
        double add = calculator.add(4,7);
        double sub = calculator.sub(4,7);
        double mul = calculator.mul(4,7);
        double div = calculator.div(10, 5);

        Assertions.assertAll(
                () -> Assertions.assertEquals(11, add),
                () -> Assertions.assertEquals(-3, sub),
                () -> Assertions.assertEquals(28, mul),
                () -> Assertions.assertEquals(2, div)
        );
    }
}
