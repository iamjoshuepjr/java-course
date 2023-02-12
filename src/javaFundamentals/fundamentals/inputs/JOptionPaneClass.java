package javaFundamentals.fundamentals.inputs;
import javax.swing.JOptionPane;

public class JOptionPaneClass {
    public static void main(String[] args) {
        String name;
        byte age;
        char letter;
        float salary;

        name = JOptionPane.showInputDialog("Enter your name: ");

        age = Byte.parseByte(JOptionPane.showInputDialog("Enter your age: "));
        letter = JOptionPane.showInputDialog("Enter a letter: ").charAt(0);
        salary = Float.parseFloat(JOptionPane.showInputDialog("Enter your salary: "));

        JOptionPane.showMessageDialog(null, "Name: "+name);
        JOptionPane.showMessageDialog(null, "Age: "+age);
        JOptionPane.showMessageDialog(null, "Letter: "+letter);
        JOptionPane.showMessageDialog(null, "Salary: "+salary);
    }
}
