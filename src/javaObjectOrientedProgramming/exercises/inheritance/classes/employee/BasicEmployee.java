package javaObjectOrientedProgramming.exercises.inheritance.classes.employee;

// Subclass
// Object Class
public class BasicEmployee extends Employee{
    // Attributes
    private int hoursWorked;
    private float hourlyRate;

    // Construcor
    public BasicEmployee(int employeeId, String name, int hoursWorked, float hourlyRate){
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
