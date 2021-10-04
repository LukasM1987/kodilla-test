package com.kodilla.sudoku;

import java.util.Objects;

public class ElementPosition {

    private int xPos;
    private int yPos;
    private String position;

    public ElementPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
