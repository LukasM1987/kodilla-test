package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductService implements SaleService {

    @Override
    public boolean order(User user, Product product, LocalDate localDate, boolean isTransaction) {
        if (isTransaction) {
            System.out.println("User: " + user.getName()
                    + " e-mail address: " + user.getEmail()
                    + " bought product: " + product.getName()
                    + " (" + product.getPrice() + ") "
                    + " Day of purchase: " + localDate);
            return true;
        } else {
            System.out.println("User: " + user.getName()
                    + " e-mail address: " + user.getEmail()
                    + " product name: " + product.getName()
                    + " Day you wanted to buy: " + localDate);
            return false;
        }
    }
}