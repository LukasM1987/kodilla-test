package com.kodilla.rps;

import java.util.Scanner;

public class Skirmish {
    private boolean end = false;
    private int loopLaps = 0;
    private static final Menu menu = new Menu();
    private static final Player player = new Player();
    private static final Enemy enemy = new Enemy();
    private static final EndChoice endChoice = new EndChoice();
    private Statistics statistics = new Statistics();

    public void run() {
        menu.askName();
        String name = player.name();
        menu.sayHello(name);
        menu.askRounds(name);
        int rounds = player.rounds();
        menu.instruction();
        while (!end) {
            menu.setMove(name);
            int move = player.move();
            while (move > Moves.SCISSORS.getValue() || move < Moves.ROCK.getValue()) {
                menu.wrongKey();
                move = player.move();
            }
            menu.playerMove(name, move);
            int enemyMove = enemy.enemyMove();
            menu.computerMove(enemyMove);
            menu.roundResult(statistics.whoWinRound(name, move, enemyMove));
            loopLaps++;
            if (loopLaps == rounds) {
                end = true;
            }
        }
        menu.playerResult(name, statistics.getUserResult());
        menu.computerResult(statistics.getEnemyResult());
        menu.whoIsTheWinner(statistics.whoIsTheWinner(name, statistics.getUserResult(), statistics.getEnemyResult()));
        menu.askNewGame();
        menu.askExit();
        String endChoice = player.endChoice();
        Skirmish.endChoice.exit(endChoice);
        Skirmish.endChoice.newGame(endChoice);
        while (!endChoice.equals(EndingMoves.NEW_GAME.getMark()) || !endChoice.equals(EndingMoves.EXIT_GAME.getMark())) {
            menu.wrongEndKey(name);
            endChoice = player.endChoice();
            Skirmish.endChoice.exit(endChoice);
            Skirmish.endChoice.newGame(endChoice);
        }
    }
}