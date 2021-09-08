package com.example.kodillaspring142.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(double val) {
        System.out.println("Final value: " + val);
    }
}