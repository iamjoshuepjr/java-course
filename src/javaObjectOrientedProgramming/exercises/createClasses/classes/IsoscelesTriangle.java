package javaObjectOrientedProgramming.exercises.createClasses.classes;

/**
 * Design a program to work with isosceles triangles.
 * To do this, define the necessary attributes required,
 * provide accessor methods, a constructor method,
 * and implement methods to calculate the perimeter and area of a triangle.
 * Additionally, implement a method that, given an array of triangles,
 * returns the area of the triangle with the largest surface.
 */

// Object Class
public class IsoscelesTriangle {

    // Attributes
    private float base;
    private float side;

    // Constructor
    public IsoscelesTriangle(float base, float side){
        this.base = base;
        this.side = side;
    }

    // Setter and Getters
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    // Perimeter
    public float perimeter(){
        return 2 * base + side;
    }

    public float area(){
        return (float) (base * Math.sqrt((side * side) - ((base * base)/4)))/2;
    }
}