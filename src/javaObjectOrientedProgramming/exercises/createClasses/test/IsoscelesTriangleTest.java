package javaObjectOrientedProgramming.exercises.createClasses.test;
import javaObjectOrientedProgramming.exercises.createClasses.classes.IsoscelesTriangle;

import javax.swing.JOptionPane;

// Class Controller
public class IsoscelesTriangleTest {
    public static float areaLargestSurface(IsoscelesTriangle[] triangles){
        float largestArea;

        largestArea = triangles[0].area();
        for (int i = 1; i <triangles.length; i++) {
            if(triangles[i].area() > largestArea){
                largestArea = triangles[i].area();
            }
        }

        return largestArea;
    }

    public static void main(String[] args) {
        float base, side;
        byte triangle;

        triangle = Byte.parseByte(JOptionPane.showInputDialog("Please, enter the number of triangles you want to handle."));

        // Creating a triangle array
        IsoscelesTriangle triangles[] = new IsoscelesTriangle[triangle];

        for (int i = 0; i < triangles.length; i++) {
            JOptionPane.showMessageDialog(null, "Enter the attributes of the triangle " +(i+1));
            base = Float.parseFloat(JOptionPane.showInputDialog("Enter the triangle's base"));
            side = Float.parseFloat(JOptionPane.showInputDialog("Enter the triangle's side"));

            // Instantiating each triangle
            triangles[i] = new IsoscelesTriangle(base, side);

            // Displaying area and perimeter
            JOptionPane.showMessageDialog(null, "Area and Perimeter" +
                    "\nArea: " +triangles[i].area() +
                    "\nPerimeter: " +triangles[i].perimeter());
        }

        JOptionPane.showMessageDialog(null, "Area Largest Surface" +
                "\nArea: " +areaLargestSurface(triangles));
    }
}