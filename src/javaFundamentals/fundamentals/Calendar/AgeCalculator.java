package javaFundamentals.fundamentals.Calendar;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1999, 1, 24);
        int age = Period.between(birthDate, today).getYears();
        System.out.println("You are " +age+ " years old!");
        System.out.println("BirthDate: " +birthDate);
        System.out.println("Today: " +today);
    }
}
