package javaObjectOrientedProgramming.theory.staticMembers.classes;

public class MathUtils {
    // Static member (attribute)
    public static final double PI = 3.14159;

    // Static member (method)
    // Static methods just can access directly static attributes
    public static double calculateCircleArea(double radius){
        return PI * radius * radius;
    }
}
