package com.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void individualBigmacTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BurgerBun.BUN_SESAME.getBun())
                .burgers(Burgers.BURGERS_TWO.getBurgers())
                .sauce(BurgerSauce.SAUCE_STANDARD.getSauce())
                .ingredients(BurgerIngredients.INGREDIENT_BACON.getIngredient())
                .ingredients(BurgerIngredients.INGREDIENT_LETTUCE.getIngredient())
                .ingredients(BurgerIngredients.INGREDIENT_TOMATO.getIngredient())
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatSauce = bigmac.getSauce();
        String firstIngredient = bigmac.getIngredients().get(0);

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals(3, howManyIngredients),
                () -> Assertions.assertEquals(2, howManyBurgers),
                () -> Assertions.assertEquals("standard sauce", whatSauce),
                () -> Assertions.assertEquals("bacon", firstIngredient)
        );
    }
}
