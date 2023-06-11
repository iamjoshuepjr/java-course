package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts.Person;
import javax.swing.JOptionPane;


public class Student extends Person {
    // Attributes
    private String degree;  // You can add an object
    private String[] courses; // You can add an object

    // Student Constructor
    public Student(String name, byte age, String gender, String degree, String[] courses) {
        // Person Constructor
        super(name, age, gender);
        this.degree = degree;
        this.courses = courses;
    }

    // getters
    public String getDegree() {
        return degree;
    }

    public String[] getCourses() {
        return courses;
    }

    // Inherited Methods
    @Override
    public void wakeUp() {
        JOptionPane.showMessageDialog(null, "STUDENT WAKING UP!\n" +  getName() + ", it's time to get up!");
    }

    @Override
    public void read(String[] books) {
        StringBuilder message = new StringBuilder();
        message.append(getName() + ", it's time to read!\n");
        message.append("Books to read: ");
        for (String book : books) {
            message.append("\n +" + book);
            if (book != books[books.length - 1]) {
                message.append(", ");
            } else {
                message.append(".");
            }
        }

        JOptionPane.showMessageDialog(null, "STUDENT READING\n" + message.toString());
    }

    @Override
    public void stayUpdated(String[] breakingNews) {
        StringBuilder message = new StringBuilder();
        message.append(getName() + " it's time to read! ");
        message.append("Breaking News for reading:");
        for (String breakingNew:breakingNews) {
            message.append("\n - " + breakingNew);
            if (breakingNew != breakingNews[breakingNews.length - 1]){
                message.append(", ");
            } else {
                message.append(". ");
            }
        }

        JOptionPane.showMessageDialog(null, "STUDENT STAYING UPDATED\n" + message.toString());
    }

    @Override
    public void relax() {
        JOptionPane.showMessageDialog(null, "STUDENT TAKING A BREAK!\n" +  getName() + ", sometimes taking a break it's ok!");
    }

    @Override
    public void sayHello() {
        JOptionPane.showMessageDialog(null, "STUDENT SAYING HELLO!\n" +  "Hello, world! I am " + getName() + ", I am a self-taught software developer student!");
    }

    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "STUDENT SPEAKING!\n" +  "Well, currently I am studying to become a software engineer. \n" +
                "Also, I am learning about the English language, because I love it. ");
    }

    @Override
    public void sayThanks() {
        JOptionPane.showMessageDialog(null, "STUDENT SAYING THANKS!\n" + "I sincerely appreciate your response and value the time you have taken to listening to me.");
    }

    @Override
    public void sayBye() {
        JOptionPane.showMessageDialog(null, "STUDENT SAYING BYE!\n" + "I hope see you again!");
    }

    // Own methods
    public void study() {
        JOptionPane.showMessageDialog(null, "STUDENT STUDYING!");
    }

    public void submitAssignment() {
        JOptionPane.showMessageDialog(null, "STUDENT SUBMITTING ASSIGNMENT!");
    }
}