package com.kodilla.sudoku;

import java.util.*;

public class ReadyBoard {

    private static final List<Integer> numbersSquareOne = new ArrayList<>();
    private static final List<String> elementsSquareOne = new ArrayList<>();
    private static final List<Integer> numbersSquareTwo = new ArrayList<>();
    private static final List<String> elementsSquareTwo = new ArrayList<>();
    private static final List<Integer> numbersSquareThree = new ArrayList<>();
    private static final List<String> elementsSquareThree = new ArrayList<>();
    private static final List<Integer> numbersSquareFour = new ArrayList<>();
    private static final List<String> elementsSquareFour = new ArrayList<>();
    private static final List<Integer> numbersSquareFive = new ArrayList<>();
    private static final List<String> elementsSquareFive = new ArrayList<>();
    private static final List<Integer> numbersSquareSix = new ArrayList<>();
    private static final List<String> elementsSquareSix = new ArrayList<>();
    private static final List<Integer> numbersSquareSeven = new ArrayList<>();
    private static final List<String> elementsSquareSeven = new ArrayList<>();
    private static final List<Integer> numbersSquareEight = new ArrayList<>();
    private static final List<String> elementsSquareEight = new ArrayList<>();
    private static final List<Integer> numbersSquareNine = new ArrayList<>();
    private static final List<String> elementsSquareNine = new ArrayList<>();
    private static final Random random = new Random();
    private static final String[] initialElements = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
    private static final int MAX_SQUARE_SIZE = 9;

