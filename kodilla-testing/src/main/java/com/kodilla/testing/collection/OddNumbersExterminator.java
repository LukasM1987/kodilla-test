package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

<<<<<<< HEAD
    private int listNumberSize;
    public OddNumbersExterminator(int listNumberSize) {
        this.listNumberSize = listNumberSize;
=======
    private int numbersSize;
    public OddNumbersExterminator(int numbersSize) {
        this.numbersSize = numbersSize;
>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
<<<<<<< HEAD
        for (int i = 0; i < listNumberSize; i++) {
=======
        for (int i = 0; i < numbersSize; i++) {
>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)
            double modulo = numbers.get(i) % 2;
            if (modulo == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
