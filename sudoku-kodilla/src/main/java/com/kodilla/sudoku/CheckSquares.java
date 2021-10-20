package com.kodilla.sudoku;
import java.util.HashSet;
import java.util.Set;

public class CheckSquares {

    private static final int SQUARE_MAX_SIZE = 9;
    private static final int SQUARE_LENGTH = 3;
    private static final int SQUARE_MOVE_NEXT_POSITION = 3;

    private final Set<Integer> squareNumbers = new HashSet<>();

    public boolean checkAllSquares(int[][] element) {
        for (int squareVertical = 0; squareVertical < SQUARE_MAX_SIZE; squareVertical += SQUARE_MOVE_NEXT_POSITION) {
            if (initSquareHorizontal(element, squareVertical)) return false;
        }
        return true;
    }

    private boolean initSquareHorizontal(int[][] element, int squareVertical) {
        for (int squareHorizontal = 0; squareHorizontal < SQUARE_MAX_SIZE; squareHorizontal += SQUARE_MOVE_NEXT_POSITION) {
            if (checkSmallSquareVertical(element, squareVertical, squareHorizontal)) return true;
        }
        return false;
    }

    private boolean checkSmallSquareVertical(int[][] element, int squareVertical, int squareHorizontal) {
        for (int i = squareVertical; i < SQUARE_LENGTH + squareVertical; i++) {
            if (checkSmallSquareHorizontal(element[i], i == SQUARE_LENGTH - 1 + squareVertical, squareHorizontal)) return true;
        }
        squareNumbers.clear();
        return false;
    }

    private boolean checkSmallSquareHorizontal(int[] ints, boolean b, int squareHorizontal) {
        for (int j = squareHorizontal; j < SQUARE_LENGTH + squareHorizontal; j++) {
            squareNumbers.add(ints[j]);
        }
        if (b) {
            if (squareNumbers.size() != SQUARE_MAX_SIZE || squareNumbers.contains(0)) {
                return true;
            }
        }
        return false;
    }
}
