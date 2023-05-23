package javaObjectOrientedProgramming.exercises.inheritance.test;

import javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle.Car;
import javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        // Instantiating a Vehicle object
        var vehicle = new Vehicle(20F, "Cali5636", "Ford", "2022", (short) 2021);
        vehicle.information();
        vehicle.calculateRentalCost(24);

        // Instantiating a Car object
        var car = new Car(20F, "orange99", "Ford", "2022", (short) 2021, 39.8F, true, "Orange");
        car.information();
        car.calculateRentalCost(5);
    }
}
