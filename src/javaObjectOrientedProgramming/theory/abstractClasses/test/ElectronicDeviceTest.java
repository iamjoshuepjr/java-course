package javaObjectOrientedProgramming.theory.abstractClasses.test;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice.*;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice.abstracts.ElectronicDevice;

// Controller Class
public class ElectronicDeviceTest {
    public static void main(String[] args) {

        ElectronicDevice television = new Television("LD", "XL24", (short) 2023, (byte) 45);
        ElectronicDevice tablet = new Tablet("APPLE", "XL24", (short) 2023);
        ElectronicDevice smartphone = new Smartphone("APPLE", "Iphone 14", (short) 2023);

        ElectronicDevice[] devices = {television, tablet, smartphone};

        for (ElectronicDevice device: devices) {
            device.information();
            device.turnOn();
            device.setBrand("ORANGE");
            device.information();
            device.turnOff();
        }
    }
}
