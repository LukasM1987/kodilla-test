package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private int listNumberSize;
    public OddNumbersExterminator(int listNumberSize) {
        this.listNumberSize = listNumberSize;
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < listNumberSize; i++) {
            double modulo = numbers.get(i) % 2;
            if (modulo == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
