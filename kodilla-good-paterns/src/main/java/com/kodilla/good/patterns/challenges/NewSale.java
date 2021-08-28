package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class NewSale implements SaleRepository {

    @Override
    public void createSaleRepository(User user, Product product, LocalDate localDate) {
        System.out.println("Saving transaction:"
                + "\nUser: " + user.getUserName()
                + "\nUser email address: " + user.getEmail()
                + "\nProduct: " + product.getProductName() + " (Price: " + product.getPrice() + " zl)"
                + "\nDate of purchase: " + localDate);
    }
}