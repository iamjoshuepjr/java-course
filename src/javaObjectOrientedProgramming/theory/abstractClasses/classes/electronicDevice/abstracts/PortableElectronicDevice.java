package javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice.abstracts;

public abstract class PortableElectronicDevice extends ElectronicDevice{
    public PortableElectronicDevice(String brand, String model, short year) {
        super(brand, model, year);
    }

    public abstract void charge();
}
