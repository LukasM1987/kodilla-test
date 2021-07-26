package com.kodilla.rps;

public enum Moves {

    ROCK (1, "Rock"),
    PAPER (2, "Paper"),
    SCISSORS (3, "Scissors");

    private int value;
    private String atribute;

    Moves(int value, String atribute) {
        this.value = value;
        this.atribute = atribute;
    }

    public int getValue() {
        return value;
    }

    public String getAtribute() {
        return atribute;
    }
}
