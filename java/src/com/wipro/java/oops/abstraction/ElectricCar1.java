package com.wipro.java.oops.abstraction;

/**
 * Child class - ElectricCar1 (inherits from Car1)
 */
public class ElectricCar1 extends Car1 {

    // Constructor
    public ElectricCar1(String brand) {
        // Setting the brand using the setter method
        setBrand(brand);  // Set the brand without using super
    }

    // Implementing the abstract method
    @Override
    public void fuelType() {
        System.out.println(brand + " runs on electricity.");
    }

    // Main method to run ElectricCar1
    public static void main(String[] args) {
        ElectricCar1 myElectricCar = new ElectricCar1("Tesla");
        myElectricCar.displayInfo();
        myElectricCar.fuelType();
    }
}
