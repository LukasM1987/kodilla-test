package com.kodilla.stream.array;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Test
    void testGetAverage() {

        //Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double expectedResult = 5;

        //When
        double averageResulst = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(expectedResult, averageResulst);
    }
}
