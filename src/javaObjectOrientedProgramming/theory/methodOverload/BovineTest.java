package javaObjectOrientedProgramming.theory.methodOverload;

// Class Controller
public class BovineTest {
    public static void main(String[] args) {

        // Instantiating Bovine object
        Bovine bovine = new Bovine("Holstein", 3, 1200.5f);
        Bovine bovine2 = new Bovine("Jersey", 2, 800.3f);

        // Accessing Bovine Object methods
        bovine.displayInfo();
        bovine.eat();
        bovine.displayInfo();
        bovine.eat("grass");
        bovine.displayInfo();

        bovine2.displayInfo();
        bovine2.eat();
        bovine2.displayInfo();
        bovine2.eat("grass");
        bovine2.displayInfo();
    }
}