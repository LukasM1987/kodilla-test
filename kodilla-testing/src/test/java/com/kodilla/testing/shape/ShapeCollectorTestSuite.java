package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Test For ShapeCollector")
    class TestShape {

        @Test
        void addFigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 6);
            shapeCollector.addFigure(triangle);
            Circle circle = new Circle(10);
            shapeCollector.addFigure(circle);
            Square square = new Square(2);
            shapeCollector.addFigure(square);
            Assertions.assertEquals(3, shapeCollector.shapes.size());
        }

        @Test
        void removeFigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 6);
            shapeCollector.addFigure(triangle);
            Circle circle = new Circle(10);
            shapeCollector.addFigure(circle);
            Square square = new Square(2);
            shapeCollector.addFigure(square);
            shapeCollector.removeFigure(triangle);
            Assertions.assertEquals(2, shapeCollector.shapes.size());
        }

        @Test
        void getfigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10, 6);
            shapeCollector.addFigure(triangle);
            Circle circle = new Circle(10);
            shapeCollector.addFigure(circle);
            Square square = new Square(2);
            shapeCollector.addFigure(square);
            Assertions.assertEquals("Triangle", shapeCollector.getFigure(0).getShapeName());
        }

        @Test
        void showFiguresTest() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10);
            shapeCollector.addFigure(circle);
            Triangle triangle = new Triangle(10, 6);
            shapeCollector.addFigure(triangle);
            Square square = new Square(2);
            shapeCollector.addFigure(square);
            String names = "Circle Pole: 314.1592653589793, Triangle Pole: 30.0, Square Pole: 4.0";
            Assertions.assertEquals(names, shapeCollector.showFigures());
        }
    }
}
