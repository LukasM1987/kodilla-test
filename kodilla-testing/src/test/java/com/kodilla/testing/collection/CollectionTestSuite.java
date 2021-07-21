package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
<<<<<<< HEAD
=======

>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)
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

<<<<<<< HEAD
    @DisplayName("Metoda testOddNumbersExterminatorEmptyList powinna" +
            "zwrócić pusta listę.")
=======
    @DisplayName("Metoda testOddNumbersExterminatorEmptyList powinna zwrócić pustą.")
>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)

    @Test
    void testOddNumbersExterminatorEmptyList() {
<<<<<<< HEAD
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(0);
<<<<<<< HEAD
        System.out.println("Testuje rozmiar listy: " + oddNumbersExterminator.exterminate(numbers).size());
        Assertions.assertEquals(0, oddNumbersExterminator.exterminate(numbers).size());
    }

    @DisplayName("Metoda testOddNumbersExterminatorNormalList powinna" +
            "zwrócić listę z liczbami parzystymi.")
=======
        System.out.println("Testuje rozmiar listy: " + oddNumbersExterminator.exterminate(numbers));
        Assertions.assertEquals(0, oddNumbersExterminator.exterminate(numbers).size());
=======
        //Given
        List<Integer> numbers = Collections.emptyList();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(numbers);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate();

        //Then
        Assertions.assertTrue(result.isEmpty());

>>>>>>> d04370f (KOD-6.3 fix after review)
    }

    @DisplayName("Metoda testOddNumbersExterminatorNormalList powinna zwrócić listę z liczbami parzystymi.")
>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)

    @Test
    void testOddNumbersExterminatorNormalList() {
<<<<<<< HEAD
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(50);
<<<<<<< HEAD
        System.out.println(oddNumbersExterminator.exterminate(numbers));
=======
        System.out.println("Testuje rozmiar listy: " + oddNumbersExterminator.exterminate(numbers));
>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)
        Assertions.assertEquals(25, oddNumbersExterminator.exterminate(numbers).size());
=======
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
>>>>>>> d04370f (KOD-6.3 fix after review)
    }
}
