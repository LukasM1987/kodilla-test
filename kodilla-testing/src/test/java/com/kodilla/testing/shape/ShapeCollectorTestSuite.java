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
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 6);
            Circle circle = new Circle(10);
            Square square = new Square(2);

            //When
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(3, shapeCollector.shapes().size());
        }

        @Test
        void removeFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 6);
            Circle circle = new Circle(10);
            Square square = new Square(2);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertEquals(2, shapeCollector.shapes().size());
        }

        @Test
        void getfigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10, 6);
            Circle circle = new Circle(10);
            Square square = new Square(2);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            //When
            Shape figure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, figure);
        }

        @Test
        void showFiguresTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10);
            Triangle triangle = new Triangle(10, 6);
            Square square = new Square(2);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);

            //When
            String names = "Circle(10), Triangle(10, 6), Square(2)";
            String allShapes = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(names, allShapes);
        }
    }
}
