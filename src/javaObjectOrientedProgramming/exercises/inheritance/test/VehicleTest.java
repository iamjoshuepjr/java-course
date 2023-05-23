package javaObjectOrientedProgramming.exercises.inheritance.test;

import javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle.Car;
import javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle.Motorcycle;
import javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle.Truck;
import javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle.Vehicle;

import javax.swing.JOptionPane;

public class VehicleTest {


    public static void displayRentalCost(Object object, String title) {
        if (object instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) object;
            JOptionPane.showMessageDialog(null, title + "\nTotal: USD$ " + vehicle.calculateRentalCost(29));
        } else if (object instanceof Car) {
            Car car = (Car) object;
            JOptionPane.showMessageDialog(null, title + "\nTotal: USD$ " + car.calculateRentalCost(5));
        } else if (object instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) object;
            JOptionPane.showMessageDialog(null, title + "\nTotal: USD$ " + motorcycle.calculateRentalCost(55));
        } else if (object instanceof Truck) {
            Truck truck = (Truck) object;
            JOptionPane.showMessageDialog(null, title + "\nTotal: USD$ " + truck.calculateRentalCost(40));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid object type!");
        }
    }
    public static void main(String[] args) {
        // Instantiating a Vehicle object
        Vehicle vehicle = new Vehicle(30.0F, 20.0F, 50.0F, "ABC123", "Honda", "Civic", (short) 2022);
        vehicle.information("VEHICLE INFORMATION");
        displayRentalCost(vehicle, "VEHICLE RENTAL COST");

        // Instantiating a Car object
        Car car = new Car(30.0F, 20.0F, 50.0F, "DEF456", "Toyota", "Corolla", (short) 2022, 35.5F, true, "Blue");
        car.information("CAR INFORMATION");
        displayRentalCost(car, "CAR RENTAL COST");

        // Instantiating a Motorcycle object
        Motorcycle motorcycle = new Motorcycle(20.0F, 15.0F, 40.0F, "GHI789", "Harley-Davidson", "Sportster", (short) 2021, 45.2F);
        motorcycle.information("MOTORCYCLE INFORMATION");
        displayRentalCost(motorcycle, "MOTORCYCLE RENTAL COST");

        // Instantiating a Truck object
        Truck truck = new Truck(40.0F, 25.0F, 60.0F, "JKL012", "Ford", "F-150", (short) 2022, 18.5F);
        truck.information("TRUCK INFORMATION");
        displayRentalCost(truck, "TRUCK RENTAL COST");
    }
}