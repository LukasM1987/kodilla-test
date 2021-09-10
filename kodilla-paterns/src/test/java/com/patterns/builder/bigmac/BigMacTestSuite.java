package com.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigMacTestSuite {

    @Test
    void individualBigMacTest() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun(BurgerBun.BUN_SESAME)
                .burgers(Burgers.BURGERS_TWO)
                .sauce(BurgerSauce.SAUCE_STANDARD)
                .ingredients(BurgerIngredients.INGREDIENT_BACON)
                .ingredients(BurgerIngredients.INGREDIENT_LETTUCE)
                .ingredients(BurgerIngredients.INGREDIENT_TOMATO)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        Burgers howManyBurgers = bigmac.getBurgers();
        BurgerSauce whatSauce = bigmac.getSauce();
        BurgerIngredients firstIngredient = bigmac.getIngredients().get(0);

        //Then
        Assertions.assertAll(
                () -> Assertions.assertEquals(3, howManyIngredients),
                () -> Assertions.assertEquals(2, howManyBurgers.getBurgers()),
                () -> Assertions.assertEquals("standard sauce", whatSauce.toString()),
                () -> Assertions.assertEquals("bacon", firstIngredient.toString())
        );
    }
}
