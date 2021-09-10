package com.patterns.builder.bigmac;

public enum Burgers {

    BURGERS_ONE (1),
    BURGERS_TWO (2),
    BURGERS_THREE (3);

    private int burgers;

    Burgers(int burgers) {
        this.burgers = burgers;
    }

    public int getBurgers() {
        return burgers;
    }

    @Override
    public String toString() {
        return "" + burgers;
    }
}
