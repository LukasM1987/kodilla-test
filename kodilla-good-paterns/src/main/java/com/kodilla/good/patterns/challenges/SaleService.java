package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SaleService {

    boolean order(User user, Product product, LocalDate localDate, boolean isTransaction);
}
