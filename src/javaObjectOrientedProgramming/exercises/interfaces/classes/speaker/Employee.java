package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts.Person;
import javax.swing.JOptionPane;

public class Employee extends Person {
    // Attributes
    private String department;
    private String position;

    // Employee Constructor
    public Employee(String name, byte age, String gender, String department, String position) {
        // Person Constructor
        super(name, age, gender);
        this.department = department;
        this.position = position;
    }

    // getters
    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    // Inherited Methods
    @Override
    public void wakeUp() {
        JOptionPane.showMessageDialog(null, getName() + ", it's time to get up!");
    }

    @Override
    public void read(String[] books) {
        StringBuilder message = new StringBuilder();
        message.append(getName() + ", it's time to read\n" );
        message.append("Books to read: ");

        for (String book: books) {
            message.append("\n - " + book);
            if (book != books[books.length - 1]){
                message.append(", ");
            } else {
                message.append(". ");
            }
        }

        JOptionPane.showMessageDialog(null, "EMPLOYEE READING!\n" + message.toString());
    }

    @Override
    public void stayUpdated(String[] breakingNews) {
        StringBuilder message = new StringBuilder();
        message.append(getName() + ", it's time to get updated!");
        message.append("Breaking News for reading: ");

        for (String breakingNew: breakingNews) {
            message.append("\n * " + breakingNew);
            if (breakingNew != breakingNews[breakingNews.length -1 ]){
                message.append(", ");
            } else {
                message.append(". ");
            }
        }

        JOptionPane.showMessageDialog(null, "EMPLOYEE STAYING UPDATED!\n" + message.toString());
    }

    @Override
    public void relax() {
        JOptionPane.showMessageDialog(null, "EMPLOYEE TAKING A BREAK!\n" +  getName() + ", sometimes taking a break it's ok!");
    }

    @Override
    public void sayHello() {
        JOptionPane.showMessageDialog(null, "EMPLOYEE SAYING HELLO!\n" +  "Hello, world! I am " + getName() + ", I am a self-taught software developer!");
    }

    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "JOptionPane.showMessageDialog(null, \"STUDENT STUDYING!\"); SPEAKING!\n" +  "Well, currently I am a software engineer. \n" +
                "Also, I am learning about the English language, because I love it. ");
    }

    @Override
    public void sayThanks() {
        JOptionPane.showMessageDialog(null, "EMPLOYEE SAYING THANKS!\n" + "I sincerely appreciate your response and value the time you have taken to listening to me.");
    }

    @Override
    public void sayBye() {
        JOptionPane.showMessageDialog(null, "EMPLOYEE SAYING BYE!\n" + "I hope see you again!");
    }

    // Own Methods
    public void work() {
        JOptionPane.showMessageDialog(null, "EMPLOYEE WORKING!");
    }

    public void attendingMeeting() {
        JOptionPane.showMessageDialog(null, "EMPLOYEE ATTENDING A MEETING!");
    }

}