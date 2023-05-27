package javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice.abstracts.PortableElectronicDevice;
import javax.swing.JOptionPane;

public class Smartphone extends PortableElectronicDevice {

    // Constructor
    public Smartphone(String brand, String model, short year) {
        super(brand, model, year);
    }

    @Override
    public void turnOn() {
        JOptionPane.showMessageDialog(null, "TURNING ON SMARTPHONE " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel()
        );
    }

    @Override
    public void turnOff() {
        JOptionPane.showMessageDialog(null, "TURNING OFF SMARTPHONE " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel()
        );
    }

    @Override
    public void charge() {
        JOptionPane.showMessageDialog(null, "CHARGING SMARTPHONE " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel()
        );
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "SMARTPHONE INFORMATION " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nYear: " + getYear()
        );
    }
}