    private static final String[][] readyBoard = {
            {" ", " 1 ", " 2 ", " 3 ", "|", " 4 ", " 5 ", " 6 ", "|", " 7 ", " 8 ", " 9 "},
            {"1", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {"2", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {"3", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {" ", "---", "---", "---", "+", "---", "---", "---", "+", "---", "---", "---"},
            {"4", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {"5", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {"6", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {" ", "---", "---", "---", "+", "---", "---", "---", "+", "---", "---", "---"},
            {"7", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {"8", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},
            {"9", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "}
    };

    public String[][] generateSolvedBoard() {
        clearLists();
        generateSquareOne();
        generateSquareTwo();
        generateSquareThree();
        generateSquareFour();
        generateSquareFive();
        generateSquareSix();
        generateSquareSeven();
        generateSquareEight();
        generateSquareNine();
        return readyBoard;
    }

    public String[][] getReadySolvedBoard() {
        return readyBoard;
    }

    public void printSolvedSudoku(String[][] solved) {
        for (int i = 0; i < solved.length; i++) {
            for (int j = 0; j < solved.length; j++) {
                System.out.print(solved[i][j]);
            }
            System.out.println();
        }
    }

    public void clearLists() {
        numbersSquareOne.clear();
        elementsSquareOne.clear();
        numbersSquareTwo.clear();
        elementsSquareTwo.clear();
        numbersSquareThree.clear();
        elementsSquareThree.clear();
        numbersSquareFour.clear();
        elementsSquareFour.clear();
        numbersSquareFive.clear();
        elementsSquareFive.clear();
        numbersSquareSix.clear();
        elementsSquareSix.clear();
        numbersSquareSeven.clear();
        elementsSquareSeven.clear();
        numbersSquareEight.clear();
        elementsSquareEight.clear();
        numbersSquareNine.clear();
        elementsSquareNine.clear();
    }

    private String[][] generateSquareOne() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareOne.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareOne.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[1][1] = playerMove;
                    break;
                case 1:
                    readyBoard[1][2] = playerMove;
                    break;
                case 2:
                    readyBoard[1][3] = playerMove;
                    break;
                case 3:
                    readyBoard[2][1] = playerMove;
                    break;
                case 4:
                    readyBoard[2][2] = playerMove;
                    break;
                case 5:
                    readyBoard[2][3] = playerMove;
                    break;
                case 6:
                    readyBoard[3][1] = playerMove;
                    break;
                case 7:
                    readyBoard[3][2] = playerMove;
                    break;
                case 8:
                    readyBoard[3][3] = playerMove;
                    break;
            }
            numbersSquareOne.add(randomPosition);
            elementsSquareOne.add(playerMove);
            if (numbersSquareOne.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareTwo() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareTwo.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareTwo.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[1][5] = playerMove;

                    break;
                case 1:
                    readyBoard[1][6] = playerMove;
                    break;
                case 2:
                    readyBoard[1][7] = playerMove;
                    break;
                case 3:
                    readyBoard[2][5] = playerMove;
                    break;
                case 4:
                    readyBoard[2][6] = playerMove;
                    break;
                case 5:
                    readyBoard[2][7] = playerMove;
                    break;
                case 6:
                    readyBoard[3][5] = playerMove;
                    break;
                case 7:
                    readyBoard[3][6] = playerMove;
                    break;
                case 8:
                    readyBoard[3][7] = playerMove;
                    break;
            }
            numbersSquareTwo.add(randomPosition);
            elementsSquareTwo.add(playerMove);
            if (numbersSquareTwo.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareThree() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareThree.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareThree.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[1][9] = playerMove;

                    break;
                case 1:
                    readyBoard[1][10] = playerMove;
                    break;
                case 2:
                    readyBoard[1][11] = playerMove;
                    break;
                case 3:
                    readyBoard[2][9] = playerMove;
                    break;
                case 4:
                    readyBoard[2][10] = playerMove;
                    break;
                case 5:
                    readyBoard[2][11] = playerMove;
                    break;
                case 6:
                    readyBoard[3][9] = playerMove;
                    break;
                case 7:
                    readyBoard[3][10] = playerMove;
                    break;
                case 8:
                    readyBoard[3][11] = playerMove;
                    break;
            }
            numbersSquareThree.add(randomPosition);
            elementsSquareThree.add(playerMove);
            if (numbersSquareThree.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareFour() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareFour.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareFour.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[5][1] = playerMove;
                    break;
                case 1:
                    readyBoard[6][1] = playerMove;
                    break;
                case 2:
                    readyBoard[7][1] = playerMove;
                    break;
                case 3:
                    readyBoard[5][2] = playerMove;
                    break;
                case 4:
                    readyBoard[6][2] = playerMove;
                    break;
                case 5:
                    readyBoard[7][2] = playerMove;
                    break;
                case 6:
                    readyBoard[5][3] = playerMove;
                    break;
                case 7:
                    readyBoard[6][3] = playerMove;
                    break;
                case 8:
                    readyBoard[7][3] = playerMove;
                    break;
            }
            numbersSquareFour.add(randomPosition);
            elementsSquareFour.add(playerMove);
            if (numbersSquareFour.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareFive() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareFive.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareFive.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[5][5] = playerMove;
                    break;
                case 1:
                    readyBoard[6][5] = playerMove;
                    break;
                case 2:
                    readyBoard[7][5] = playerMove;
                    break;
                case 3:
                    readyBoard[5][6] = playerMove;
                    break;
                case 4:
                    readyBoard[6][6] = playerMove;
                    break;
                case 5:
                    readyBoard[7][6] = playerMove;
                    break;
                case 6:
                    readyBoard[5][7] = playerMove;
                    break;
                case 7:
                    readyBoard[6][7] = playerMove;
                    break;
                case 8:
                    readyBoard[7][7] = playerMove;
                    break;
            }
            numbersSquareFive.add(randomPosition);
            elementsSquareFive.add(playerMove);
            if (numbersSquareFive.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareSix() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareSix.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareSix.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[5][9] = playerMove;
                    break;
                case 1:
                    readyBoard[6][9] = playerMove;
                    break;
                case 2:
                    readyBoard[7][9]= playerMove;
                    break;
                case 3:
                    readyBoard[5][10] = playerMove;
                    break;
                case 4:
                    readyBoard[6][10] = playerMove;
                    break;
                case 5:
                    readyBoard[7][10] = playerMove;
                    break;
                case 6:
                    readyBoard[5][11] = playerMove;
                    break;
                case 7:
                    readyBoard[6][11] = playerMove;
                    break;
                case 8:
                    readyBoard[7][11] = playerMove;
                    break;
            }
            numbersSquareSix.add(randomPosition);
            elementsSquareSix.add(playerMove);
            if (numbersSquareSix.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareSeven() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareSeven.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareSeven.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[9][1] = playerMove;
                    break;
                case 1:
                    readyBoard[10][1] = playerMove;
                    break;
                case 2:
                    readyBoard[11][1]= playerMove;
                    break;
                case 3:
                    readyBoard[9][2] = playerMove;
                    break;
                case 4:
                    readyBoard[10][2] = playerMove;
                    break;
                case 5:
                    readyBoard[11][2] = playerMove;
                    break;
                case 6:
                    readyBoard[9][3] = playerMove;
                    break;
                case 7:
                    readyBoard[10][3] = playerMove;
                    break;
                case 8:
                    readyBoard[11][3] = playerMove;
                    break;
            }
            numbersSquareSeven.add(randomPosition);
            elementsSquareSeven.add(playerMove);
            if (numbersSquareSeven.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareEight() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareEight.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareEight.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[9][5] = playerMove;
                    break;
                case 1:
                    readyBoard[10][5] = playerMove;
                    break;
                case 2:
                    readyBoard[11][5]= playerMove;
                    break;
                case 3:
                    readyBoard[9][6] = playerMove;
                    break;
                case 4:
                    readyBoard[10][6] = playerMove;
                    break;
                case 5:
                    readyBoard[11][6] = playerMove;
                    break;
                case 6:
                    readyBoard[9][7] = playerMove;
                    break;
                case 7:
                    readyBoard[10][7] = playerMove;
                    break;
                case 8:
                    readyBoard[11][7] = playerMove;
                    break;
            }
            numbersSquareEight.add(randomPosition);
            elementsSquareEight.add(playerMove);
            if (numbersSquareEight.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    private String[][] generateSquareNine() {
        boolean loopRun = true;
        while (loopRun) {
            int randomElementNumber = random.nextInt(initialElements.length);
            String playerMove = "";
            playerMove = playerMove + initialElements[randomElementNumber];
            while (elementsSquareNine.contains(playerMove)) {
                randomElementNumber = random.nextInt(initialElements.length);
                playerMove = "";
                playerMove = playerMove + initialElements[randomElementNumber];
            }
            int randomPosition = random.nextInt(initialElements.length);
            while (numbersSquareNine.contains(randomPosition)) {
                randomPosition = random.nextInt(initialElements.length);
            }
            switch (randomPosition) {
                case 0:
                    readyBoard[9][9] = playerMove;
                    break;
                case 1:
                    readyBoard[10][9] = playerMove;
                    break;
                case 2:
                    readyBoard[11][9]= playerMove;
                    break;
                case 3:
                    readyBoard[9][10] = playerMove;
                    break;
                case 4:
                    readyBoard[10][10] = playerMove;
                    break;
                case 5:
                    readyBoard[11][10] = playerMove;
                    break;
                case 6:
                    readyBoard[9][11] = playerMove;
                    break;
                case 7:
                    readyBoard[10][11] = playerMove;
                    break;
                case 8:
                    readyBoard[11][11] = playerMove;
                    break;
            }
            numbersSquareNine.add(randomPosition);
            elementsSquareNine.add(playerMove);
            if (numbersSquareNine.size() == MAX_SQUARE_SIZE) {
                loopRun = false;
            }
        }
        return readyBoard;
    }

    //UZYWAJAC KOLEKCJI HASHSET:
    //JEZELI ROZMIAR KAZDEGO Z KWADRATÓW NIE JEST RÓWNY 9
    //I ROZMIAR KAZDEGO RZEDU I KAZDEJ KOLUMNY TEZ NIE JEST ROWNY 9
    //I KTORYS Z KWADRATOW ZAWIERA PUSTE POLE: "   "
    //TO MA LOSOWAC LICZBY PONOWNIE
}
