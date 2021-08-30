package com.kodilla.good.paterns.flights;

public class FlightRunner {

    public static void main(String[] args) {

        FlightFinder flightfinder = new FlightFinder();

        flightfinder.findDepartureConnection("Berlin");
        flightfinder.findArrivalConnection("London");
        flightfinder.findViaConnection("Warsaw", "Paris", "Miami");

        flightfinder.findDepartureConnection("Radom");
        flightfinder.findArrivalConnection("Glasgow");
        flightfinder.findViaConnection("Wroclaw", "Paris", "Miami");


    }
}
