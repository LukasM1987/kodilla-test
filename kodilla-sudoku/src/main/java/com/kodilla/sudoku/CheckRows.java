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
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowOne.add(element[ElementPosition.ZERO.getElement()][i]);
        }
        return rowOne;
    }

    public Set<Integer> addElementToRowTwoSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowTwo.add(element[ElementPosition.ONE.getElement()][i]);
        }
        return rowTwo;
    }

    public Set<Integer> addElementToRowThreeSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowThree.add(element[ElementPosition.TWO.getElement()][i]);
        }
        return rowThree;
    }

    public Set<Integer> addElementToRowFourSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowFour.add(element[ElementPosition.THREE.getElement()][i]);
        }
        return rowFour;
    }

    public Set<Integer> addElementToRowFiveSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowFive.add(element[ElementPosition.FOUR.getElement()][i]);
        }
        return rowFive;
    }

    public Set<Integer> addElementToRowSixSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowSix.add(element[ElementPosition.FIVE.getElement()][i]);
        }
        return rowSix;
    }

    public Set<Integer> addElementToRowSevenSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowSeven.add(element[ElementPosition.SIX.getElement()][i]);
        }
        return rowSeven;
    }

    public Set<Integer> addElementToRowEightSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowEight.add(element[ElementPosition.SEVEN.getElement()][i]);
        }
        return rowEight;
    }

    public Set<Integer> addElementToRowNineSet(int[][] element) {
        for (int i = 0; i < ROWS_MAX_SIZE; i++) {
            rowNine.add(element[ElementPosition.EIGHT.getElement()][i]);
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
