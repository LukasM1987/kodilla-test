package com.kodilla.good.paterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Shop {

    private static final String SHOP_NAME = "HEALTHY SHOP";
    private List<Product> products = new ArrayList<>();


    @Override
    public String getShopName() {
        return SHOP_NAME;
    }

    public HealthyShop() {

    }

    public void database(int quantity) {
        products.add(new Product("Product 5", quantity, 7.79));
        products.add(new Product("Product 6", quantity, 6.79));
        products.add(new Product("Product 7", quantity, 5.79));
        products.add(new Product("Product 8", quantity, 4.79));
    }

    public List<Product> getProducts() {
        return products;
    }
}
