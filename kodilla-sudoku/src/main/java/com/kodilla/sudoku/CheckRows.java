package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckRows {

    private static final int ROWS_MAX_SIZE = 9;

    private final Set<Integer> rowOne = new HashSet<>();
    private final Set<Integer> rowTwo = new HashSet<>();
    private final Set<Integer> rowThree = new HashSet<>();
    private final Set<Integer> rowFour = new HashSet<>();
    private final Set<Integer> rowFive = new HashSet<>();
    private final Set<Integer> rowSix = new HashSet<>();
    private final Set<Integer> rowSeven = new HashSet<>();
    private final Set<Integer> rowEight = new HashSet<>();
    private final Set<Integer> rowNine = new HashSet<>();

    public Set<Integer> addElementToRowOneSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowOne.add(element[0][i]);
        }
        return rowOne;
    }

    public Set<Integer> addElementToRowTwoSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowTwo.add(element[1][i]);
        }
        return rowTwo;
    }

    public Set<Integer> addElementToRowThreeSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowThree.add(element[2][i]);
        }
        return rowThree;
    }

    public Set<Integer> addElementToRowFourSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowFour.add(element[3][i]);
        }
        return rowFour;
    }

    public Set<Integer> addElementToRowFiveSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowFive.add(element[4][i]);
        }
        return rowFive;
    }

    public Set<Integer> addElementToRowSixSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowSix.add(element[5][i]);
        }
        return rowSix;
    }

    public Set<Integer> addElementToRowSevenSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowSeven.add(element[6][i]);
        }
        return rowSeven;
    }

    public Set<Integer> addElementToRowEightSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowEight.add(element[7][i]);
        }
        return rowEight;
    }

    public Set<Integer> addElementToRowNineSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            rowNine.add(element[8][i]);
        }
        return rowNine;
    }

    public boolean checkAllRows() {
        if (rowOne.size() == ROWS_MAX_SIZE
                && rowTwo.size() == ROWS_MAX_SIZE
                && rowThree.size() == ROWS_MAX_SIZE
                && rowFour.size() == ROWS_MAX_SIZE
                && rowFive.size() == ROWS_MAX_SIZE
                && rowSix.size() == ROWS_MAX_SIZE
                && rowSeven.size() == ROWS_MAX_SIZE
                && rowEight.size() == ROWS_MAX_SIZE
                && rowNine.size() == ROWS_MAX_SIZE) {
            return true;
        } else {
            return false;
        }
    }
}
