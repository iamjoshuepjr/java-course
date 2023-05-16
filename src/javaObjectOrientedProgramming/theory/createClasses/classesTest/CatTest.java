package javaObjectOrientedProgramming.theory.createClasses.classesTest;

import javaObjectOrientedProgramming.theory.createClasses.classes.Cat;

// Class Controller
public class CatTest {
    public static void main(String[] args) {
        // Instantiating a Cat object
        Cat cat = new Cat();

        // Accessing Cat object attributes
        cat.name = "Whiskers";
        cat.age = 3;
        cat.breed = "Siamese";
        cat.color = "Orange";
        cat.isHungry = false;

        // Accessing Cat object methods
        cat.meow();
        cat.eat(false);
        cat.play();
        cat.sleep();
    }
}
