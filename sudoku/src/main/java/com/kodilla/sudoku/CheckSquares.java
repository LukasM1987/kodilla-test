package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckSquares {

    private static final int SQUARE_MAX_SIZE = 9;

    private final Set<String> squareOne = new HashSet<>();
    private final Set<String> squareTwo = new HashSet<>();
    private final Set<String> squareThree = new HashSet<>();
    private final Set<String> squareFour = new HashSet<>();
    private final Set<String> squareFive = new HashSet<>();
    private final Set<String> squareSix = new HashSet<>();
    private final Set<String> squareSeven = new HashSet<>();
    private final Set<String> squareEight = new HashSet<>();
    private final Set<String> squareNine = new HashSet<>();

    public Set<String> addElementToSquareOneSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            squareOne.add(element[i + 1][1]);
        }
        for (int i = 0; i < 3; i++) {
            squareOne.add(element[i + 1][2]);
        }
        for (int i = 0; i < 3; i++) {
            squareOne.add(element[i + 1][3]);
        }
        return squareOne;
    }

    public void size() {
        System.out.println("Rozmmiar kwadratu pierwszego: " + squareOne.size());
    }

    public Set<String> addElementToSquareTwoSet(String[][] element) {
        for (int i = 4; i < 7; i++) {
            squareTwo.add(element[i + 1][1]);
        }
        for (int i = 4; i < 7; i++) {
            squareTwo.add(element[i + 1][2]);
        }
        for (int i = 4; i < 7; i++) {
            squareTwo.add(element[i + 1][3]);
        }
        return squareTwo;
    }

    public Set<String> addElementToSquareThreeSet(String[][] element) {
        for (int i = 8; i < 11; i++) {
            squareThree.add(element[i + 1][1]);
        }
        for (int i = 8; i < 11; i++) {
            squareThree.add(element[i + 1][2]);
        }
        for (int i = 8; i < 11; i++) {
            squareThree.add(element[i + 1][3]);
        }
        return squareThree;
    }

    public Set<String> addElementToSquareFourSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            squareFour.add(element[i + 1][5]);
        }
        for (int i = 0; i < 3; i++) {
            squareFour.add(element[i + 1][6]);
        }
        for (int i = 0; i < 3; i++) {
            squareFour.add(element[i + 1][7]);
        }
        return squareFour;
    }

    public Set<String> addElementToSquareFiveSet(String[][] element) {
        for (int i = 4; i < 7; i++) {
            squareFive.add(element[i + 1][5]);
        }
        for (int i = 4; i < 7; i++) {
            squareFive.add(element[i + 1][6]);
        }
        for (int i = 4; i < 7; i++) {
            squareFive.add(element[i + 1][7]);
        }
        return squareFive;
    }

    public Set<String> addElementToSquareSixSet(String[][] element) {
        for (int i = 8; i < 11; i++) {
            squareSix.add(element[i + 1][5]);
        }
        for (int i = 8; i < 11; i++) {
            squareSix.add(element[i + 1][6]);
        }
        for (int i = 8; i < 11; i++) {
            squareSix.add(element[i + 1][7]);
        }
        return squareSix;
    }

    public Set<String> addElementToSquareSevenSet(String[][] element) {
        for (int i = 0; i < 3; i++) {
            squareSeven.add(element[i + 1][9]);
        }
        for (int i = 0; i < 3; i++) {
            squareSeven.add(element[i + 1][10]);
        }
        for (int i = 0; i < 3; i++) {
            squareSeven.add(element[i + 1][11]);
        }
        return squareSeven;
    }

    public Set<String> addElementToSquareEightSet(String[][] element) {
        for (int i = 4; i < 7; i++) {
            squareEight.add(element[i + 1][9]);
        }
        for (int i = 4; i < 7; i++) {
            squareEight.add(element[i + 1][10]);
        }
        for (int i = 4; i < 7; i++) {
            squareEight.add(element[i + 1][11]);
        }
        return squareEight;

    }

    public Set<String> addElementToSquareNineSet(String[][] element) {
        for (int i = 8; i < 11; i++) {
            squareNine.add(element[i + 1][9]);
        }
        for (int i = 8; i < 11; i++) {
            squareNine.add(element[i + 1][10]);
        }
        for (int i = 8; i < 11; i++) {
            squareNine.add(element[i + 1][11]);
        }
        return squareNine;
    }

    public boolean checkAllSquare() {
        if (squareOne.size() == SQUARE_MAX_SIZE
                && squareTwo.size() == SQUARE_MAX_SIZE
                && squareThree.size() == SQUARE_MAX_SIZE
                && squareFour.size() == SQUARE_MAX_SIZE
                && squareFive.size() == SQUARE_MAX_SIZE
                && squareSix.size() == SQUARE_MAX_SIZE
                && squareSeven.size() == SQUARE_MAX_SIZE
                && squareEight.size() == SQUARE_MAX_SIZE
                && squareNine.size() == SQUARE_MAX_SIZE
                && !squareOne.contains(SudokuElements.EMPTY.getElement())
                && !squareTwo.contains(SudokuElements.EMPTY.getElement())
                && !squareThree.contains(SudokuElements.EMPTY.getElement())
                && !squareFour.contains(SudokuElements.EMPTY.getElement())
                && !squareFive.contains(SudokuElements.EMPTY.getElement())
                && !squareSix.contains(SudokuElements.EMPTY.getElement())
                && !squareSeven.contains(SudokuElements.EMPTY.getElement())
                && !squareEight.contains(SudokuElements.EMPTY.getElement())
                && !squareNine.contains(SudokuElements.EMPTY.getElement())) {
            return true;
        } else {
            return false;
        }
    }
}
