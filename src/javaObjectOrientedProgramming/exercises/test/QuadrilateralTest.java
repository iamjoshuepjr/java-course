package javaObjectOrientedProgramming.exercises.test;

import javaObjectOrientedProgramming.exercises.classes.Quadrilateral;

import javax.swing.*;

public class QuadrilateralTest {
    public static void main(String[] args) {
        Quadrilateral quadrilateral;
        float side1, side2;

        side1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first side: "));
        side2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second side: "));

        if(side1 == side2){
            quadrilateral = new Quadrilateral(side1);
        }
        else {
            quadrilateral = new Quadrilateral(side1, side2);
        }

        JOptionPane.showMessageDialog(null, "Quadrilateral" +
                "\nArea: " + quadrilateral.area() +
                "\nPerimeter: " +quadrilateral.perimeter());
    }
}