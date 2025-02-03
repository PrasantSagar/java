package com.wipro.java.oops.abstraction;

/**
 * Child class - SportsCar1 (inherits from Car1)
 */
public class SportsCar1 extends Car1 {

    // Constructor
    public SportsCar1(String brand) {
        // Setting the brand using the setter method
        setBrand(brand);  // Set the brand without using super
    }

    // Implementing the abstract method
    @Override
    public void fuelType() {
        System.out.println(brand + " runs on high-performance petrol.");
    }

    // Main method to run SportsCar1
    public static void main(String[] args) {
        SportsCar1 mySportsCar = new SportsCar1("Ferrari");
        mySportsCar.displayInfo();
        mySportsCar.fuelType();
    }
}

