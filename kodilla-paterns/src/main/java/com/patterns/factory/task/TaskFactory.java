package com.patterns.factory.task;

public class TaskFactory {

    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "some products", 6.0);

            case PAINTING:
                return new PaintingTask("Painting", "matte black", "car");

            case DRIVING:
                return new DrivingTask("Driving", "Warsaw", "car");

            default:
                return null;
        }
    }
}
