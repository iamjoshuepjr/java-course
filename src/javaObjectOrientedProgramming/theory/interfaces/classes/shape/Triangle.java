package javaObjectOrientedProgramming.theory.interfaces.classes.shape;

import javaObjectOrientedProgramming.theory.interfaces.classes.shape.interfaces.*;
import javax.swing.JOptionPane;

// Subclass
// Object Class
public class Triangle implements IShape, IDrawable, IRotatable {
    // Attributes
    private float side1;
    private float side2;
    private float side3;

    // Constructor
    public Triangle(float side1, float side2, float side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float calculateArea() {
        float semiPerimeter = (side1 + side2 + side3)/2;
        return (float) (Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)));
    }

    @Override
    public float calculatePerimeter() {
        return 0;
    }

    @Override
    public void draw() {
        JOptionPane.showMessageDialog(null, "Drawing a Triangle!");
    }

    @Override
    public void rotate(float angle) {
        JOptionPane.showMessageDialog(null, "Rotating Triangle " + angle + "°");
    }
}
