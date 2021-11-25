package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaDecoratorTestSuite {

    @Test
    void basicPizzaTest() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String pizza = pizzaOrder.getDescription();

        //Then
        Assertions.assertEquals(new BigDecimal(15), calculatedCost);
        Assertions.assertEquals("Pizza with standard pizza dough, tomato sos and mozzarella cheese", pizza);
    }

    @Test
    void pizzaWithExtraCheeseTest() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String pizza = pizzaOrder.getDescription();

        //Then
        Assertions.assertEquals(new BigDecimal(17), calculatedCost);
        Assertions.assertEquals("Pizza with standard pizza dough, tomato sos and mozzarella cheese + extra 50 grams cheese", pizza);
    }

    @Test
    void fullIngredientsPizzaTest() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ChilliPeppersDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String pizza = pizzaOrder.getDescription();

        //Then
        Assertions.assertEquals(new BigDecimal(27), calculatedCost);
        Assertions.assertEquals("Pizza with standard pizza dough, tomato sos and mozzarella cheese + extra 50 grams cheese + extra 50 grams cheese + 15 grams of chilli peppers + Salami", pizza);
    }
}
