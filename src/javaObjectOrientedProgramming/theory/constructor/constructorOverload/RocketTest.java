package javaObjectOrientedProgramming.theory.constructor.constructorOverload;

import javax.swing.JOptionPane;

public class RocketTest {
    public static void main(String[] args) {

        // Instantiating Rocket object by passing all its parameter
        Rocket rocket = new Rocket("Falcon 9", 549054, 27000);

        JOptionPane.showMessageDialog(null, "Rocket 1" +
                "\nName: " + rocket.name +
                "\nMass: " + rocket.mass + "Kg" +
                "\nVelocity: " +rocket.velocity + "Km/h");

        // Instantiating Rocket object by passing name and mass parameter
        Rocket rocket2 = new Rocket("Saturn V", 549054);

        JOptionPane.showMessageDialog(null, "Rocket 2" +
                "\nName: " + rocket2.name +
                "\nMass: " + rocket2.mass + "Kg" +
                "\nVelocity: " +rocket2.velocity + "Km/h");

        // Instantiating Rocket object by just passing the name as parameter
        Rocket rocket3 = new Rocket("Atlas");

        JOptionPane.showMessageDialog(null, "Rocket 3" +
                "\nName: " + rocket3.name +
                "\nMass: " + rocket3.mass + "Kg" +
                "\nVelocity: " +rocket3.velocity + "Km/h");
    }
}
