package com.kodilla.sudoku;

public enum SudokuElements {

    ZERO (0),
    ONE (1),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9);

    private int element;

    SudokuElements(int element) {
        this.element = element;
    }

    public int getElement() {
        return element;
    }
}
