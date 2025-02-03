package com.wipro.java.oops.inheritance;

/**
 * Child class - ElectricCar (inherits from Car)
 */
public class ElectricCar extends Car {

    // Constructor
    public ElectricCar(String brand) {
        // Setting the brand using the setter method
        setBrand(brand);  // 
    }

    // Overriding fuelType method
    @Override
    public void fuelType() {
        System.out.println(brand + " runs on electricity.");
    }

    // Main method to run ElectricCar
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Tesla");
        myElectricCar.displayInfo();
        myElectricCar.fuelType();
    }
}
