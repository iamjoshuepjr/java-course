package javaObjectOrientedProgramming.theory.methodOverload;

public class BovineTest {
    public static void main(String[] args) {
        Bovine bovine = new Bovine("Holstein", 3, 1200.5f);

        bovine.displayInfo();
        bovine.eat();
        bovine.displayInfo();
        bovine.eat("grass");
        bovine.displayInfo();
    }
}