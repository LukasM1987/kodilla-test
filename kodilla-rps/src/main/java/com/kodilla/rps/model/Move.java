package com.kodilla.rps.model;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public enum Move {

    ROCK (1),
    PAPER (2),
    SCISSORS (3),
    EXIT (4),
    NEW (5),
    INVALID (6);

    private int value;

    Move(int value) {
        this.value = value;
    }

    public int isValue() {
        return value;
    }

    public static Move get(int index) {
        if (index < Move.values().length) {
            return Move.values()[index];
        } else {
            throw new IllegalStateException("Invalid index for Move");
        }
    }
}
