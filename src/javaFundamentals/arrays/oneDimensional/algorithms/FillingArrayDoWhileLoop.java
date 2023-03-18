package javaFundamentals.arrays.oneDimensional.algorithms;

import javax.swing.JOptionPane;

public class FillingArrayDoWhileLoop {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Programming Academy!");
        JOptionPane.showMessageDialog(null, "Student Record!");

        // creating arrays
        byte index = 15;
        short[] codes = new short[index];
        String[] names = new String[index];

        // auxiliaries variables
        var answer = 'y';
        var students = 0;

        do {
            codes[students] = Short.parseShort(JOptionPane.showInputDialog("Student ["+(students+1)+"] code"));
            names[students] = JOptionPane.showInputDialog("Student ["+(students+1)+"] name");
            students++;
            if (students >= index){
                JOptionPane.showMessageDialog(null,
                        "WARNING!" +
                                "\nYOU CANNOT ENTER MORE STUDENTS INTO THE ARRAY! " +
                                "THE NUMBER OF ELEMENTS CANNOT BE GREATER THAN THE INDEX SUPPORTED BY THE ARRAY." +
                                "\nNUMBER OF STUDENTS YOU ENTERED ["+students+"]" +
                                "\nINDEX SUPPORTED BY ARRAY ["+index+"]");
                break;
            }
            answer = JOptionPane.showInputDialog("Do you want enter more Students? (Y/N)").charAt(0);
        }while (students < index && answer == 'y');

        if (students < index){
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