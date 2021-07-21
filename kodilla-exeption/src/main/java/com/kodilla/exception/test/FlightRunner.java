package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) {
        FindRoute findRoute = new FindRoute();
        try {
            findRoute.findRoutes(new Flight("Berlin", "Radom"));
            System.out.println("This connection is exist.");
        } catch (RouteNotFoundException e) {
            System.out.println("This connection does not exist. Error: " + e);
        }
    }
}
