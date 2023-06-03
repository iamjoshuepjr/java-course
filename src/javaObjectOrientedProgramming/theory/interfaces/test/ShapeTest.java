package javaObjectOrientedProgramming.theory.interfaces.test;

import javaObjectOrientedProgramming.theory.interfaces.classes.shape.Circle;
import javaObjectOrientedProgramming.theory.interfaces.classes.shape.Square;
import javaObjectOrientedProgramming.theory.interfaces.classes.shape.Triangle;

import javax.swing.*;

// Controller Class
public class ShapeTest {
    public static void main(String[] args) {

        Circle circle = new Circle(4.5f);
        circle.draw();
        JOptionPane.showMessageDialog(null, "Circle Area: " + circle.calculateArea());
        JOptionPane.showMessageDialog(null, "Circle Perimeter: " + circle.calculatePerimeter());
        circle.rotate(4.5f);

        Triangle triangle = new Triangle(24.3f, 24.3f, 20.4f);
        triangle.draw();
        JOptionPane.showMessageDialog(null, "Triangle Area: " + triangle.calculateArea());
        JOptionPane.showMessageDialog(null, "Triangle Perimeter: " + triangle.calculatePerimeter());
        triangle.rotate(5.5f);

        Square square = new Square(24.7f);
        square.draw();
        JOptionPane.showMessageDialog(null, "Square Area: " + square.calculateArea());
        JOptionPane.showMessageDialog(null, "Square Perimeter: " + square.calculatePerimeter());
        square.rotate(2.4f);
    }
}