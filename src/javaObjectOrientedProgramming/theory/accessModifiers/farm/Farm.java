package javaObjectOrientedProgramming.theory.accessModifiers.farm;
import javaObjectOrientedProgramming.theory.accessModifiers.animals.Bovine;
import javaObjectOrientedProgramming.theory.accessModifiers.animals.Chicken;

public class Farm {
    public static void main(String[] args) {
        Bovine bovine = new Bovine();
        Chicken chicken = new Chicken();

        // Accessing Bovine class from the Farm Class
        bovine.breed = "Holstein"; // ERROR: breed is private and is not accessible outside the class.
                                   // We cannot access directly private members from Farm class.

        bovine.gender = "Female";  // ERROR: gender is protected and is not accessible from Farm class
                                   // because Farm class is not a subclass of Bovine or Chicken.

        bovine.color = "Black";    // ERROR: color has default access and is not accessible from Farm.
                                   // It's not accessible outside the package or by subclasses in other packages.

        bovine.age = 2;            // Accessible from anywhere
    }
}
