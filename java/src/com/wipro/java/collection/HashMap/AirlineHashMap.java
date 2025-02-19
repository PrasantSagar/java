package com.wipro.java.collection.HashMap;

import java.util.HashMap;
import java.util.Map;

class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;

    public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Getters and toString method for displaying flight information
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                '}';
    }
}

public class AirlineHashMap {
    private Map<String, Flight> flights;

    public AirlineHashMap() {
        flights = new HashMap<>();
    }

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    public Flight getFlight(String flightNumber) {
        return flights.get(flightNumber);
    }

    public void removeFlight(String flightNumber) {
        flights.remove(flightNumber);
    }

    public static void main(String[] args) {
        AirlineHashMap airline = new AirlineHashMap();

        Flight flight1 = new Flight("AI101", "Delhi", "Mumbai", "10:00 AM", "12:00 PM");
        Flight flight2 = new Flight("AI102", "Mumbai", "Chennai", "1:00 PM", "3:00 PM");

        airline.addFlight(flight1);
        airline.addFlight(flight2);

        System.out.println("Flight AI101: " + airline.getFlight("AI101"));
        System.out.println("Flight AI102: " + airline.getFlight("AI102"));

        airline.removeFlight("AI101");
        System.out.println("Flight AI101 after removal: " + airline.getFlight("AI101"));
    }
}
