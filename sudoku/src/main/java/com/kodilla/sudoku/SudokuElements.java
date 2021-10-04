package com.kodilla.sudoku;

public enum SudokuElements {

    ONE (" 1 "),
    TWO (" 2 "),
    THREE (" 3 "),
    FOUR (" 4 "),
    FIVE (" 5 "),
    SIX (" 6 "),
    SEVEN (" 7 "),
    EIGHT (" 8 "),
    NINE (" 9 "),
    EMPTY ("   "),
    SUDOKU_SOLVE (" SUDOKU "),
    FINISH (" FINISH ");

    private String element;

    SudokuElements(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }
}
