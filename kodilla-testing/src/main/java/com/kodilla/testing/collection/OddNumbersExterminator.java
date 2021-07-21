package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

<<<<<<< HEAD
<<<<<<< HEAD
    private int listNumberSize;
    public OddNumbersExterminator(int listNumberSize) {
        this.listNumberSize = listNumberSize;
=======
    private int numbersSize;
    public OddNumbersExterminator(int numbersSize) {
        this.numbersSize = numbersSize;
>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)
=======
    private List<Integer> numbers;

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
>>>>>>> d04370f (KOD-6.3 fix after review)
    }

    public List<Integer> exterminate() {
        List<Integer> evenNumbers = new ArrayList<>();
<<<<<<< HEAD
<<<<<<< HEAD
        for (int i = 0; i < listNumberSize; i++) {
=======
        for (int i = 0; i < numbersSize; i++) {
>>>>>>> 06a5de6 (KOD-6.3 Collection odd numbers test)
            double modulo = numbers.get(i) % 2;
=======
        for (int i = 0; i < numbers.size(); i++) {
            int modulo = numbers.get(i) % 2;
>>>>>>> d04370f (KOD-6.3 fix after review)
            if (modulo == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }
}
