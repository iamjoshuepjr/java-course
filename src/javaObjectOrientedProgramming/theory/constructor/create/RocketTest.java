package javaObjectOrientedProgramming.theory.constructor.create;

import javaObjectOrientedProgramming.theory.constructor.create.Rocket;

public class RocketTest {
    public static void main(String[] args) {
        // Instantiating a Rocket object by passing its arguments to the constructor
        Rocket rocket = new Rocket("Falcon 9", 549054, 27000);
        rocket.displayInfo();
        rocket.velocity = 822222;
        rocket.displayInfo();
    }
}
