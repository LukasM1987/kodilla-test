package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckColumns {

    private static final int COLUMN_MAX_SIZE = 9;

    private final Set<Integer> numbers = new HashSet<>();

    public boolean checkAllColumns(int[][] board) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            for (int j = 0; j < COLUMN_MAX_SIZE; j++) {
                if (addElementsToSet(board[j][i], j)) return false;
            }
            numbers.clear();
        }
        return true;
    }

    private boolean addElementsToSet(int e, int j) {
        numbers.add(e);
        if (j == COLUMN_MAX_SIZE - 1) {
            if (numbers.size() != COLUMN_MAX_SIZE || numbers.contains(0)) {
                return true;
            }
        }
        return false;
    }
}
