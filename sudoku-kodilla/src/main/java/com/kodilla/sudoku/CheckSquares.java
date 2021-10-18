package com.kodilla.sudoku;
import java.util.HashSet;
import java.util.Set;

public class CheckSquares {

    private static final int SQUARE_MAX_SIZE = 9;
    private static final int LOOP_LAPS_THREE = 3;
    private static final int LOOP_LAPS_SIX = 6;
    private static final int LOOP_LAPS_NINE = 9;

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
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareOne.add(element[ElementPosition.ZERO.getElement()][i]);
        }
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareOne.add(element[ElementPosition.ONE.getElement()][i]);
        }
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareOne.add(element[ElementPosition.TWO.getElement()][i]);
        }
        return squareOne;
    }

    public Set<Integer> addElementToSquareTwoSet(int[][] element) {
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareTwo.add(element[i][ElementPosition.THREE.getElement()]);
        }
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareTwo.add(element[i][ElementPosition.FOUR.getElement()]);
        }
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareTwo.add(element[i][ElementPosition.FIVE.getElement()]);
        }
        return squareTwo;
    }

    public Set<Integer> addElementToSquareThreeSet(int[][] element) {
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareThree.add(element[i][ElementPosition.SIX.getElement()]);
        }
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareThree.add(element[i][ElementPosition.SEVEN.getElement()]);
        }
        for (int i = 0; i < LOOP_LAPS_THREE; i++) {
            squareThree.add(element[i][ElementPosition.EIGHT.getElement()]);
        }
        return squareThree;
    }

    public Set<Integer> addElementToSquareFourSet(int[][] element) {
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareFour.add(element[i][ElementPosition.ZERO.getElement()]);
        }
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareFour.add(element[i][ElementPosition.ONE.getElement()]);
        }
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareFour.add(element[i][ElementPosition.TWO.getElement()]);
        }
        return squareFour;
    }

    public Set<Integer> addElementToSquareFiveSet(int[][] element) {
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareFive.add(element[i][ElementPosition.THREE.getElement()]);
        }
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareFive.add(element[i][ElementPosition.FOUR.getElement()]);
        }
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareFive.add(element[i][ElementPosition.FIVE.getElement()]);
        }
        return squareFive;
    }

    public Set<Integer> addElementToSquareSixSet(int[][] element) {
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareSix.add(element[i][ElementPosition.SIX.getElement()]);
        }
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareSix.add(element[i][ElementPosition.SEVEN.getElement()]);
        }
        for (int i = 3; i < LOOP_LAPS_SIX; i++) {
            squareSix.add(element[i][ElementPosition.EIGHT.getElement()]);
        }
        return squareSix;
    }

    public Set<Integer> addElementToSquareSevenSet(int[][] element) {
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareSeven.add(element[i][ElementPosition.ZERO.getElement()]);
        }
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareSeven.add(element[i][ElementPosition.ONE.getElement()]);
        }
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareSeven.add(element[i][ElementPosition.TWO.getElement()]);
        }
        return squareSeven;
    }

    public Set<Integer> addElementToSquareEightSet(int[][] element) {
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareEight.add(element[i][ElementPosition.THREE.getElement()]);
        }
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareEight.add(element[i][ElementPosition.FOUR.getElement()]);
        }
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareEight.add(element[i][ElementPosition.FIVE.getElement()]);
        }
        return squareEight;
    }

    public Set<Integer> addElementToSquareNineSet(int[][] element) {
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareNine.add(element[i][ElementPosition.SIX.getElement()]);
        }
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareNine.add(element[i][ElementPosition.SEVEN.getElement()]);
        }
        for (int i = 6; i < LOOP_LAPS_NINE; i++) {
            squareNine.add(element[i][ElementPosition.EIGHT.getElement()]);
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
