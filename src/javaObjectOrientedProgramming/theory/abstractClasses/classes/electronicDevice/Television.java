package javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice.abstracts.HomeElectronicDevice;
import javax.swing.JOptionPane;

public class Television extends HomeElectronicDevice {
    // Attributes
    private byte screenSize;

    // Constructor
    public Television(String brand, String model, short year, byte screenSize) {
        super(brand, model, year);
        this.screenSize = screenSize;
    }

    // Getter and Setters
    public byte getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        JOptionPane.showMessageDialog(null, "TURNING ON TELEVISION " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nScreen Size: " + getScreenSize());
    }

    @Override
    public void turnOff() {
        JOptionPane.showMessageDialog(null, "TURNING OFF TELEVISION " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nScreen Size: " + getScreenSize());
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "TELEVISION INFORMATION " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nYear: " + getYear() +
                "\nScreen Size: " + getScreenSize());
    }
}