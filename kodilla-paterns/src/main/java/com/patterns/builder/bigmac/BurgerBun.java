package com.patterns.builder.bigmac;

public enum BurgerBun {

    BUN_SESAME ("bun with sesame seeds"),
    BUN_STANDARD ("standard bun");

    private String bun;

    BurgerBun(String bun) {
        this.bun = bun;
    }

    public String getBun() {
        return bun;
    }

    @Override
    public String toString() {
        return "" + bun;
    }
}
