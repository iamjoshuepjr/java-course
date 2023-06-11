package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts.Person;
import javax.swing.JOptionPane;

public class Teacher extends Person {
    // Attributes
    private String[] subjects; // You can add an object like attribute
    private String[] emails;

    // Teacher Constructor
    public Teacher(String name, byte age, String gender, String[] subjects, String[] emails) {
        // Person Constructor
        super(name, age, gender);
        this.subjects = subjects;
        this.emails = emails;
    }

    // getters
    public String[] getSubjects() {
        return subjects;
    }

    public String[] getEmails() {
        return emails;
    }

    // Inherited Methods
    @Override
    public void wakeUp() {
        JOptionPane.showMessageDialog(null, "TEACHER WAKING UP!\n" +  getName() + ", it's time to get up!");
    }

    @Override
    public void read(String[] books) {
        StringBuilder message = new StringBuilder();
        message.append(getName() + ", it's time to read!\n");
        message.append("Books to read: ");
        for (String book : books) {
            message.append(book);
            if (book != books[books.length - 1]) {
                message.append(", ");
            } else {
                message.append(".");
            }
        }

        JOptionPane.showMessageDialog(null, "TEACHER READING\n" + message.toString());
    }

    @Override
    public void stayUpdated(String[] breakingNews) {
        StringBuilder message = new StringBuilder();
        message.append(getName() + " it's time to read! ");
        message.append("Breaking News for reading:");
        for (String breakingNew:breakingNews) {
            message.append("\n * " + breakingNew);
            if (breakingNew != breakingNews[breakingNews.length - 1]){
                message.append(", ");
            } else {
                message.append(". ");
            }
        }

        JOptionPane.showMessageDialog(null, "TEACHER STAYING UPDATED\n" + message.toString());
    }

    @Override
    public void relax() {
        JOptionPane.showMessageDialog(null, "TEACHER TAKING A BREAK!\n" +  getName() + ", sometimes taking a break it's ok!");
    }

    @Override
    public void sayHello() {
        JOptionPane.showMessageDialog(null, "TEACHER SAYING HELLO!\n" +  "Hello, world! I am " + getName() + ", I am a self-taught software developer student, and teaching how to code on my social medias!");
    }

    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "TEACHER SPEAKING!\n" +  "Well, currently I am studying to become a software engineer. Also, I want to teach how to code!\n" +
                "In addition, I am learning about the English language, because I love it. ");
    }

    @Override
    public void sayThanks() {
        JOptionPane.showMessageDialog(null, "TEACHER SAYING THANKS!\n" + "I sincerely appreciate your response and value the time you have taken to listening to me.");
    }

    @Override
    public void sayBye() {
        JOptionPane.showMessageDialog(null, "TEACHER SAYING BYE!\n" + "I hope see you again!");
    }

    // Own methods
    public void teach() {
        JOptionPane.showMessageDialog(null, "TEACHER TEACHING!\n" + "I hope you can understand about how to code with Java!");
    }

    public void gradePapers() {
        JOptionPane.showMessageDialog(null, "TEACHER TEACHING!\n" + "I hope you can get good grades!");
    }
}