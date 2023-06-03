package javaObjectOrientedProgramming.theory.interfaces.classes.shape;


import javaObjectOrientedProgramming.theory.interfaces.classes.shape.interfaces.*;
import javax.swing.JOptionPane;

// Subclass
// Object Class
public class Square implements IShape, IDrawable, IRotatable {
    // Attributes
    float side;

    // Constructor
    public Square(float side){
        this.side = side;
    }

    @Override
    public float calculateArea() {
        return side * side;
    }

    @Override
    public float calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        JOptionPane.showMessageDialog(null, "Drawing a Square!");
    }

    @Override
    public void rotate(float angle) {
        JOptionPane.showMessageDialog(null, "Rotating Square " + angle + "°");
    }
}