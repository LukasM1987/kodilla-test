package com.kodilla.sudoku;

public enum SudokuChoice {

    FINISH ("FINISH"),
    SUDOKU ("SUDOKU");

    private String choice;

    SudokuChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }
}
