package javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.animalMicrochip;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

// Object CLass
public class Animal {
    // Attributes
    private String animal_id;
    private String name;
    private String species;
    private String breed;
    private String age;
    private String color;
    private String gender;
    private String owner_id;
    private GregorianCalendar date_birth;
    private SimpleDateFormat date_adoption;

    // Empty Constructor
    public Animal(){}

    // Overloaded Constructor
    public Animal(String animal_id, String name, String species, String breed, String age, String color, String gender, String owner_id, GregorianCalendar date_birth, GregorianCalendar date_adoption) {
        this.animal_id = animal_id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.owner_id = owner_id;
        this.date_birth = date_birth;
        this.date_adoption = date_adoption;
    }

    public String getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(String animal_id) {
        this.animal_id = animal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public GregorianCalendar getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(GregorianCalendar date_birth) {
        this.date_birth = date_birth;
    }

    public GregorianCalendar getDate_adoption() {
        return date_adoption;
    }

    public void setDate_adoption(GregorianCalendar date_adoption) {
        this.date_adoption = date_adoption;
    }
}