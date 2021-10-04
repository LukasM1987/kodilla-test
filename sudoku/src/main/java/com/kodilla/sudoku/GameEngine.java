package com.kodilla.sudoku;

import java.time.LocalTime;
import java.util.*;

public class GameEngine {

    private static final ElementsList elementsList = new ElementsList();
    private static final CheckSquares checkSquares = new CheckSquares();
    private static final CheckRows checkRows = new CheckRows();
    private static final CheckColumns checkColumns = new CheckColumns();
    private static final Random random = new Random();
    private static final Board board = new Board();
    private static final Menu menu = new Menu();
    private static final Player player = new Player();
    private static final ReadyBoard readySolvedBoard = new ReadyBoard();

    private static final ReadyMadeBoards readyMadeBoards = new ReadyMadeBoards();

    private static final int INITIAL_MAX_ELEMENTS = 10;
    private static final int ZERO_POS = 0;
    private static final int FOUR_POS = 4;
    private static final int EIGHT_POS = 8;
    private boolean gameRun = true;
    private String playerMove;
    private int xPos;
    private int yPos;

    public void gameLoop() {
        int randomBoard = random.nextInt(5) + 1;

        //POPRAWIC WYGENEROWANIE GOTOWEGO SUDOKU
        boolean loopLaps = true;
        String[][] solved = readySolvedBoard.generateSolvedBoard();
        System.out.println();
        collections(solved);
        if (!checkSquares.checkAllSquare() && !checkRows.checkAllRows()
                && !checkColumns.checkAllColumns()) {
            collectionsClear(solved);
            int j = 0;
            do {
                j++;
                solved = readySolvedBoard.generateSolvedBoard();
                collections(solved);
                System.out.println("Pętla nr: " + j);
                if (checkSquares.checkAllSquare()
                        && checkRows.checkAllRows()
                        && checkColumns.checkAllColumns()) {
                    loopLaps = false;
                    collectionsClear(solved);
                }
                collectionsClear(solved);
            } while (loopLaps);
        }


        menu.welcome();
        LocalTime start = LocalTime.now();
        generateUnsolvedBoard(randomBoard);
        while (gameRun) {
            menu.addElement();
            playerMove = player.playerMove();
            while (!elementsList.elements().contains(playerMove)) {
                menu.unrecognizedElement();
                playerMove = player.playerMove();
            }
            if (playerMove.equals(SudokuElements.SUDOKU_SOLVE.getElement())) {
                gameRun = false;
                //readySolvedBoard.printSolvedSudoku();
                readyMadeBoards.chooseBoard(randomBoard);
                menu.failure();
            } else if (playerMove.equals(SudokuElements.FINISH.getElement())) {
                collections(board.newBoard());
                if (checkSquares.checkAllSquare()
                        && checkRows.checkAllRows()
                        && checkColumns.checkAllColumns()) {
                    menu.congratulations();
                    gameRun = false;
                } else {
                    menu.mistake();
                    collectionsClear(board.newBoard());
                }
            } else {
                menu.addXNumberPosition();
                xPos = player.playerXPosition();
                menu.addYNumberPosition();
                yPos = player.playerYPosition();
                while (!elementsList.numbers().contains(xPos) || !elementsList.numbers().contains(yPos)) {
                    menu.unrecognizedNumber();
                    menu.addXNumberPosition();
                    xPos = player.playerXPosition();
                    menu.addYNumberPosition();
                    yPos = player.playerYPosition();
                }
                board.drawBoard(board.addBoardElement(xPos, yPos, playerMove));
            }
        }
        LocalTime end = LocalTime.now();
        menu.start(start);
        menu.end(end);
    }

