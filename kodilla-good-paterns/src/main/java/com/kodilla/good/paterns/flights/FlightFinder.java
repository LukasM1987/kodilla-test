package com.kodilla.good.paterns.flights;


import java.time.LocalDate;
import java.util.Set;

public class FlightFinder {

    private Connections connections = new Connections();

    private final Set<Flight> flight = connections.connectionsDatabase();
    private final Set<Flight> flight1 = connections.connectionsDatabase();
    private final Set<Flight> flight2 = connections.connectionsDatabase();

    public void findArrivalConnection(String arrival) {
        System.out.println("Find a flight to: ");
        flight.stream()
                .filter(flight -> flight.getArrivalCity().equals(arrival))
                .forEach(System.out::println);
        if (!flight.contains(new Flight("Warsaw", arrival, LocalDate.now()))) {
            System.out.println("Connection does not exist.");
        }
        System.out.println();
    }

    public void findDepartureConnection(String departure) {
        System.out.println("Find a flight from: ");
        flight.stream()
                .filter(flight -> flight.getDepartureCity().equals(departure))
                .forEach(System.out::println);
        if (!flight.contains(new Flight(departure, "Rome", LocalDate.now()))) {
            System.out.println("Connection does not exist.");
        }
        System.out.println();
    }

    public void findViaConnection(String departure, String via, String arrival) {
        System.out.println("Find a flight via: " + via);
        if (!flight1.contains(new Flight(departure, via, LocalDate.now()))
                || !flight2.contains(new Flight(via, arrival, LocalDate.now()))) {
            System.out.println("Connection does not exist.");
        } else {
            flight1.stream()
                    .filter(flight -> flight.getDepartureCity().equals(departure))
                    .filter(flight -> flight.getArrivalCity().equals(via))
                    .forEach(System.out::println);
            flight2.stream()
                    .filter(flight -> flight.getDepartureCity().equals(via))
                    .filter(flight -> flight.getArrivalCity().equals(arrival))
                    .forEach(System.out::println);
        }
    }
}
