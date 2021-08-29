package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SaleRepository {

    void printSaleSummary(User user, Product product, LocalDate localDate);
    void addOrderToRepository(Order order);
}
