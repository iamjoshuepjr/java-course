package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class AgeHeightAverage {
    public static void main(String[] args) {
        /*
        * Given the ages and stature of 5 students calculate:
        *  1. Average age, average height.
        *  2. Number of adult students.
        *  3. Number of students measuring more than 1.75m
        * */

        float averageAge = 0, averageHeight = 0;
        int sumAge = 0, sumHeight = 0;
        byte adults = 0, measuring = 0;

        for (int i = 1; i < 6; i++) {
            var age = Byte.parseByte(JOptionPane.showInputDialog("Enter the age of the student number ("+i+") here: "));
            var height = Float.parseFloat(JOptionPane.showInputDialog("Enter the height of the student number ("+i+") here: "));

            sumAge += age;
            sumHeight += height;

            if(age >= 18){
                adults++;
            }

            if(height > 1.75){
                measuring++;
            }
        }
        averageAge = (float) sumAge / 5;
        averageHeight = (float) sumHeight / 5;
        JOptionPane.showMessageDialog(null, "Average Age:  "+averageAge +
                "\nAverage Height: "+averageHeight +
                "\nAdults students (over 18): "+adults +
                "\nMeasuring over 1.75m: "+measuring);
    }
}
