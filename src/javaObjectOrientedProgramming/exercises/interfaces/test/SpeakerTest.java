package javaObjectOrientedProgramming.exercises.interfaces.test;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.*;

import javax.swing.*;
import java.util.Date;

// Class Controller
public class SpeakerTest {
    public static void main(String[] args) {
        // Creating Student Objects
        String[] courses = {"English", "Music", "Soccer", "Driving"};
        String[] studentBooks = {"Effective Java", "Head First Java", "Clean Code", "Java Concurrency", "Spring in action"};

        String[] funnyJavaFictionalBreakingNews = {
                "Java Developers Declare War on Coffee Shortages, Demand Unlimited Caffeine Supply",
                "Java Programmers Discover Secret 'Easter Egg': Code That Writes Itself",
                "Java Guru Discovers Ultimate Debugging Technique: Staring Intensely at the Screen Until Code Fixes Itself"
        };

        Student student1 = new Student("Joshuép Jr.", (byte) 24, "Male", "Computer Science", courses);
        student1.wakeUp();
        student1.sayHello();
        student1.read(studentBooks);
        student1.stayUpdated(funnyJavaFictionalBreakingNews);
        student1.study();
        student1.speak();
        student1.submitAssignment();
        student1.sayThanks();
        student1.sayBye();
        student1.relax();

        // Creating Teacher Objects
        String[] subjects = {"Mathematics", "Physics", "Computer Science"};
        String[] emails = {"sarah.davis@example.com", "sdavis@example.com"};
        String[] teacherBooks = {
                "The Art of Engaging Minds: Strategies for Dynamic Classroom Discussions",
                "Teaching Techniques for the Modern Learner: Adapting to the Digital Age",
                "Inspiring Curiosity: Fostering a Love for Learning in Students",
                "Educational Psychology: Understanding the Mind of the Learner",
                "Building Effective Lesson Plans: A Practical Guide for Teachers",
        };

        String[] funnyTeacherFictionalBreakingNews = {
                "Teachers Invent 'Math Magic' Spell, Make Algebra Disappear!",
                "Study Reveals Teachers Master 'Ninja-Level Patience' Technique for Dealing with Class Clowns",
                "Teachers Introduce Revolutionary 'Homework-Eating' Robot to Save Students from Late-Night Assignments",
                "Incident: Entire School Staff Breaks Out into Spontaneous Dance Flash Mob During Assembly",
                "Teachers Develop 'Telepathic Grading' Method, Instantly Know What Students Are Thinking"
        };

        Teacher teacher = new Teacher("Sarah Davis", (byte) 28, "Female", subjects, emails);
        teacher.wakeUp();
        teacher.sayHello();
        teacher.read(teacherBooks);
        teacher.stayUpdated(funnyTeacherFictionalBreakingNews);
        teacher.sayThanks();
        teacher.sayBye();

        // Creating Employee Objects
        String[] employeeBooks = {
                "The Pragmatic Programmer: Your Journey to Mastery by Andrew Hunt and David Thomas",
                "Clean Code: A Handbook of Agile Software Craftsmanship by Robert C. Martin",
                "Code Complete: A Practical Handbook of Software Construction by Steve McConnell",
                "The Mythical Man-Month: Essays on Software Engineering by Frederick P. Brooks Jr.",
                "Cracking the Coding Interview: 189 Programming Questions and Solutions by Gayle Laakmann McDowell"
        };

        String[] funnyEngineersFictionalBreakingNews = {
                "Breaking News: Local Software Engineer Discovers Coffee as the Ultimate Source Code Fuel!",
                "Exclusive: Programmer Successfully Solves Coding Problem in Dream, Forgets Solution Upon Waking Up!",
                "Breaking: Software Engineer Accidentally Deletes Internet, Panic Ensues Worldwide!",
                "Hilarious Incident: Developer Writes Entire Codebase in 'Emoji' Language, Colleagues Completely Confused!",
                "Breaking News: Software Engineer Claims to Have Discovered 'Bug Whispering' Technique, Debugs Programs by Whispering Encouraging Words!",
        };

        Employee employee = new Employee("Emily Johnson", (byte) 25, "Female", "Engineering", "Software Engineer");
        employee.wakeUp();
        employee.sayHello();
        employee.read(employeeBooks);
        employee.stayUpdated(funnyEngineersFictionalBreakingNews);
        employee.work();
        employee.attendingMeeting();
        employee.speak();
        employee.sayThanks();
        employee.sayBye();
        employee.relax();

        // Creating Alexa Objects
        Alexa alexa = new Alexa("Alexa", "English", 3.2f, "Palo Alto");
        alexa.activate();
        alexa.sayHello();
        alexa.speak();
        String song = JOptionPane.showInputDialog("Enter the song you want to play");
        alexa.playMusic(song);
        String device = JOptionPane.showInputDialog("What device do you want to control?");
        String action = JOptionPane.showInputDialog("What action do you want to perform?");
        alexa.controlSmartHomeDevice(device, action);
        alexa.sayBye();
        alexa.deactivate();

        // Creating Google Assistant objects
        String name = "Google Assistant";
        String language = "English";
        float version = 3.5f;
        String location = "United States";

        GoogleAssistant googleAssistant = new GoogleAssistant(name, language, version, location);
        googleAssistant.activate();
        googleAssistant.sayHello();
        googleAssistant.speak();

        String[] programmingPodcasts = {
                "Syntax - Tasty Web Development Treats",
                "CodeNewbie - Stories from People on their Coding Journey",
                "Software Engineering Daily - Daily Conversations about Software Engineering",
                "Developer Tea - Short, Practical Web Development Wisdom",
                "The ChangeLog - Open Source moves fast. Keep up."
        };

        googleAssistant.playPodcast(programmingPodcasts);

        // Create a Date object for the meeting time
        Date meetingTime = new Date(); // Instantiate with the current date and time

        // Call the scheduleMeeting method with participants, location, and the Date object
        String[] participants = {"John", "Mary"};
        String meetingLocation = "Conference Room";
        googleAssistant.scheduleMeeting(participants, meetingLocation, meetingTime);

        googleAssistant.sayBye();
        googleAssistant.deactivate();

        // Siri Objects
        Siri siri = new Siri("Siri", "English", 3.4f, "Location");
        siri.activate();
        siri.sayHello();
        siri.speak();
        siri.getWeatherForecast("California");
        siri.makePhoneCall("502-123-4567");
        siri.sayBye();
        siri.deactivate();
    }
}