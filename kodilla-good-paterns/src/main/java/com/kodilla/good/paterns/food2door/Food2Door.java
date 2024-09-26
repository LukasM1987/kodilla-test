package com.kodilla.good.paterns.food2door;

public class Food2Door {

    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        orderRequestRetriever.retrieve(extraFoodShop, 2, "Product 10");
    }
}
