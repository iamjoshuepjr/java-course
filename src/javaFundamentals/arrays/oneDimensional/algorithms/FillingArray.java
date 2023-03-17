package javaFundamentals.arrays.oneDimensional.algorithms;

import javax.swing.JOptionPane;

public class FillingArray {
    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to Programming Academy!");

        // creating arrays
        byte index = 15;
        short[] codes = new short[index];
        String[] names = new String[index];

        // asking for the numbers of elements to enter
        var elements = Byte.parseByte(JOptionPane.showInputDialog("How many elements (students and their codes) do you want to enter? (2 - 15)"));

        // validation
        if((elements < 0) || (elements > 15)){
            JOptionPane.showMessageDialog(null,
                    "WARNING!" +
                            "\nTHE NUMBER OF ELEMENTS AND THE INDEX SUPPORTED BY THE ARRAY DO NOT MATCH!" +
                            "\nNUMBER OF ELEMENTS YOU WANT ENTER ["+elements+"]" +
                            "\nINDEX SUPPORTED BY ARRAY ["+index+"]");
        }
        else {
            // saving elements on the array
            for (byte i = 0; i < elements; i++) {
                codes[i] = Short.parseShort(JOptionPane.showInputDialog("Student ["+(i+1)+"] code"));
                names[i] = JOptionPane.showInputDialog("Student ["+(i+1)+"] name");
            }

            // displaying elements from the array
            System.out.println("+-------------------+");
            for (byte i = 0; i < elements ; i++) {
                System.out.println("-  Student ["+(i+1)+"]  -");
                System.out.println("+-------------------+");
                System.out.println("- Code ["+(codes[i])+"]  -");
                System.out.println("- Name ["+(names[i])+"]  -");
                System.out.println("+-------------------+");
            }
        }
    }
}
