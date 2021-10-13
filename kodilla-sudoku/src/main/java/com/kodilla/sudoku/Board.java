package com.kodilla.sudoku;

public class Board {

    private static final int[][] board = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public int[][] getBoard() {
        return board;
    }

    public int[][] addElementBoard(int x, int y, int element) {
        if (x >= ElementPosition.ONE.getElement() && x <= ElementPosition.NINE.getElement()
                && y >= ElementPosition.ONE.getElement() && y <= ElementPosition.NINE.getElement()) {
            getBoard()[y - 1][x - 1] = element;
            return getBoard();
        }
        return null;
    }

    public void drawBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
