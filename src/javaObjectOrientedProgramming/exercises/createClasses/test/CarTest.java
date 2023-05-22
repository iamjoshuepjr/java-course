package javaObjectOrientedProgramming.exercises.createClasses.test;
import javaObjectOrientedProgramming.exercises.createClasses.classes.Car;

import javax.swing.JOptionPane;

/**
 * Build a program that, given a series of vehicles characterized
 * by their brand, model, and price, prints the properties of the cheapest vehicle.
 * To do this, the characteristics of each vehicle should be read from the keyboard.
 */

// Controller Class
public class CarTest {

    public static int cheaper(Car[] cars){
        float price;
        int index = 0;

        price = cars[0].getPrice();

        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getPrice() < price) {
                price = cars[i].getPrice();
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String brand, model;
        float price;
        int cheaperIndex;
        int carNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of car you want to store"));

        Car[] cars = new Car[carNumber];

        for (int i = 0; i < cars.length; i++){
            JOptionPane.showMessageDialog(null, "Enter the car "+(i+1)+"'s attributes" );
            brand = JOptionPane.showInputDialog("Enter the car's brand");
            model = JOptionPane.showInputDialog("Enter the car's model");
            price = Float.parseFloat(JOptionPane.showInputDialog("Enter the car's price"));

            cars[i] = new Car(brand, model, price);
        }

        cheaperIndex = cheaper(cars);
        JOptionPane.showMessageDialog(null, "Cheaper Car\n" +
                cars[cheaperIndex].displayInformation()
        );
    }
}