package javaSubroutines.theory.overload;

import javax.swing.*;

public class FunctionsOverload {
    public static void main(String[] args) {
        var length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the rectangle"));
        var width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the rectangle"));

        var intArea = rectangleArea(length, width);
        var floatArea = rectangleArea(24.1f, 16.4f);

        JOptionPane.showMessageDialog(null, "Integer Area: " + intArea + "\nFloat Area: " + floatArea);
    }

    public static float rectangleArea(float length, float width){
        return length * width;
    }

    public static int rectangleArea(int length, int width){
        return length * width;
    }
}
