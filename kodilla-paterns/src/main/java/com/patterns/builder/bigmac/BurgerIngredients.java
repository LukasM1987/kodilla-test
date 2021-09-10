package com.patterns.builder.bigmac;

public enum BurgerIngredients {

    INGREDIENT_TOMATO("tomato"),
    INGREDIENT_BACON("bacon"),
    INGREDIENT_LETTUCE("lettuce"),
    INGREDIENT_CHEESE("cheese");

    private String ingredient;

    BurgerIngredients(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }
}