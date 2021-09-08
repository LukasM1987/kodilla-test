package com.kodilla.exception.test;

public class Flight {
    private String departureAirptort;
    private String arrivalAirport;

    public Flight(String departureAirptort, String arrivalAirport) {
        this.departureAirptort = departureAirptort;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirptort() {
        return departureAirptort;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
