package com.kodilla.sudoku;

import java.util.List;
import java.util.Random;

public class Board {

    private static final String[] initialElements = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
    private static final int INITIAL_MAX_ELEMENTS = 10;
    private static final Random random = new Random();
    private static final ReadyMadeBoards readyBoards = new ReadyMadeBoards();

    private static final String[][] board = {
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
            {"9", "   ", "   ", "   ", "|", "   ", "   ", "   ", "|", "   ", "   ", "   "},


            /*
            {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-"},
            {" ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " "},
            {" ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " "},
            {" ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " "},
            */

    };

    public String[][] newBoard() {
        return board;
    }

    public String[][] addBoardElement(int x, int y, String element) {
        if (x <= NumberPosition.THREE.getElement() && x >= NumberPosition.ONE.getElement()
                && y >= NumberPosition.ONE.getElement() && y <= NumberPosition.THREE.getElement()) {
            newBoard()[y][x] = element;

            //newBoard()[y][x] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.SIX.getElement() && x >= NumberPosition.FOUR.getElement()
                && y >= NumberPosition.ONE.getElement() && y <= NumberPosition.THREE.getElement()) {
            newBoard()[y][x + 1] = element;

            //newBoard()[y][x + 1] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.NINE.getElement() && x >= NumberPosition.SEVEN.getElement()
                && y >= NumberPosition.ONE.getElement() && y <= NumberPosition.THREE.getElement()) {
            newBoard()[y][x + 2] = element;

            //newBoard()[y][x + 2] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.THREE.getElement() && x >= NumberPosition.ONE.getElement()
                && y >= NumberPosition.FOUR.getElement() && y <= NumberPosition.SIX.getElement()) {
            newBoard()[y + 1][x] = element;

            //newBoard()[y + 1][x] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.SIX.getElement() && x >= NumberPosition.FOUR.getElement()
                && y >= NumberPosition.FOUR.getElement() && y <= NumberPosition.SIX.getElement()) {
            newBoard()[y + 1][x + 1] = element;

            //newBoard()[y + 1][x + 1] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.NINE.getElement() && x >= NumberPosition.SEVEN.getElement()
                && y >= NumberPosition.FOUR.getElement() && y <= NumberPosition.SIX.getElement()) {
            newBoard()[y + 1][x + 2] = element;

            //newBoard()[y + 1][x + 2] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.THREE.getElement() && x >= NumberPosition.ONE.getElement()
                && y >= NumberPosition.SEVEN.getElement() && y <= NumberPosition.NINE.getElement()) {
            newBoard()[y + 2][x] = element;

            //newBoard()[y + 2][x] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.SIX.getElement() && x >= NumberPosition.FOUR.getElement()
                && y >= NumberPosition.SEVEN.getElement() && y <= NumberPosition.NINE.getElement()) {
            newBoard()[y + 2][x + 1] = element;

            //newBoard()[y + 2][x + 1] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        } else if (x <= NumberPosition.NINE.getElement() && x >= NumberPosition.SEVEN.getElement()
                && y >= NumberPosition.SEVEN.getElement() && y <= NumberPosition.NINE.getElement()) {
            newBoard()[y + 2][x + 2] = element;

            //newBoard()[y + 2][x + 2] = new ElementPosition(x, y, element).getElement();
            return newBoard();
        }
        return null;
    }
    
    public void drawBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public String[][] generateElement(int xPos, int yPos, String randomBoardElement) {
        while (xPos == 0 || yPos == 0 || xPos == 4 || yPos == 4 || xPos == 8 || yPos == 8) {
            xPos = random.nextInt(board.length);
            yPos = random.nextInt(board.length);
        }
        int randomElementNumber = random.nextInt(initialElements.length);
        newBoard()[yPos][xPos] = randomBoardElement + initialElements[randomElementNumber];
        return newBoard();
    }
}
