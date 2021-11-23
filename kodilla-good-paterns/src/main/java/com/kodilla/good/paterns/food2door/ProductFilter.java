package com.kodilla.good.paterns.food2door;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {

    private ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    private GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
    private HealthyShop healthyShop = new HealthyShop();

    public boolean searchInExtraFoodShop(String product) {
        List<Product> products = extraFoodShop.getProducts().stream()
                .filter(p -> p.getName().equals(product))
                .collect(Collectors.toList());
        if (products.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchInHealthyShop(String product) {
        List<Product> products = healthyShop.getProducts().stream()
                .filter(p -> p.getName().equals(product))
                .collect(Collectors.toList());
        if (products.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchInGlutenShop(String product) {
        List<Product> products = glutenFreeShop.getProducts().stream()
                .filter(p -> p.getName().equals(product))
                .collect(Collectors.toList());
        if (products.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
