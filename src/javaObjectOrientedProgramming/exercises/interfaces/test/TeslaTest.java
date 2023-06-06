package javaObjectOrientedProgramming.exercises.interfaces.test;

import javaObjectOrientedProgramming.exercises.interfaces.classes.tesla.abstracts.Car;
import javaObjectOrientedProgramming.exercises.interfaces.classes.tesla.*;

// Controller Class
public class TeslaTest {
    public static void main(String[] args) {
        // Instantiating a new Tesla model S
        ModelS modelS = new ModelS("987654321");
        modelS.start();
        modelS.charge();
        modelS.engageAutopilot();
        modelS.disengageAutopilot();
        modelS.stop();

        // Instantiating a new Tesla model 3
        Model3 model3 = new Model3("123456789");
        model3.start();
        model3.charge();
        model3.engageAutopilot();
        model3.disengageAutopilot();
        model3.stop();
    }
}
