package javaSubroutines.funtions;
import javax.swing.JOptionPane;

public class Functions {
    /**
     * Functions, on other hand, are subroutines that do return a value.
     * They are typically used for performing some calculation or operation and
     * returning the result.
     */

    public static void main(String[] args) {
        var length = Float.parseFloat(JOptionPane.showInputDialog("Enter the length of the rectangle"));
        var width = Float.parseFloat(JOptionPane.showInputDialog("Enter the width of the rectangle"));
        var area = rectangleArea(length, width);
        JOptionPane.showMessageDialog(null, "The Area of the Rectangle is: " + area);
        JOptionPane.showMessageDialog(null, "The Perimeter of the Rectangle is: " + rectanglePerimeter(length, width));
    }

    public static float rectangleArea(float length, float width){
        return length * width;
    }

    public static float rectanglePerimeter(float length, float width){
        return (length * 2) + (width * 2);
    }
}