package com.kodilla.sudoku;

import java.util.Scanner;

public class Player {

    private static final Scanner scanner =  new Scanner(System.in);

    private String move;
    private int horizontal;
    private int vertical;

    public String playerMove() {
        move = scanner.next();
        return " " + move + " ";
    }

    public int playerXPosition() {
        horizontal = scanner.nextInt();
        return horizontal;
    }

    public int playerYPosition() {
        vertical = scanner.nextInt();
        return vertical;
    }
}
