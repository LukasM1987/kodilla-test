package com.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private final BurgerBun bun;
    private final Burgers burgers;
    private final BurgerSauce sauce;
    private List<BurgerIngredients> ingredients;

    public static class BigMacBuilder {
        private BurgerBun bun;
        private Burgers burgers;
        private BurgerSauce sauce;
        private List<BurgerIngredients> ingredients = new ArrayList<>();

        public BigMacBuilder bun(BurgerBun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(Burgers burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(BurgerSauce sauce) {
            this.sauce = sauce;
            return this;
        }


        public BigMacBuilder ingredients(BurgerIngredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    private BigMac(BurgerBun bun, Burgers burgers, BurgerSauce sauce, List<BurgerIngredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public BurgerBun getBun() {
        return bun;
    }

    public Burgers getBurgers() {
        return burgers;
    }

    public BurgerSauce getSauce() {
        return sauce;
    }


    public List<BurgerIngredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
