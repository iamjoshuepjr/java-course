package javaObjectOrientedProgramming.exercises.createClasses.classes;

/**
 * Create a class that allows calculating the salary of a worker based on their worked hours, knowing that all workers have the same hourly rate.
 * Create two workers and calculate their salaries. Then modify the hourly rate and recalculate the salaries of the two workers.
 */

// Object Class
public class Worker {

    // Instance attributes
    private String name;
    private float hourRate;

    // Constructor
    public Worker(String name, float hourRater){
        this.name = name;
        this.hourRate = hourRater;
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public float getHourRate(){
        return hourRate;
    }

    public void setHourRate(float hourRate){
        this.hourRate = hourRate;
    }

    public float salary(float hoursWorked){
        return hoursWorked * hourRate;
    }
}
