package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SaleRepository {

    void createSaleRepository(User user, Product product, LocalDate localDate);
}