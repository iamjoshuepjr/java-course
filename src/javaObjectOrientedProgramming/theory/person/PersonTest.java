package javaObjectOrientedProgramming.theory.person;

// Class Controller
public class PersonTest {
    public static void main(String[] args) {
        // Instantiating a Person object
        Person person = new Person();
        person.name = "Josué";
        person.lastname = "Pimienta";
        person.age = 24;
        person.occupation = "Software Developer";

        person.sayHello();
    }
}
