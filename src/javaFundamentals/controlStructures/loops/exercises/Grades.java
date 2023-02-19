package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.*;

public class Grades {
    public static void main(String[] args) {
        byte passed = 0, noPassed = 0, conditioned = 0;
        float grade;

        for (int i = 1; i < 7; i++) {
            grade = Float.parseFloat(JOptionPane.showInputDialog("Grades\nEnter the grade ("+i+") here: "));

            if(grade >= 4){
                passed++;

            }else if (grade == 3 ){
                conditioned++;
            }else {
                noPassed++;
            }
        }
        JOptionPane.showMessageDialog(null, "Registration Summary" +
                "\nStudents Passed: "+passed +
                "\nStudents Conditioned: "+conditioned +
                "\nStudents No passed: "+ noPassed);
    }
}
