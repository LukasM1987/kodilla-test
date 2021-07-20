package com.kodilla.rps;

import com.kodilla.rps.RpsRunner;

import java.util.Scanner;

class Menu {

    public static String name;
    public static int rounds;
    private final String gameEnd = "x";
    private final String restartGame = "n";
    private static final Scanner scanner = new Scanner(System.in);

    public void mainMenuName() {
        System.out.print("Please enter your name: ");
        name = scanner.next();
    }
    public void mainMenuRoudns() {
        System.out.print("Welcome in paper, rock, scisors game " + name + ".\nPlease enter quantity of rounds: ");
        rounds = scanner.nextInt();
    }

    public void endMenu() throws Exception {
        System.out.print(name + ", if you want to end the game, please enter x mark.\nIf you want to restart the game, please enter n: ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase(gameEnd)) {
            System.out.println("The Game has been ended.");
            System.exit(0);
        }
        if (choice.equalsIgnoreCase(restartGame)) {
            System.out.println("The game has been restarted.");
            RpsRunner.main(null);
        }
        while (!choice.equalsIgnoreCase(gameEnd) || !choice.equalsIgnoreCase(restartGame)) {
            System.out.print("Please enter correct mark: ");
            choice = scanner.next();
            if (choice.equalsIgnoreCase(gameEnd)) {
                System.out.println("The Game has been ended.");
                System.exit(0);
            }
            if (choice.equalsIgnoreCase(restartGame)) {
                System.out.println("The game has been restarted.");
                RpsRunner.main(null);
            }
        }
    }
}