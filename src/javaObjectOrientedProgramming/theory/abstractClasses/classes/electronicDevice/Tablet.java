package javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice.abstracts.PortableElectronicDevice;
import javax.swing.JOptionPane;

public class Tablet extends PortableElectronicDevice {

    // Constructor
    public Tablet(String brand, String model, short year) {
        super(brand, model, year);
    }

    @Override
    public void turnOn() {
        JOptionPane.showMessageDialog(null, "TURNING ON TABLET " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel()
        );
    }

    @Override
    public void turnOff() {
        JOptionPane.showMessageDialog(null, "TURNING ON TABLET " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel()
        );
    }

    @Override
    public void charge() {
        JOptionPane.showMessageDialog(null, "CHARGING TABLET " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel()
        );
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "TABLET INFORMATION " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nYear: " + getYear()
        );
    }
}