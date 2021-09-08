package com.kodilla.rps;

public enum EndingMoves {

    NEW_GAME ("n"),
    EXIT_GAME ("x");

    private String mark;

    EndingMoves(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
}