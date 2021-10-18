package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) throws RowException {
        Engine engine = new Engine();
        engine.gameLoop();
    }
}
