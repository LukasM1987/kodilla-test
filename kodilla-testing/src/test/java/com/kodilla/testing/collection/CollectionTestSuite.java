package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Metoda testOddNumbersExterminatorEmptyList powinna zwrócić pustą listę.")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(numbers);
        Assertions.assertEquals(0, oddNumbersExterminator.exterminate().size());
    }

    @DisplayName("Metoda testOddNumbersExterminatorNormalList powinna zwrócić listę z liczbami parzystymi.")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(numbers);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate();

        //Then
        Assertions.assertEquals(Arrays.asList(2, 4), result);
    }

    @Test
    void testOddNumbersExterminatorForOneOddElementList() {
        //Given
        List<Integer> numbers = Collections.singletonList(1);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(numbers);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate();

        //Then
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void testOddNumbersExterminatorForOneEvenElementList() {
        //Given
        List<Integer> numbers = Collections.singletonList(22);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(numbers);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate();

        //Then
        Assertions.assertEquals(Collections.singletonList(22), result);
    }
}
