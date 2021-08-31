package com.kodilla.good.paterns.flights;


import java.time.LocalDate;
import java.util.Set;

public class FlightFinder {

    private FlightRepository connections = new FlightRepository();




    public void findArrivalConnection(String arrival) {
        Set<Flight> flight = connections.flights();
        System.out.println("Find a flight to: ");
        flight.stream()
                .filter(f -> f.getArrivalCity().equals(arrival))
                .forEach(System.out::println);
        arrivalNoExist(arrival);
        System.out.println();
    }

    public void findDepartureConnection(String departure) {
        Set<Flight> flight = connections.flights();
        System.out.println("Find a flight from: ");
        flight.stream()
                .filter(f -> f.getDepartureCity().equals(departure))
                .forEach(System.out::println);
        departureNoExist(departure);
        System.out.println();
    }

    public void findViaConnection(String departure, String via, String arrival) {
        Set<Flight> flight1 = connections.flights();
        Set<Flight> flight2 = connections.flights();
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

    private void arrivalNoExist(String arrival) {
        Set<Flight> flight = connections.flights();
        if (!flight.contains(new Flight("Warsaw", arrival, LocalDate.now()))) {
            System.out.println("Connection does not exist.");
        }
    }

    private void departureNoExist(String departure) {
        Set<Flight> flight = connections.flights();
        if (!flight.contains(new Flight(departure, "Rome", LocalDate.now()))) {
            System.out.println("Connection does not exist.");
        }
    }
}
