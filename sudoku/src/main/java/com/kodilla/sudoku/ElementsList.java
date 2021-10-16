package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class ElementsList {
    private static final List<String> gameElements = new ArrayList<>();
    private static final List<Integer> gameNumbers = new ArrayList<>();

    public List<String> elements() {
        gameElements.add(SudokuElements.ONE.getElement());
        gameElements.add(SudokuElements.TWO.getElement());
        gameElements.add(SudokuElements.THREE.getElement());
        gameElements.add(SudokuElements.FOUR.getElement());
        gameElements.add(SudokuElements.FIVE.getElement());
        gameElements.add(SudokuElements.SIX.getElement());
        gameElements.add(SudokuElements.SEVEN.getElement());
        gameElements.add(SudokuElements.EIGHT.getElement());
        gameElements.add(SudokuElements.NINE.getElement());
        gameElements.add(SudokuElements.SUDOKU_SOLVE.getElement());
        gameElements.add(SudokuElements.FINISH.getElement());
        return gameElements;
    }

    public List<Integer> numbers() {
        gameNumbers.add(NumberPosition.ONE.getElement());
        gameNumbers.add(NumberPosition.TWO.getElement());
        gameNumbers.add(NumberPosition.THREE.getElement());
        gameNumbers.add(NumberPosition.FOUR.getElement());
        gameNumbers.add(NumberPosition.FIVE.getElement());
        gameNumbers.add(NumberPosition.SIX.getElement());
        gameNumbers.add(NumberPosition.SEVEN.getElement());
        gameNumbers.add(NumberPosition.EIGHT.getElement());
        gameNumbers.add(NumberPosition.NINE.getElement());
        return gameNumbers;
    }
}
