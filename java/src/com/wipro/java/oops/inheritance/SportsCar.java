package com.wipro.java.oops.inheritance;

/**
 * Child class - SportsCar (inherits from Car)
 */
public class SportsCar extends Car {

    // Constructor
    public SportsCar(String brand) {
        // Setting the brand using the setter method
        setBrand(brand);  // 
    }

    // Overriding fuelType method
    @Override
    public void fuelType() {
        System.out.println(brand + " runs on high-performance petrol.");
    }

    // Main method to run SportsCar
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar("Ferrari");
        mySportsCar.displayInfo();
        mySportsCar.fuelType();
    }
}
