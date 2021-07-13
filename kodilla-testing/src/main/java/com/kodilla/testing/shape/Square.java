package com.kodilla.testing.shape;

public class Square implements Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getFiled() {
        return a * a;
    }
}