package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Order {

    private final User user;
    private final Product product;
    private final LocalDate dateOfSale;

    public Order(User user, Product product, LocalDate dateOfSale) {
        this.user = user;
        this.product = product;
        this.dateOfSale = dateOfSale;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }
}
