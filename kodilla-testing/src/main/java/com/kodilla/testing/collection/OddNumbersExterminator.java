package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> numbers;

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            double modulo = numbers.get(i) % 2;
            if (modulo == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }
}
