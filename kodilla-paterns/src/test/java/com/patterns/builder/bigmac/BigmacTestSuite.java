package com.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void individualBigmacTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame seeds")
                .burgers(2)
                .sauce("standard")
                .ingredients("bacon")
                .ingredients("lettuce")
                .ingredients("tomato")
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
                () -> Assertions.assertEquals("standard", whatSauce),
                () -> Assertions.assertEquals("bacon", firstIngredient)
        );
    }
}
