package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getFiled() {

        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return getShapeName() + "(" + radius + ")";
    }
}