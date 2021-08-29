package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SaleRepositoryImpl implements SaleRepository {

    private static final List<Order> userOrders = new ArrayList<>();

    @Override
    public void printSaleSummary(User user, Product product, LocalDate localDate) {
        System.out.println("Saving transaction:"
                + "\nUser: " + user.getName()
                + "\nUser email address: " + user.getEmail()
                + "\nProduct: " + product.getName() + " (Price: " + product.getPrice() + " zl)"
                + "\nDate of purchase: " + localDate);
    }

    @Override
    public void addOrderToRepository(Order order) {
        userOrders.add(order);
    }
}
