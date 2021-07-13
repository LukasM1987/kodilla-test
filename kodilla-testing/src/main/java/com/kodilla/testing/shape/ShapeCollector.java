package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public String showFigures() {
        String figures = "";
        for (int i = 0; i < shapes.size(); i++) {
            figures = figures + shapes.get(i).getShapeName() + " Pole: " + shapes.get(i).getFiled();
            if (i < shapes.size() - 1) {
                figures = figures + ", ";
            }
        }
        return figures;
    }
}
