package javaEnumRecords.enums;

/**
 * An Enum is a special class that represents a group of constants.
 * To create an enum, use the enum keyword, and separate the constants with a comma.
 */

public class Enums {
    public static enum Days {
        SUNDAY, // 0
        MONDAY, // 1
        TUESDAY, // 2
        WEDNESDAY, // 3
        THURSDAY, // 4
        FRIDAY, // 5
        SATURDAY // 6
    }

    public static void main(String[] args) {
        Days day = Days.SUNDAY;
        Days day2 = Days.valueOf("TUESDAY");
        Days[] array = Days.values();

        System.out.println("Enum Name name(): " + day.name());
        System.out.println("Enum Name toString(): " + day.toString());
        System.out.println("Ordinal position: [" + day.ordinal() + "]");
        System.out.println("Value of: " + day2);
        System.out.println("All Enum Values -> values(): ");
        for (Days d: array) {
            System.out.println(d);
        }

        Days saturday = Days.SATURDAY;
        System.out.println("Before call assignDay(): " +saturday);
        assignDay(1, saturday);
        System.out.println("After call assignDay(): " +saturday);
    }

    public static void assignDay(int i, Days day){
        if ((i >= 0) && (i < Days.values().length)) {
            day = Days.values()[i];
        } else {
            day = Days.SUNDAY;
        }
    }
}
