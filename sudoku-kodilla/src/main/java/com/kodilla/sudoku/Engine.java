package com.kodilla.sudoku;

public class Engine {

    private static final Menu menu = new Menu();
    private static final Player player = new Player();
    private static final Solver solver = new Solver();
    private static final SudokuElementsList sudokuElementsList = new SudokuElementsList();
    private static final CheckSquares checkSquares = new CheckSquares();
    private static final CheckColumns checkColumns = new CheckColumns();
    private static final CheckRows checkRows = new CheckRows();
    private static final SudokuReader sudokuReader = new SudokuReader();

    private boolean gameRun = true;
    private String playerMove;
    private String sudokuBoardName;
    private int number;
    private int xPos;
    private int yPos;

    public void gameLoop() throws RowException {
        menu.welcome();
        menu.addFile();
        sudokuBoardName = player.playerMove();
        sudokuReader.readFile(sudokuBoardName);
        sudokuReader.print(sudokuReader.boardConverter());
        while (gameRun) {
            menu.addElement();
            playerMove = player.playerMove();
            while (!sudokuElementsList.stringElements().contains(playerMove)) {
                menu.unrecognizedElement();
                playerMove = player.playerMove();
            }
            if (playerMove.equals(SudokuChoice.SUDOKU.getChoice())) {
                gameRun = false;
                if (solver.solveBoard(sudokuReader.boardConverter())) {
                    menu.failure();
                    sudokuReader.print(sudokuReader.getBoard());
                } else { menu.unsolvable();
                }
            } else if (playerMove.equals(SudokuChoice.FINISH.getChoice())) {
                if (checkColumns.checkAllColumns(sudokuReader.getBoard())
                        && checkRows.checkAllRows(sudokuReader.getBoard())
                        && checkSquares.checkAllSquares(sudokuReader.getBoard())) {
                    menu.congratulations();
                    gameRun = false;
                } else {
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
                sudokuReader.print(sudokuReader.addElementBoard(xPos, yPos, number));
            }
        }
    }
}
