package javaSubroutines.theory.parameters;

import javax.swing.JOptionPane;
import java.util.concurrent.atomic.AtomicInteger;

public class FunctionParameters {
    public static int x, y;
    public static AtomicInteger atom;

    public static void main(String[] args) {
        atom = new AtomicInteger(0);
        JOptionPane.showMessageDialog(null, "Atomic Integer Value: " + atom.get());

        x = 16;
        y = 24;

        if(rectangleArea(x, y, atom)){
            JOptionPane.showMessageDialog(null, "Atomic Integer Value: " + atom.get() +
                    "\nx value: " + x +
                    "\ny value: " + y);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect values!");
        }

    }

    public static boolean rectangleArea(int length, int width, AtomicInteger area){
        if((length > 0) && (width > 0)){
            area.set(length * width);
            return true;
        }
        area.set(0);
        return false;
    }
}
