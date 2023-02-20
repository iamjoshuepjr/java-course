package javaFundamentals.arrays.oneDimensional.theory;

import javax.swing.JOptionPane;

public class FillingArray {
    public static void main(String[] args) {
        // asking for elements
        var elements = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want: "));

        // creating array
        float[] salaries = new float[elements];

        // filling array with for loop
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter the ("+(i+1)+") salary: "));
        }

        // displaying array with for-each loop
        for (float salary: salaries) {
            System.out.println("Salary: $" +salary);
        }
    }
}
