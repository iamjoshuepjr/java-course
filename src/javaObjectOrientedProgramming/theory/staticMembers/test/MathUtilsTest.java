package javaObjectOrientedProgramming.theory.staticMembers.test;
import javaObjectOrientedProgramming.theory.staticMembers.classes.MathUtils;

public class MathUtilsTest {
    public static void main(String[] args) {

        double radius = 60.7;

        // Accessing static methods via Class name
        double area = MathUtils.calculateCircleArea(radius);
    }
}