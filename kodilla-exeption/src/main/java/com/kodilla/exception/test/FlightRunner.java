package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightRunner {

    public static void main(String[] args) {
        Flight flight = new Flight("Warszawa", "Berlin");
        RouteFinder findRoute = new RouteFinder();
        Map<String, Boolean> routes = new HashMap<>();
        routes.put("Warszawa", true);
        routes.put("Modlin", true);
        routes.put("Lodz", false);
        routes.put("Barcelona", true);
        routes.put("Radom", false);
        routes.put("Lublin", false);
        routes.put("Berlin", true);
        routes.put("Olsztyn", false);
        try {
            findRoute.findRoutes(flight, routes);
        } catch (RouteNotFoundException e) {
            System.out.println("This Airport does not exist. Error: " + e);
        } finally {
            System.out.println("Thank you for using our services.");
        }
    }
}
