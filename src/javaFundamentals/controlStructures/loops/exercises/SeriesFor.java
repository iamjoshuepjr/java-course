package javaFundamentals.controlStructures.loops.exercises;

public class SeriesFor {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            if(i < 10){
                System.out.print(i + ",");
            }else {
                System.out.print(i);
            }
        }
    }
}
