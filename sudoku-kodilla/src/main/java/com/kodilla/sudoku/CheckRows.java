package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckRows {

    private static final int ROWS_MAX_SIZE = 9;

    private final Set<Integer> numbers = new HashSet<>();

    public boolean checkAllRows(int[][] board) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            for (int j = 0; j < ROWS_MAX_SIZE; j++) {
                if (addElementsToSet(board[i][j], j)) return false;
            }
            numbers.clear();
        }
        return true;
    }

    private boolean addElementsToSet(int e, int j) {
        numbers.add(e);
        if (j == ROWS_MAX_SIZE - 1) {
            return numbers.size() != ROWS_MAX_SIZE || numbers.contains(0);
        }
        return false;
    }
}
