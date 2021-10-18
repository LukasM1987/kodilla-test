package com.kodilla.sudoku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SudokuReader {

    private static final int ROW_SIZE = 9;
    private static final int COLUMN_SIZE = 9;
    private static final List<String> numbers = new ArrayList<>();

    private int[][] unsolvedBoard = new int[ROW_SIZE][COLUMN_SIZE];

    public List<String> toList() {
        return numbers;
    }

    public void readFile(String fileName) throws RowException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("kodilla-sudoku/src/main/resources/sudoku/" + fileName));
            String row;
            while ((row = bufferedReader.readLine()) != null) {
                toList().add(row);
                if (row.length() != ROW_SIZE) {
                    throw new RowException("The line doesn't have nine numbers!");
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[][] boardConverter() {
        for (int i = 0; i < COLUMN_SIZE; i++) {
            for (int j = 0; j < ROW_SIZE; j++) {
                unsolvedBoard[i][j] = Integer.parseInt(String.valueOf(String.valueOf(toList().get(i)).charAt(j)));
            }
        }
        return unsolvedBoard;
    }

    public int[][] getBoard() {
        return unsolvedBoard;
    }

    public int[][] addElementBoard(int x, int y, int element) {
        if (x >= ElementPosition.ONE.getElement() && x <= ElementPosition.NINE.getElement()
                && y >= ElementPosition.ONE.getElement() && y <= ElementPosition.NINE.getElement()) {
            getBoard()[y - 1][x - 1] = element;
            return getBoard();
        }
        return null;
    }

    public void print () {
        for (int i = 0; i < unsolvedBoard.length; i++) {
            for (int j = 0; j < unsolvedBoard.length; j++) {
                System.out.print(unsolvedBoard[i][j]);
            }
            System.out.println();
        }
    }
}
