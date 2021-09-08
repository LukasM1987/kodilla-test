package com.kodilla.rps;

public class EndChoice {

    public void exit(String choice) {
        if (choice.equals(EndingMoves.EXIT_GAME.getMark())) {
            System.exit(0);
        }
    }

    public void newGame(String choice) {
        if (choice.equals(EndingMoves.NEW_GAME.getMark())) {
            Skirmish skirmish = new Skirmish();
            skirmish.run();
        }
    }
}