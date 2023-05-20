package javaObjectOrientedProgramming.exercises.classes;

/**
 * Build a program for an athletics competition.
 * The program should manage a series of athletes characterized by:
 *
 * Athlete number
 * Name
 * Time
 * At the end, the program should display the data of the winning athlete.
 *
 */

// Object Class
public class Athlete {

    // Attributes
    private int dorsal;
    private String name;
    private float time;

    // Constructor
    public Athlete(int dorsal, String name, float time){
        this.dorsal = dorsal;
        this.name = name;
        this.time = time;
    }

    public float getTime(){
        return time;
    }

    public String information(){
        return  "\nDorsal: " + dorsal +
                "\nName: " + name +
                "\nTime: " + time;
    }
}