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

    @DisplayName("Metoda testOddNumbersExterminatorEmptyList powinna zwrócić pustą.")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(0);
        System.out.println("Testuje rozmiar listy: " + oddNumbersExterminator.exterminate(numbers));
        Assertions.assertEquals(0, oddNumbersExterminator.exterminate(numbers).size());
    }

    @DisplayName("Metoda testOddNumbersExterminatorNormalList powinna zwrócić listę z liczbami parzystymi.")

    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(50);
        System.out.println("Testuje rozmiar listy: " + oddNumbersExterminator.exterminate(numbers));
        Assertions.assertEquals(25, oddNumbersExterminator.exterminate(numbers).size());
    }
}
