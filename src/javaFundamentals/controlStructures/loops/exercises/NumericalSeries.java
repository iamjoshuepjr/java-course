package javaFundamentals.controlStructures.loops.exercises;

public class NumericalSeries {
    public static void main(String[] args) {
        byte j = 99;

        for (int i = 1; i <= 5; i++) {
            if(i < 5){
                System.out.print(i + ",");
                System.out.print(j + ",");
            }else {
                System.out.print(i + ",");
                System.out.print(j);
            }
            j--;
        }
    }
}
