package javaObjectOrientedProgramming.theory.car;

// Class Controller
public class CarTest {
    public static void main(String[] args) {

        // Instantiating a Car object
        Car car = new Car();

        // Accessing Car class attributes
        car.brand = "Ford";
        car.color = "Orange";
        car.model = "GT";
        car.year = 2023;

        // Accessing Car class methods
        car.start();
        car.accelerate();
        car.stop();
    }
}
