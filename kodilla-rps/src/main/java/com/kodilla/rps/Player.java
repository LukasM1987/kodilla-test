package com.kodilla.rps;

import java.util.Scanner;

public class Player implements PlayerInterface {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public String name() {
        String name = scanner.next();
        return name;
    }

    @Override
    public int rounds() {
        int rounds = scanner.nextInt();
        return rounds;
    }

    @Override
    public int move() {
        int move = scanner.nextInt();
        return move;
    }

    @Override
    public String endChoice() {
        String endChoice = scanner.next();
        return endChoice;
    }
}
