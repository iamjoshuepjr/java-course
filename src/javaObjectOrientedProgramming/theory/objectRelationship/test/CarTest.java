package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.carEngine.Car;
import javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.carEngine.Engine;

import javax.swing.JOptionPane;


public class CarTest {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", (short) 600);
        Car car = new Car("Tesla", "Model S", engine);

        Engine carEngine = car.getEngine();

        JOptionPane.showMessageDialog(null, "Tesla Information" +
                "\nBrand: " + car.getBrand() +
                "\nModel: " + car.getModel() +
                "\nEngine Type: " + carEngine.getType() +
                "\nEngine Horse Power: " + carEngine.getHorsePower());
    }
}