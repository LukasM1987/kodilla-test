package com.kodilla.exception.test;


public class FlightRunner {

    public static void main(String[] args) {
        Flight flight = new Flight("Warszawa", "azfa");
        RouteFinder findRoute = new RouteFinder();
        try {
            findRoute.findRoutes(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("This Airport does not exist. Error: " + e);
        } finally {
            System.out.println("Thank you for using our services.");
        }
    }
}
