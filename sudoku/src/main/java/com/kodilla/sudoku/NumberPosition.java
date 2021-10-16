package com.kodilla.sudoku;

public enum NumberPosition {

    ONE (1),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9);

    private int elementPosition;

    NumberPosition(int elementPosition) {
        this.elementPosition = elementPosition;
    }

    public int getElement() {
        return elementPosition;
    }
}
