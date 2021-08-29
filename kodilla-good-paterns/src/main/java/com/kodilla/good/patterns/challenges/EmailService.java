package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class EmailService implements InformationService {

    @Override
    public void inform(User user, Product product, LocalDate localDate, boolean isSold) {
        if (isSold) {
            System.out.println("Thank you " + user.getName() + " for buying: " + product.getName() + " at: " + localDate);
        } else {
            System.out.println("Sorry, but we don't have product: " + product.getName() + " in stock.");
        }
    }
}
