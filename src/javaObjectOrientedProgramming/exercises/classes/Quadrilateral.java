package javaObjectOrientedProgramming.exercises.classes;

public class Quadrilateral {
    // Attributes
    private float side1;
    private float side2;

    // Constructor
    public Quadrilateral(float side1, float side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public Quadrilateral(float side1){
        this.side1 = this.side2 = side1;
    }

    public float perimeter(){
        return 2 * (side1 + side2);
    }

    public float area(){
        return side1 * side2;
    }
}