    private void collections(String[][] board) {
        checkSquares.addElementToSquareOneSet(board);
        checkSquares.addElementToSquareTwoSet(board);
        checkSquares.addElementToSquareThreeSet(board);
        checkSquares.addElementToSquareFourSet(board);
        checkSquares.addElementToSquareFiveSet(board);
        checkSquares.addElementToSquareSixSet(board);
        checkSquares.addElementToSquareSevenSet(board);
        checkSquares.addElementToSquareEightSet(board);
        checkSquares.addElementToSquareNineSet(board);

        checkRows.addElementToRowOneSet(board);
        checkRows.addElementToRowTwoSet(board);
        checkRows.addElementToRowThreeSet(board);
        checkRows.addElementToRowFourSet(board);
        checkRows.addElementToRowFiveSet(board);
        checkRows.addElementToRowSixSet(board);
        checkRows.addElementToRowSevenSet(board);
        checkRows.addElementToRowEightSet(board);
        checkRows.addElementToRowNineSet(board);

        checkColumns.addElementToColumnOneSet(board);
        checkColumns.addElementToColumnTwoSet(board);
        checkColumns.addElementToColumnThreeSet(board);
        checkColumns.addElementToColumnFourSet(board);
        checkColumns.addElementToColumnFiveSet(board);
        checkColumns.addElementToColumnSixSet(board);
        checkColumns.addElementToColumnSevenSet(board);
        checkColumns.addElementToColumnEightSet(board);
        checkColumns.addElementToColumnNineSet(board);
    }

    private void collectionsClear(String[][] board) {
        checkSquares.addElementToSquareOneSet(board).clear();
        checkSquares.addElementToSquareTwoSet(board).clear();
        checkSquares.addElementToSquareThreeSet(board).clear();
        checkSquares.addElementToSquareFourSet(board).clear();
        checkSquares.addElementToSquareFiveSet(board).clear();
        checkSquares.addElementToSquareSixSet(board).clear();
        checkSquares.addElementToSquareSevenSet(board).clear();
        checkSquares.addElementToSquareEightSet(board).clear();
        checkSquares.addElementToSquareNineSet(board).clear();

        checkRows.addElementToRowOneSet(board).clear();
        checkRows.addElementToRowTwoSet(board).clear();
        checkRows.addElementToRowThreeSet(board).clear();
        checkRows.addElementToRowFourSet(board).clear();
        checkRows.addElementToRowFiveSet(board).clear();
        checkRows.addElementToRowSixSet(board).clear();
        checkRows.addElementToRowSevenSet(board).clear();
        checkRows.addElementToRowEightSet(board).clear();
        checkRows.addElementToRowNineSet(board).clear();

        checkColumns.addElementToColumnOneSet(board).clear();
        checkColumns.addElementToColumnTwoSet(board).clear();
        checkColumns.addElementToColumnThreeSet(board).clear();
        checkColumns.addElementToColumnFourSet(board).clear();
        checkColumns.addElementToColumnFiveSet(board).clear();
        checkColumns.addElementToColumnSixSet(board).clear();
        checkColumns.addElementToColumnSevenSet(board).clear();
        checkColumns.addElementToColumnEightSet(board).clear();
        checkColumns.addElementToColumnNineSet(board).clear();
    }

    private void generateUnsolvedBoard(int randomBoard) {
        for (int i = 0; i < INITIAL_MAX_ELEMENTS; i++) {
            xPos = random.nextInt(board.newBoard().length);
            yPos = random.nextInt(board.newBoard().length);
            while (xPos == ZERO_POS || yPos == ZERO_POS || xPos == FOUR_POS
                    || yPos == FOUR_POS || xPos == EIGHT_POS || yPos == EIGHT_POS) {
                xPos = random.nextInt(board.newBoard().length);
                yPos = random.nextInt(board.newBoard().length);
            }
            //board.newBoard()[yPos][xPos] = readySolvedBoard.getReadySolvedBoard()[yPos][xPos];
            board.newBoard()[yPos][xPos] = readyMadeBoards.randomBoard(randomBoard)[yPos][xPos];
        }
        board.drawBoard(board.newBoard());
    }
}
