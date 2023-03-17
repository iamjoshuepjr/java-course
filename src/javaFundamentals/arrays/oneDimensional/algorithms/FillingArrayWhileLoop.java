package javaFundamentals.arrays.oneDimensional.algorithms;

import javax.swing.JOptionPane;

public class FillingArrayWhileLoop {
    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to Programming Academy!");
        JOptionPane.showMessageDialog(null, "Student Record!");

        // creating arrays
        byte index = 20;
        short[] codes = new short[index];
        String[] names = new String[index];

        // auxiliaries variables
        var continueInput = true;
        var answer = 'y';
        var students = 0;
        while (continueInput && students < index){
            codes[students] = Short.parseShort(JOptionPane.showInputDialog("Student ["+(students+1)+"] code"));
            names[students] = JOptionPane.showInputDialog("Student ["+(students+1)+"] name");
            answer = JOptionPane.showInputDialog("Do you want enter more Students? (Y/N)").charAt(0);
            continueInput = answer == 'Y' || answer == 'y';
            students++;
        }
        // validating the entered numbers of elements
        if (students >= index){
            JOptionPane.showMessageDialog(null,
                    "WARNING!" +
                            "\nYOU CANNOT ENTER MORE STUDENTS INTO THE ARRAY! " +
                            "THE NUMBER OF ELEMENTS CANNOT BE GREATER THAN THE INDEX SUPPORTED BY THE ARRAY." +
                            "\nNUMBER OF STUDENTS YOU ENTERED ["+students+"]" +
                            "\nINDEX SUPPORTED BY ARRAY ["+index+"]");
        }else {
            JOptionPane.showMessageDialog(null,
                    "["+students+"] STUDENTS SAVED SUCCESSFULLY!");

            System.out.println("+-------------------+");
            for (byte i = 0; i < students ; i++) {
                System.out.println("-  Student ["+(i+1)+"]  -");
                System.out.println("+-------------------+");
                System.out.println("- Code ["+(codes[i])+"]  -");
                System.out.println("- Name ["+(names[i])+"]  -");
                System.out.println("+-------------------+");
            }
        }
    }
}