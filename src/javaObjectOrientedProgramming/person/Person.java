package javaObjectOrientedProgramming.person;

import javax.swing.*;

public class Person {

    public String name;
    public String lastname;
    public byte age;

    public Person(String n, String lname, byte a){
        name = n;
        lastname = lname;
        age = a;
    }

    public void displayInfo(){
        System.out.println("");
    }
}
