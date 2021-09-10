package com.patterns.builder.bigmac;

public enum BurgerSauce {

    SAUCE_STANDARD ("standard sauce"),
    SAUCE_BARBECUE ("barbecue sauce"),
    SAUCE_1000_ISLANDS ("1000 islands sauce");

    private String sauce;

    BurgerSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSauce() {
        return sauce;
    }
}
