package com.kodilla.good.paterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Shop {

    private static final String SHOP_NAME = "GLUTEN FREE SHOP";
    private List<Product> products = new ArrayList<>();

    @Override
    public String getShopName() {
        return SHOP_NAME;
    }

    public GlutenFreeShop() {

    }

    public void database(int quantity) {
        products.add(new Product("Product 9",quantity, 3.89));
        products.add(new Product("Product 10", quantity, 4.89));
        products.add(new Product("Product 11", quantity, 3.89));
        products.add(new Product("Product 12", quantity, 7.89));
    }

    public List<Product> getProducts() {
        return products;
    }
}
