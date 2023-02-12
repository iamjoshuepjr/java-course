package javaFundamentals.fundamentals.dataTypes.conventions;

public class TypesConversions {
    public static void main(String[] args) {
        System.out.println("\n\tTypes Conversion");
        // Casting String to int using .parseInt() method
        System.out.println("+------------------------+");
        var age = Integer.parseInt("24");
        System.out.println("String -> Initial Age: " + age);
        System.out.println("Int -> New Age: " + (age + 1));
        System.out.println();

        // No casting string to int
        System.out.println("+------------------------+");
        var ageString = "24";
        System.out.println("Initial Age: " + ageString);
        System.out.println("New Age: " + (ageString + 1));

        // Casting String to double using .parseDouble() method
        System.out.println("+------------------------+");
        var salary = Double.parseDouble("98000.0");
        System.out.println("Initial Salary: " +salary);
        System.out.println("New Salary: " + (salary + 1));
        System.out.println("+------------------------+");

        // Casting int to String using .valueOf() method
        ageString = String.valueOf(24);
        System.out.println("Age String: " +ageString);
        ageString+=1;
        System.out.println("Age String: " +ageString);
    }
}
