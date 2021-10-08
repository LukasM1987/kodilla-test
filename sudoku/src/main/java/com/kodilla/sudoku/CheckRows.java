package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckRows {

    private static final int ROWS_MAX_SIZE = 9;

    private final Set<String> rowOne = new HashSet<>();
    private final Set<String> rowTwo = new HashSet<>();
    private final Set<String> rowThree = new HashSet<>();
    private final Set<String> rowFour = new HashSet<>();
    private final Set<String> rowFive = new HashSet<>();
    private final Set<String> rowSix = new HashSet<>();
    private final Set<String> rowSeven = new HashSet<>();
    private final Set<String> rowEight = new HashSet<>();
    private final Set<String> rowNine = new HashSet<>();

    public Set<String> addElementToRowOneSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowOne.add(element[1][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowOne.add(element[1][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowOne.add(element[1][i + 9]);
        }
        System.out.println("Rozmiar wiersza 1: " + rowOne.size());
        return rowOne;
    }

    public Set<String> addElementToRowTwoSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowTwo.add(element[2][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowTwo.add(element[2][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowTwo.add(element[2][i + 9]);
        }
        System.out.println("Rozmiar wiersza 2: " + rowTwo.size());
        return rowTwo;
    }

    public Set<String> addElementToRowThreeSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowThree.add(element[3][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowThree.add(element[3][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowThree.add(element[3][i + 9]);
        }
        System.out.println("Rozmiar wiersza 3: " + rowThree.size());
        return rowThree;
    }

    public Set<String> addElementToRowFourSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowFour.add(element[5][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowFour.add(element[5][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowFour.add(element[5][i + 9]);
        }
        System.out.println("Rozmiar wiersza 4: " + rowFour.size());
        return rowFour;
    }

    public Set<String> addElementToRowFiveSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowFive.add(element[6][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowFive.add(element[6][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowFive.add(element[6][i + 9]);
        }
        System.out.println("Rozmiar wiersza 5: " + rowFive.size());
        return rowFive;
    }

    public Set<String> addElementToRowSixSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowSix.add(element[7][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowSix.add(element[7][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowSix.add(element[7][i + 9]);
        }
        System.out.println("Rozmiar wiersza 6: " + rowSix.size());
        return rowSix;
    }

    public Set<String> addElementToRowSevenSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowSeven.add(element[9][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowSeven.add(element[9][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowSeven.add(element[9][i + 9]);
        }
        System.out.println("Rozmiar wiersza 7: " + rowSeven.size());
        return rowSeven;
    }

    public Set<String> addElementToRowEightSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowEight.add(element[10][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowEight.add(element[10][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowEight.add(element[10][i + 9]);
        }
        System.out.println("Rozmiar wiersza 8: " + rowEight.size());
        return rowEight;
    }

    public void size() {
        System.out.println("Rozmiar wiersza pierwszego: " + rowOne.size());
    }

    public Set<String> addElementToRowNineSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            rowNine.add(element[11][i + 1]);
        }
        for (int i = 0; i < 3; i++) {
            rowNine.add(element[11][i + 5]);
        }
        for (int i = 0; i < 3; i++) {
            rowNine.add(element[11][i + 9]);
        }
        System.out.println("Rozmiar wiersza 9: " + rowNine.size());
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
    public void clearRowOne() {
        rowOne.clear();
    }

    public void clearRowTwo() {
        rowTwo.clear();
    }

    public void clearRowThree() {
        rowThree.clear();
    }

    public void clearRowFour() {
        rowFour.clear();
    }

    public void clearRowFive() {
        rowFive.clear();
    }

    public void clearRowSix() {
        rowSix.clear();
    }

    public void clearRowSeven() {
        rowSeven.clear();
    }

    public void clearRowEight() {
        rowEight.clear();
    }

    public void clearRowNine() {
        rowNine.clear();
    }
}
