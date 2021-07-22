package com.kodilla.rps.uix;

import com.kodilla.rps.model.GameDefinition;
import com.kodilla.rps.model.Move;
import com.kodilla.rps.model.RoundResult;
import com.kodilla.rps.model.Statistics;

import java.util.Scanner;

public class SimpleUserInterface implements UserInterface {

    private String userName;
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void printMenu() {
        System.out.println("Welcome in Paper Rock Scissors game!");
    }

    @Override
    public void printShortMenu() {

    }

    @Override
    public String getMove() {
        return userName + " now is your move: ";
    }


    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public int getRoundCount() {
        return 0;
    }

    @Override
    public void informRound(Move playerMove, Move enemyMove, RoundResult result) {
        System.out.println("Player chose: " + playerMove);
        System.out.println("Computer chose: " + enemyMove);
        System.out.println("Skirmish result: " + result);
    }

    @Override
    public void informGame(GameDefinition definition, Statistics statistics) {

    }

    @Override
    public boolean confirmExit() {
        return true;
    }

    @Override
    public boolean confirmNewGame() {
        return true;
    }

    @Override
    public boolean confirmOnceAgain() {
        return false;
    }

    @Override
    public void printRound(int number) {
        System.out.println("Round number is: " + number);
    }

    @Override
    public void thankYou(String username) {
        username = userName;
        System.out.println("Thank you for playing " + username);
    }
}