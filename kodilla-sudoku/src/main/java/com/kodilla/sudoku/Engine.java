package com.kodilla.sudoku;

import java.util.Random;

public class Engine {

    private static final Menu menu = new Menu();
    private static final Board board = new Board();
    private static final Player player = new Player();
    private static final Random random = new Random();
    private static final Solver solver = new Solver();
    private static final SudokuElementsList sudokuElementsList = new SudokuElementsList();
    private static final CheckSquares checkSquares = new CheckSquares();
    private static final CheckColumns checkColumns = new CheckColumns();
    private static final CheckRows checkRows = new CheckRows();
    private static final int INITIAL_MAX_ELEMENTS = 10;
    private static final int ZERO_POS = 0;

    private boolean gameRun = true;
    private String playerMove;
    private int number;
    private int xPos;
    private int yPos;

    public void gameLoop() {
        menu.welcome();
        generateUnsolvedBoard();
        while (gameRun) {
            menu.addElement();
            playerMove = player.playerMove();
            while (!sudokuElementsList.stringElements().contains(playerMove)) {
                menu.unrecognizedElement();
                playerMove = player.playerMove();
            }
            if (playerMove.equals(SudokuChoice.SUDOKU.getChoice())) {
                gameRun = false;
                if (solver.solveBoard(board.getBoard())) {
                    menu.failure();
                    board.drawBoard(board.getBoard());
                } else {
                    menu.unsolvable();
                }
            } else if (playerMove.equals(SudokuChoice.FINISH.getChoice())) {
                collections(board.getBoard());
                if (checkSquares.checkSquare()
                        && checkRows.checkAllRows()
                        && checkColumns.checkAllColumns()) {
                    menu.congratulations();
                    gameRun = false;
                } else {
                    collectionsCleaner(board.getBoard());
                    menu.mistake();
                }
            } else {
                number = Integer.parseInt(playerMove);
                menu.addXNumberPosition();
                xPos = player.playerXPosition();
                menu.addYNumberPosition();
                yPos = player.playerYPosition();
                while (!sudokuElementsList.numbers().contains(xPos)
                        || !sudokuElementsList.numbers().contains(yPos)) {
                    menu.unrecognizedNumber();
                    menu.addXNumberPosition();
                    xPos = player.playerXPosition();
                    menu.addYNumberPosition();
                    yPos = player.playerYPosition();
                }
                board.drawBoard(board.addElementBoard(xPos, yPos, number));
            }
        }
    }

    private void collections(int[][] board) {
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

    private void collectionsCleaner(int[][] board) {
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

    private void generateUnsolvedBoard() {
        for (int i = 0; i < INITIAL_MAX_ELEMENTS; i++) {
            xPos = random.nextInt(board.getBoard().length);
            yPos = random.nextInt(board.getBoard().length);
            while (xPos == ZERO_POS || yPos == ZERO_POS) {
                xPos = random.nextInt(board.getBoard().length);
                yPos = random.nextInt(board.getBoard().length);
            }
            board.getBoard()[yPos][xPos] = random.nextInt(9) + 1;
        }
        board.drawBoard(board.getBoard());
    }
}
