package com.wipro.java.oops.inheritance;

/**
 * Parent class - Car
 */
public class Car {
     String brand;

    
    public Car() {
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Concrete method to display info
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
    }

    // Method to be overridden by child classes
    public void fuelType() {
        System.out.println("Cars can have different fuel types.");
    }

    public static void main(String[] args) {
    }
}

