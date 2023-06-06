package javaObjectOrientedProgramming.exercises.interfaces.classes.tesla;

import javaObjectOrientedProgramming.exercises.interfaces.classes.tesla.abstracts.Car;
import javaObjectOrientedProgramming.exercises.interfaces.classes.tesla.interfaces.AutonomousDriving;
import javaObjectOrientedProgramming.exercises.interfaces.classes.tesla.interfaces.ElectricVehicle;

import javax.swing.*;

public class ModelS extends Car implements ElectricVehicle, AutonomousDriving {
    public ModelS(String vin) {
        super("ModelS", vin);
    }

    @Override
    public void start() {
        JOptionPane.showMessageDialog(null, "Hello! Ready to drive?\nLet's start the Tesla " +getModel()+ "\nEnjoy the ride!");
    }

    @Override
    public void stop() {
        JOptionPane.showMessageDialog(null, "Safely stopping the Tesla " +getModel() + "\nThank you for the trip!" );
    }

    @Override
    public void engageAutopilot() {
        JOptionPane.showMessageDialog(null, "Autopilot engaged! \nSit back, relax, and enjoy the advanced driving capabilities of the Tesla " + getModel());
    }

    @Override
    public void disengageAutopilot() {
        JOptionPane.showMessageDialog(null, "Disengaging autopilot on the Tesla " +getModel()+".\nPlease take control and drive safely!");
    }

    @Override
    public void charge() {
        JOptionPane.showMessageDialog(null, "Charging the Tesla " + getModel() + ". \nPlease connect the charging cable to power up!");
    }
}