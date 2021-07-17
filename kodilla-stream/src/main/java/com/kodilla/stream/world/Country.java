package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String country;
    private final BigDecimal citizensNumber;

    public Country(String country, BigDecimal citizensNumber) {
        this.country = country;
        this.citizensNumber = citizensNumber;
    }

    //
    public String getCountry() {
        return country;
    }

    public BigDecimal getCitizensNumber() {
        return citizensNumber;
    }
}
