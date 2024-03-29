package javaObjectOrientedProgramming.theory.interfaces.classes.shape;

import javaObjectOrientedProgramming.theory.interfaces.classes.shape.interfaces.*;
import javax.swing.JOptionPane;

// Subclass
// Object Class
public class Circle implements IShape, IDrawable, IRotatable {
    // Attributes
    private float radius;

    // Constructor
    public Circle(float radius){
        this.radius = radius;
    }

    // Getter
    public float getRadius() {
        return radius;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * getRadius());
    }

    @Override
    public void draw() {
        JOptionPane.showMessageDialog(null, "Drawing a Circle!");
    }

    @Override
    public void rotate(float angle) {
        JOptionPane.showMessageDialog(null, "Rotating Circle " + angle + "°");
    }
}