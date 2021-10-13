package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElementsList {

    private static final List<Integer> gameElements = new ArrayList<>();
    private static final List<Integer> gameNumbers = new ArrayList<>();
    private static final List<String> gameChoices = new ArrayList<>();
    private static final List<String> gameStringElements = new ArrayList<>();

    public List<Integer> elements() {
        gameElements.add(SudokuElements.ONE.getElement());
        gameElements.add(SudokuElements.TWO.getElement());
        gameElements.add(SudokuElements.THREE.getElement());
        gameElements.add(SudokuElements.FOUR.getElement());
        gameElements.add(SudokuElements.FIVE.getElement());
        gameElements.add(SudokuElements.SIX.getElement());
        gameElements.add(SudokuElements.SEVEN.getElement());
        gameElements.add(SudokuElements.EIGHT.getElement());
        gameElements.add(SudokuElements.NINE.getElement());
        return gameElements;
    }

    public List<Integer> numbers() {
        gameNumbers.add(ElementPosition.ONE.getElement());
        gameNumbers.add(ElementPosition.TWO.getElement());
        gameNumbers.add(ElementPosition.THREE.getElement());
        gameNumbers.add(ElementPosition.FOUR.getElement());
        gameNumbers.add(ElementPosition.FIVE.getElement());
        gameNumbers.add(ElementPosition.SIX.getElement());
        gameNumbers.add(ElementPosition.SEVEN.getElement());
        gameNumbers.add(ElementPosition.EIGHT.getElement());
        gameNumbers.add(ElementPosition.NINE.getElement());
        return gameNumbers;
    }

    public List<String> stringElements() {
        gameStringElements.add(SudokuStringElement.ONE.getStringElement());
        gameStringElements.add(SudokuStringElement.TWO.getStringElement());
        gameStringElements.add(SudokuStringElement.THREE.getStringElement());
        gameStringElements.add(SudokuStringElement.FOUR.getStringElement());
        gameStringElements.add(SudokuStringElement.FIVE.getStringElement());
        gameStringElements.add(SudokuStringElement.SIX.getStringElement());
        gameStringElements.add(SudokuStringElement.SEVEN.getStringElement());
        gameStringElements.add(SudokuStringElement.EIGHT.getStringElement());
        gameStringElements.add(SudokuStringElement.NINE.getStringElement());
        gameStringElements.add(SudokuChoice.FINISH.getChoice());
        gameStringElements.add(SudokuChoice.SUDOKU.getChoice());
        return gameStringElements;
    }

    public List<String> choices() {
        gameChoices.add(SudokuChoice.SUDOKU.getChoice());
        gameChoices.add(SudokuChoice.FINISH.getChoice());
        return gameChoices;
    }
}
