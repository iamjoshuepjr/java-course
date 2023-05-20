package javaObjectOrientedProgramming.exercises.test;
import javaObjectOrientedProgramming.exercises.classes.Athlete;

import javax.swing.JOptionPane;

// Controller Class
public class AthleteTest {
    public static int winner(Athlete[] athletes){
        float time;
        int index = 0;

        time = athletes[0].getTime();

        for (int i = 1; i < athletes.length; i++) {
            if (athletes[i].getTime() < time){
                time = athletes[i].getTime();
                index = i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int numberOfAthlete = Integer.parseInt(JOptionPane.showInputDialog("How many athletes do you want store? "));

        // Creating an Athlete array
        Athlete[] athletes = new Athlete[numberOfAthlete];

        // Asking each Athlete's attribute
        for (int i = 0; i < athletes.length; i++) {

            JOptionPane.showMessageDialog(null, "Enter the data for the Athlete ["+(i+1)+"]");
            int dorsal = Integer.parseInt(JOptionPane.showInputDialog("Enter the dorsal"));
            String name = JOptionPane.showInputDialog("Enter the Athlete's name");
            float time = Float.parseFloat(JOptionPane.showInputDialog("Enter the Athlete's time"));

            // Instantiating each Athlete object
            athletes[i] = new Athlete(dorsal, name, time);

            // Displaying information about each Athlete object
            JOptionPane.showMessageDialog(null, "Athlete Information " +
                    athletes[i].information());
        }

        int indexWinner = winner(athletes);
        JOptionPane.showMessageDialog(null, "Winner" +
                athletes[indexWinner].information()
        );
    }
}