package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.animalMicrochip.Animal;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class AnimalMicrochip {
    public static void main(String[] args) {
        GregorianCalendar birthDate = new GregorianCalendar(2021, 5, 24);
        GregorianCalendar adoptionDate = new GregorianCalendar(2022, 7, 12);

        Animal animal1 = new Animal();
        animal1.setAnimal_id("00001");
        animal1.setName("Simba");
        animal1.setSpecies("Cat");
        animal1.setBreed("British ShortHair");
        animal1.setAge("2");
        animal1.setColor("Orange");
        animal1.setGender("Male");
        animal1.setOwner_id("000001");
        animal1.setDate_birth(birthDate);
        animal1.setDate_adoption(adoptionDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        JOptionPane.showMessageDialog(null, "Cat Information!" +
                "\nId: " + animal1.getAnimal_id() +
                "\nName: " + animal1.getName() +
                "\nSpecies: " + animal1.getSpecies() +
                "\nBreed: " + animal1.getBreed() +
                "\nAge: " + animal1.getAge() +
                "\nColor " + animal1.getColor() +
                "\nGender: " + animal1.getGender() +
                "\nOwner Id: " + animal1.getOwner_id() +
                "\nBirth Date: " + dateFormat.format(animal1.getDate_birth().getTime()) +
                "\nAdoption Date: " + dateFormat.format(animal1.getDate_adoption().getTime())
        );
    }
}