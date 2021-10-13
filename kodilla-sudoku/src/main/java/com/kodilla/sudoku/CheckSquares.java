package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class CheckSquares {

    private static final int SQUARE_MAX_SIZE = 9;

    private final Set<Integer> squareOne = new HashSet<>();
    private final Set<Integer> squareTwo = new HashSet<>();
    private final Set<Integer> squareThree = new HashSet<>();
    private final Set<Integer> squareFour = new HashSet<>();
    private final Set<Integer> squareFive = new HashSet<>();
    private final Set<Integer> squareSix = new HashSet<>();
    private final Set<Integer> squareSeven = new HashSet<>();
    private final Set<Integer> squareEight = new HashSet<>();
    private final Set<Integer> squareNine = new HashSet<>();

    public Set<Integer> addElementToSquareOneSet(int[][] element) {
        for (int i = 0; i < 3; i++) {
            squareOne.add(element[0][i]);
        }
        for (int i = 0; i < 3; i++) {
            squareOne.add(element[1][i]);
        }
        for (int i = 0; i < 3; i++) {
            squareOne.add(element[2][i]);
        }
        return squareOne;
    }

    public Set<Integer> addElementToSquareTwoSet(int[][] element) {
        for (int i = 0; i < 3; i++) {
            squareTwo.add(element[i][3]);
        }
        for (int i = 0; i < 3; i++) {
            squareTwo.add(element[i][4]);
        }
        for (int i = 0; i < 3; i++) {
            squareTwo.add(element[i][5]);
        }
        return squareTwo;
    }

    public Set<Integer> addElementToSquareThreeSet(int[][] element) {
        for (int i = 0; i < 3; i++) {
            squareThree.add(element[i][6]);
        }
        for (int i = 0; i < 3; i++) {
            squareThree.add(element[i][7]);
        }
        for (int i = 0; i < 3; i++) {
            squareThree.add(element[i][8]);
        }
        return squareThree;
    }

    public Set<Integer> addElementToSquareFourSet(int[][] element) {
        for (int i = 3; i < 6; i++) {
            squareFour.add(element[i][0]);
        }
        for (int i = 3; i < 6; i++) {
            squareFour.add(element[i][1]);
        }
        for (int i = 3; i < 6; i++) {
            squareFour.add(element[i][2]);
        }
        return squareFour;
    }

    public Set<Integer> addElementToSquareFiveSet(int[][] element) {
        for (int i = 3; i < 6; i++) {
            squareFive.add(element[i][3]);
        }
        for (int i = 3; i < 6; i++) {
            squareFive.add(element[i][4]);
        }
        for (int i = 3; i < 6; i++) {
            squareFive.add(element[i][5]);
        }
        return squareFive;
    }

    public Set<Integer> addElementToSquareSixSet(int[][] element) {
        for (int i = 3; i < 6; i++) {
            squareSix.add(element[i][6]);
        }
        for (int i = 3; i < 6; i++) {
            squareSix.add(element[i][7]);
        }
        for (int i = 3; i < 6; i++) {
            squareSix.add(element[i][8]);
        }
        return squareSix;
    }

    public Set<Integer> addElementToSquareSevenSet(int[][] element) {
        for (int i = 6; i < 9; i++) {
            squareSeven.add(element[i][0]);
        }
        for (int i = 6; i < 9; i++) {
            squareSeven.add(element[i][1]);
        }
        for (int i = 6; i < 9; i++) {
            squareSeven.add(element[i][2]);
        }
        return squareSeven;
    }

    public Set<Integer> addElementToSquareEightSet(int[][] element) {
        for (int i = 6; i < 9; i++) {
            squareEight.add(element[i][3]);
        }
        for (int i = 6; i < 9; i++) {
            squareEight.add(element[i][4]);
        }
        for (int i = 6; i < 9; i++) {
            squareEight.add(element[i][5]);
        }
        return squareEight;
    }

    public Set<Integer> addElementToSquareNineSet(int[][] element) {
        for (int i = 6; i < 9; i++) {
            squareNine.add(element[i][6]);
        }
        for (int i = 6; i < 9; i++) {
            squareNine.add(element[i][7]);
        }
        for (int i = 6; i < 9; i++) {
            squareNine.add(element[i][8]);
        }
        return squareNine;
    }

    public boolean checkSquare() {
        if (squareOne.size() == SQUARE_MAX_SIZE
                && squareTwo.size() == SQUARE_MAX_SIZE
                && squareThree.size() == SQUARE_MAX_SIZE
                && squareFour.size() == SQUARE_MAX_SIZE
                && squareFive.size() == SQUARE_MAX_SIZE
                && squareSix.size() == SQUARE_MAX_SIZE
                && squareSeven.size() == SQUARE_MAX_SIZE
                && squareEight.size() == SQUARE_MAX_SIZE
                && squareNine.size() == SQUARE_MAX_SIZE
                && !squareOne.contains(SudokuElements.ZERO.getElement())
                && !squareTwo.contains(SudokuElements.ZERO.getElement())
                && !squareThree.contains(SudokuElements.ZERO.getElement())
                && !squareFour.contains(SudokuElements.ZERO.getElement())
                && !squareFive.contains(SudokuElements.ZERO.getElement())
                && !squareSix.contains(SudokuElements.ZERO.getElement())
                && !squareSeven.contains(SudokuElements.ZERO.getElement())
                && !squareEight.contains(SudokuElements.ZERO.getElement())
                && !squareNine.contains(SudokuElements.ZERO.getElement())) {
            return true;
        } else {
            return false;
        }
    }
}
