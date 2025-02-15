package com.wipro.java.designpattern;

import com.wipro.java.designpattern.builders.CarBuilder;
import com.wipro.java.designpattern.builders.CarManualBuilder;
import com.wipro.java.designpattern.cars.Car;
import com.wipro.java.designpattern.cars.Manual;
import com.wipro.java.designpattern.director.Director;

public class Demo1 {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
