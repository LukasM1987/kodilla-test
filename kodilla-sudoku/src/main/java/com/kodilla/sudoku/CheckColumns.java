package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckColumns {

    private static final int COLUMN_MAX_SIZE = 9;

    private final Set<Integer> columnOne = new HashSet<>();
    private final Set<Integer> columnTwo = new HashSet<>();
    private final Set<Integer> columnThree = new HashSet<>();
    private final Set<Integer> columnFour = new HashSet<>();
    private final Set<Integer> columnFive = new HashSet<>();
    private final Set<Integer> columnSix = new HashSet<>();
    private final Set<Integer> columnSeven = new HashSet<>();
    private final Set<Integer> columnEight = new HashSet<>();
    private final Set<Integer> columnNine = new HashSet<>();

    public Set<Integer> addElementToColumnOneSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnOne.add(element[i][0]);
        }
        return columnOne;
    }

    public Set<Integer> addElementToColumnTwoSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnTwo.add(element[i][1]);
        }
        return columnTwo;
    }

    public Set<Integer> addElementToColumnThreeSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnThree.add(element[i][2]);
        }
        return columnThree;
    }

    public Set<Integer> addElementToColumnFourSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnFour.add(element[i][3]);
        }
        return columnFour;
    }

    public Set<Integer> addElementToColumnFiveSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnFive.add(element[i][4]);
        }
        return columnFive;
    }

    public Set<Integer> addElementToColumnSixSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnSix.add(element[i][5]);
        }
        return columnSix;
    }

    public Set<Integer> addElementToColumnSevenSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnSeven.add(element[i][6]);
        }
        return columnSeven;
    }

    public Set<Integer> addElementToColumnEightSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnEight.add(element[i][7]);
        }
        return columnEight;
    }

    public Set<Integer> addElementToColumnNineSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnNine.add(element[i][8]);
        }
        return columnNine;
    }

    public boolean checkAllColumns() {
        if (columnOne.size() == COLUMN_MAX_SIZE
                && columnTwo.size() == COLUMN_MAX_SIZE
                && columnThree.size() == COLUMN_MAX_SIZE
                && columnFour.size() == COLUMN_MAX_SIZE
                && columnFive.size() == COLUMN_MAX_SIZE
                && columnSix.size() == COLUMN_MAX_SIZE
                && columnSeven.size() == COLUMN_MAX_SIZE
                && columnEight.size() == COLUMN_MAX_SIZE
                && columnNine.size() == COLUMN_MAX_SIZE) {
            return true;
        } else {
            return false;
        }
    }
}
