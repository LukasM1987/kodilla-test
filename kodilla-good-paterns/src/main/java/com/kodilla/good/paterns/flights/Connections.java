package com.kodilla.good.paterns.flights;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Connections {

    private static final Set<Flight> flights = new HashSet<>();

    public Set<Flight> connectionsDatabase() {
        flights.add(new Flight("Warsaw", "Paris", LocalDate.now()));
        flights.add(new Flight("Warsaw", "Berlin", LocalDate.now()));
        flights.add(new Flight("Warsaw", "New York", LocalDate.now()));
        flights.add(new Flight("Warsaw", "London", LocalDate.now()));
        flights.add(new Flight("Paris", "Barcelona", LocalDate.now()));
        flights.add(new Flight("Berlin", "Rome", LocalDate.now()));
        flights.add(new Flight("Rome", "Miami", LocalDate.now()));
        flights.add(new Flight("Paris", "Miami", LocalDate.now()));
        return flights;
    }
}
