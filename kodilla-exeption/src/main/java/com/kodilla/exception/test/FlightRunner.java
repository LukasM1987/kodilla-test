package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) {
        RouteFinder findRoute = new RouteFinder();
        try {
            findRoute.findRoutes(new Flight("Berlin", "Radom"));
        } catch (RouteNotFoundException e) {
            System.out.println("This connection does not exist. Error: " + e);
        } finally {
            System.out.println("Thank you for using our services.");
        }
        try {
            findRoute.findRoutes(new Flight("Berlin", "dfgdsfg"));
        } catch (RouteNotFoundException e) {
            System.out.println("This connection does not exist. Error: " + e);
        } finally {
            System.out.println("Thank you for using our services.");
        }
        try {
            findRoute.findRoutes(new Flight("Berlin", "Warszawa"));
        } catch (RouteNotFoundException e) {
            System.out.println("This connection does not exist. Error: " + e);
        } finally {
            System.out.println("Thank you for using our services.");
        }
    }
}
