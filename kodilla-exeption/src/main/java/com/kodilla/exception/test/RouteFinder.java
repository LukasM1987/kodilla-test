package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    public void findRoutes(Flight flight, Map<String, Boolean> routes) throws RouteNotFoundException {
        if (!routes.containsKey(flight.getArrivalAirport()) || !routes.containsKey(flight.getDepartureAirptort())) {
            throw new RouteNotFoundException();
        } else {
            if (routes.get(flight.getDepartureAirptort()) && routes.get(flight.getArrivalAirport())) {
                System.out.println("Connection is existing.");
            } else {
                System.out.println("Connection does not exist.");
            }
        }
    }
}