package javaFundamentals.fundamentals.Calendar;

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AgeCalculator2 {
    public static void main(String[] args) {
        Calendar birthdate = new GregorianCalendar(2007,5,4);
        Calendar todayDate = Calendar.getInstance();
        int birthyear  = birthdate.get(Calendar.YEAR);
        int today = todayDate.get(Calendar.YEAR);
        int age = today - birthyear;

        JOptionPane.showMessageDialog(null, "The age is " + age + " years old!");
    }
}
