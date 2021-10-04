package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckColumns {

    private static final int COLUMN_MAX_SIZE = 9;

    private final Set<String> columnOne = new HashSet<>();
    private final Set<String> columnTwo = new HashSet<>();
    private final Set<String> columnThree = new HashSet<>();
    private final Set<String> columnFour = new HashSet<>();
    private final Set<String> columnFive = new HashSet<>();
    private final Set<String> columnSix = new HashSet<>();
    private final Set<String> columnSeven = new HashSet<>();
    private final Set<String> columnEight = new HashSet<>();
    private final Set<String> columnNine = new HashSet<>();

    public Set<String> addElementToColumnOneSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnOne.add(element[i + 1][1]);
        }
        for (int i = 0; i < 3; i++) {
            columnOne.add(element[i + 5][1]);
        }
        for (int i = 0; i < 3; i++) {
            columnOne.add(element[i + 9][1]);
        }
        return columnOne;
    }

    public Set<String> addElementToColumnTwoSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnTwo.add(element[i + 1][2]);
        }
        for (int i = 0; i < 3; i++) {
            columnTwo.add(element[i + 5][2]);
        }
        for (int i = 0; i < 3; i++) {
            columnTwo.add(element[i + 9][2]);
        }
        return columnTwo;
    }

    public Set<String> addElementToColumnThreeSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnThree.add(element[i + 1][3]);
        }
        for (int i = 0; i < 3; i++) {
            columnThree.add(element[i + 5][3]);
        }
        for (int i = 0; i < 3; i++) {
            columnThree.add(element[i + 9][3]);
        }
        return columnThree;
    }

    public Set<String> addElementToColumnFourSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnFour.add(element[i + 1][5]);
        }
        for (int i = 0; i < 3; i++) {
            columnFour.add(element[i + 5][5]);
        }
        for (int i = 0; i < 3; i++) {
            columnFour.add(element[i + 9][5]);
        }
        return columnFour;
    }

    public Set<String> addElementToColumnFiveSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnFive.add(element[i + 1][6]);
        }
        for (int i = 0; i < 3; i++) {
            columnFive.add(element[i + 5][6]);
        }
        for (int i = 0; i < 3; i++) {
            columnFive.add(element[i + 9][6]);
        }
        return columnFive;
    }

    public Set<String> addElementToColumnSixSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnSix.add(element[i + 1][7]);
        }
        for (int i = 0; i < 3; i++) {
            columnSix.add(element[i + 5][7]);
        }
        for (int i = 0; i < 3; i++) {
            columnSix.add(element[i + 9][7]);
        }
        return columnSix;
    }

    public Set<String> addElementToColumnSevenSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnSeven.add(element[i + 1][9]);
        }
        for (int i = 0; i < 3; i++) {
            columnSeven.add(element[i + 5][9]);
        }
        for (int i = 0; i < 3; i++) {
            columnSeven.add(element[i + 9][9]);
        }
        return columnSeven;
    }

    public Set<String> addElementToColumnEightSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnEight.add(element[i + 1][10]);
        }
        for (int i = 0; i < 3; i++) {
            columnEight.add(element[i + 5][10]);
        }
        for (int i = 0; i < 3; i++) {
            columnEight.add(element[i + 9][10]);
        }
        return columnEight;
    }

    public Set<String> addElementToColumnNineSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            columnNine.add(element[i + 1][11]);
        }
        for (int i = 0; i < 3; i++) {
            columnNine.add(element[i + 5][11]);
        }
        for (int i = 0; i < 3; i++) {
            columnNine.add(element[i + 9][11]);
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
