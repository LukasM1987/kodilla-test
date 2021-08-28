package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class EmailService implements InformationService {

    @Override
    public void information(User user, Product product, LocalDate localDate, boolean isSold) {
        if (isSold) {
            System.out.println("Thank you " + user.getUserName() + " for buying: " + product.getProductName() + " at: " + localDate);
        } else {
            System.out.println("Sorry, but we don't have product: " + product.getProductName() + " in stock.");
        }
    }
}