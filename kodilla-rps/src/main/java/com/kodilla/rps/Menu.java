package com.kodilla.rps;

public class Menu implements MenuInterface {

    @Override
    public void askName() {
        System.out.print("Enter your name: ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Welcome in PAPER, ROCK, SCISSORS GAME " + name);
    }

    @Override
    public void askRounds(String name) {
        System.out.print(name + " please enter quantity of rounds: ");
    }

    @Override
    public void instruction() {
        System.out.println("INSTRUCTION:");
        System.out.println("ROCK = 1");
        System.out.println("PAPER = 2");
        System.out.println("SCISSORS = 3");
    }

    @Override
    public void roundResult(String result) {
        System.out.println(result);
    }

    @Override
    public void askNewGame() {
        System.out.println("If you want start new game, please enter n key.");
    }

    @Override
    public void askExit() {
        System.out.print("If you want exit, please enter x key: ");
    }

    @Override
    public void wrongKey() {
        System.out.print("You have entered wrong number! Please enter correct number (1-3): ");
    }

    @Override
    public void setMove(String name) {
        System.out.print(name + " your move: ");
    }

    @Override
    public void playerMove(String name, int move) {
        if (move == Moves.ROCK.getValue()) {
            System.out.println(name + ", you have chosen: " + Moves.ROCK.getAtribute());
        } else if (move == Moves.PAPER.getValue()) {
            System.out.println(name + ", you have chosen: " + Moves.PAPER.getAtribute());
        } else if (move == Moves.SCISSORS.getValue()) {
            System.out.println(name + ", you have chosen: " + Moves.SCISSORS.getAtribute());
        }
    }

    @Override
    public void computerMove(int move) {
        if (move == Moves.ROCK.getValue()) {
            System.out.println("Computer chose: " + Moves.ROCK.getAtribute());
        } else if (move == Moves.PAPER.getValue()) {
            System.out.println("Computer chose: " + Moves.PAPER.getAtribute());
        } else if (move == Moves.SCISSORS.getValue()) {
            System.out.println("Computer chose: " + Moves.SCISSORS.getAtribute());
        }
    }

    @Override
    public void playerResult(String name, int result) {
        System.out.println(name + " won: " + result + " times.");
    }

    @Override
    public void computerResult(int result) {
        System.out.println("Computer won: " + result + " times.");
    }

    @Override
    public void whoIsTheWinner(String statisticsResult) {
        System.out.println(statisticsResult);
    }

    @Override
    public void wrongEndKey(String name) {
        System.out.print(name + " you have entered wrong key, please enter n or x: ");
    }
}
