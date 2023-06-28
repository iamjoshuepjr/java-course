package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.personPassport.*;

public class PersonPassportTest {
    public static void main(String[] args) {
        Person person = new Person("Joshuép Jr.", (short) 24);
        Passport passport = new Passport("1345889352", "Colombia");

        person.setPassport(passport);
        person.travel("San José, CA");
    }
}
