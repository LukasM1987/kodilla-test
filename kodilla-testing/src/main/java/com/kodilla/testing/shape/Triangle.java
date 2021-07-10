package com.kodilla.testing.shape;

public class Triangle implements Shape {

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getFiled(int a) {
        return (double) a/2 * a;
    }
}
