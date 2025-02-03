package com.wipro.java.oops.abstraction;

/**
 * Abstract class - Car1
 */
public abstract class Car1 {
    String brand;

    
    public Car1() {
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

    // Abstract method to be implemented by subclasses
    public abstract void fuelType();


    public static void main(String[] args) {
    }
}
