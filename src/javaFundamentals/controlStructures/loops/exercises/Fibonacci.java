package javaFundamentals.controlStructures.loops.exercises;

public class Fibonacci {
    public static void main(String[] args) {
        byte a = 0, b = 1, c = 0;
        for (byte i = 0; i < 10; i++) {
            if(i < 9){
                System.out.print(a + ",");
                c = (byte) (a + b);
                a = b;
                b = c;
            }
            else {
                System.out.println(a);
            }
        }

    }
}
