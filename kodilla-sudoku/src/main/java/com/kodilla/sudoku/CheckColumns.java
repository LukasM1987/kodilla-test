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
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnOne.add(element[i][ElementPosition.ZERO.getElement()]);
        }
        return columnOne;
    }

    public Set<Integer> addElementToColumnTwoSet(int[][] element) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnTwo.add(element[i][ElementPosition.ONE.getElement()]);
        }
        return columnTwo;
    }

    public Set<Integer> addElementToColumnThreeSet(int[][] element) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnThree.add(element[i][ElementPosition.TWO.getElement()]);
        }
        return columnThree;
    }

    public Set<Integer> addElementToColumnFourSet(int[][] element) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnFour.add(element[i][ElementPosition.THREE.getElement()]);
        }
        return columnFour;
    }

    public Set<Integer> addElementToColumnFiveSet(int[][] element) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnFive.add(element[i][ElementPosition.FOUR.getElement()]);
        }
        return columnFive;
    }

    public Set<Integer> addElementToColumnSixSet(int[][] element) {
        for (int i = 0; i < 9; i++) {
            columnSix.add(element[i][ElementPosition.FIVE.getElement()]);
        }
        return columnSix;
    }

    public Set<Integer> addElementToColumnSevenSet(int[][] element) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnSeven.add(element[i][ElementPosition.SIX.getElement()]);
        }
        return columnSeven;
    }

    public Set<Integer> addElementToColumnEightSet(int[][] element) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnEight.add(element[i][ElementPosition.SEVEN.getElement()]);
        }
        return columnEight;
    }

    public Set<Integer> addElementToColumnNineSet(int[][] element) {
        for (int i = 0; i < COLUMN_MAX_SIZE; i++) {
            columnNine.add(element[i][ElementPosition.EIGHT.getElement()]);
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
