package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game extends Menu {

    private final int rock = 1;
    private final int paper = 2;
    private final int scisors = 3;
    private int roundLaps = 0;
    private int playerResult = 0;
    private int computerResult = 0;
    private boolean end = false;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String[] atributes = {"rock", "paper", "scisors"};

    public void skirmish() {

        System.out.println("1 = rock");
        System.out.println("2 = paper");
        System.out.println("3 = scisors");
        while (!end) {
            roundLaps++;
            System.out.print(name + ", your move: ");
            int playerMove = scanner.nextInt();
            if (playerMove > scisors || playerMove < rock) {
                System.out.print(name + ", please enter number from 1 to 3: ");
                playerMove = scanner.nextInt();
            }
            System.out.println(name + " chosen: " + (atributes[(playerMove - 1)]));
            int computerMove = random.nextInt(3) + 1;
            System.out.println("Now is computer move.\nComputer chose: " + atributes[computerMove - 1]);
            if (playerMove == computerMove) {
                System.out.println("Round: " + roundLaps + " Draw.");
            } else if (playerMove == rock && computerMove == paper) {
                System.out.println("Round: " + roundLaps + " Computer win.");
                computerResult++;
            } else if (playerMove == paper && computerMove == rock) {
                System.out.println("Round: " + roundLaps + ' ' + name + " win.");
                playerResult++;
            } else if (playerMove == paper && computerMove == scisors) {
                System.out.println("Round: " + roundLaps + " Computer win.");
                computerResult++;
            } else if (playerMove == scisors && computerMove == paper) {
                System.out.println("Round: " + roundLaps + ' ' + name + " win.");
                playerResult++;
            } else if (playerMove == rock && computerMove == scisors) {
                System.out.println("Round: " + roundLaps + ' ' + name + " win.");
                playerResult++;
            } else {
                System.out.println("Round: " + roundLaps + " Computer win.");
                computerResult++;
            }
            if (roundLaps == rounds) {
                end = true;
            }
        }
    }

    public void skirmishResult() {
        System.out.println(name + " wins: " + playerResult);
        System.out.println("Computer wins: " + computerResult);
        if (computerResult == playerResult) {
            System.out.println("No ones win.");
        } else if (computerResult > playerResult) {
            System.out.println("Computer is the winner!");
        } else {
            System.out.println(name + " is the winner!");
        }
    }
}
