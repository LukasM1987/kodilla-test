package com.kodilla.good.paterns.flights;

public class FlightNotExist extends Exception {

    public FlightNotExist(final String message) {
        super(message);
    }
}
