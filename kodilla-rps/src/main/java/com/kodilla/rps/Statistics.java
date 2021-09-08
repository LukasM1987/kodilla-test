package com.kodilla.rps;

public class Statistics {
    private int userResult;
    private int enemyResult;

    public int getUserResult() {
        return userResult++;
    }

    public int getEnemyResult() {
        return enemyResult++;
    }

    public String whoWinRound(String name, int player, int computer) {
        if ((player == Moves.ROCK.getValue() && computer == Moves.ROCK.getValue())
                || (player == Moves.PAPER.getValue() && computer == Moves.PAPER.getValue())
                || (player == Moves.SCISSORS.getValue() && computer == Moves.SCISSORS.getValue())) {
            return "Draw.";
        } else if (player == Moves.ROCK.getValue() && computer == Moves.PAPER.getValue()) {
            getEnemyResult();
            return "Computer wins.";

        } else  if (player == Moves.ROCK.getValue() && computer == Moves.SCISSORS.getValue()) {
            getUserResult();
            return name + " wins.";

        } else if (player == Moves.SCISSORS.getValue() && computer == Moves.PAPER.getValue()) {
            getUserResult();
            return name + " wins.";

        } else if (player == Moves.SCISSORS.getValue() && computer == Moves.ROCK.getValue()) {
            getEnemyResult();
            return "Computer wins.";

        } else if (player == Moves.PAPER.getValue() && computer == Moves.ROCK.getValue()) {
            getUserResult();
            return name + " wins.";

        } else if (player == Moves.PAPER.getValue() && computer == Moves.SCISSORS.getValue()) {
            getUserResult();
            return "Computer wins.";
        }
        return null;
    }

    public String whoIsTheWinner(String name, int playerWins, int computerWins) {
        if (getEnemyResult() < getUserResult()) {
            return "Player " + name + " is the winner!";
        } else if (getEnemyResult() > getUserResult()) {
            return "Cumputer is the winner!";
        } else {
            return "No one's win.";
        }
    }
}
