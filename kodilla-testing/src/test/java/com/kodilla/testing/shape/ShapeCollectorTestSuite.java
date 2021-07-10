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
            Assertions.assertEquals(4, shapeCollector.addFigure(new Circle()).size());
        }

        @Test
        void removeFigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Assertions.assertEquals(3, shapeCollector.removeFigure(new Circle()).size());
        }

        @Test
        void getfigureTest() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Assertions.assertEquals(new Circle(), shapeCollector.getFigure(3));
        }

        @Test
        void showFiguresTest() {
            String names = "Circle, Triangle, Square";
            ShapeCollector shapeCollector = new ShapeCollector();
            Assertions.assertEquals(names, shapeCollector.showFigures());
        }
    }
}
