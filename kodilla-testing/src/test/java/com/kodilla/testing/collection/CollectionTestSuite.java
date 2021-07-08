package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
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

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Metoda testOddNumbersExterminatorEmptyList powinna" +
            "zwrócić pusta listę.")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(0);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(oddNumbersExterminator.exterminate(numbers).get(i));
        }
        int result = numbers.size();
        Assertions.assertEquals(0, result);
    }

    @DisplayName("Metoda testOddNumbersExterminatorNormalList powinna" +
            "zwrócić listę z liczbami parzystymi.")

    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(50);
        System.out.println(oddNumbersExterminator.exterminate(numbers));
        Assertions.assertEquals(25, oddNumbersExterminator.exterminate(numbers).size());
    }
}
