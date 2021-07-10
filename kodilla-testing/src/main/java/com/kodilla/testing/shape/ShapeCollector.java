package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    public List<Shape> addFigure(Shape shape) {
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(shape);
        return shapes;
    }

    public List<Shape> removeFigure(int shape) {
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.remove(shape);
        return shapes;
    }

    public Shape getFigure(int n) {
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        return shapes.get(n);
    }

    public String showFigures() {
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        String figureNames = "";
        for (int i = 0; i < shapes.size(); i++) {
            figureNames = figureNames + shapes.get(i).getShapeName();
            if (i < shapes.size() - 1) {
                figureNames = figureNames + ", ";
            }
        }
        return figureNames;
    }
}
