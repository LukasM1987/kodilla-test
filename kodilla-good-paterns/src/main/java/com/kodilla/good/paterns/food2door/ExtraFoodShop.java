package com.kodilla.good.paterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Shop {

    private static final String SHOP_NAME = "EXTRA FOOD SHOP";
    private List<Product> products = new ArrayList<>();

    @Override
    public String getShopName() {
        return SHOP_NAME;
    }

    public ExtraFoodShop() {

    }

    public void database(int quantity) {
        products.add(new Product("Product 1", quantity, 9.99));
        products.add(new Product("Product 2", quantity, 8.99));
        products.add(new Product("Product 3", quantity, 7.99));
        products.add(new Product("Product 4", quantity, 6.99));
    }

    public List<Product> getProducts() {
        return products;
    }
}
