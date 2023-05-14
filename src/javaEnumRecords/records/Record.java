package javaEnumRecords.records;

import javax.swing.JOptionPane;
import java.util.concurrent.atomic.AtomicInteger;

public class Record {
    /**
     * Records in Java are features, introduced in Java 16, that allow you
     * to define a data class with a concise syntax.
     * Records can be used to define simple data classes that
     * only contain fields and no behavior.
     * Records can also implement methods, which can be used to
     * add behavior to the record.
     */
    public static record Person(StringBuilder name, StringBuilder surname, AtomicInteger age){

    }

    public static void main(String[] args) {
        Person person;

        JOptionPane.showMessageDialog(null, "Welcome to Records!");

        var name = JOptionPane.showInputDialog("Enter yor name, please.");
        var surname = JOptionPane.showInputDialog("It's ok, "+name+". Now enter yor surname, please.");
        var age = Byte.parseByte(JOptionPane.showInputDialog("Let me know how old are you? "));

        person = new Person(new StringBuilder(name), new StringBuilder(surname), new AtomicInteger(age));
        System.out.println(person.name + " " + person.surname + " " + person.age);

        /**
         * RECORDS PROS
         * Conciseness:
         *  Records have a simple syntax that allows you to define a class with a few lines of code.
         *  This can make your code more readable and reduce boilerplate.
         * Immutability:
         *  By default, records are immutable, meaning their values cannot be changed after initialization. This can make your code more reliable and easier to reason about.
         * Readability:
         *  Records have a clear structure that makes it easy to understand the data that they represent. This can make your code more maintainable.
         * Convenience:
         *  Records provide default implementations of methods such as equals(), hashCode(), and toString(), which can save you time and effort.
         * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         * RECORDS CONS
         * Limited flexibility:
         *  Records are designed to be used for data classes, and therefore have limitations when it comes to customizing them.
         *  For example, you cannot define custom constructors or instance variables, and methods must be implemented in the record header.
         * Compatibility:
         *  Since records are a new feature, not all libraries and tools may support them yet. This can make it difficult to integrate records into existing code-bases.
         * Not suitable for all use cases:
         *  Records are designed for simple data classes and may not be suitable for more complex classes that require more flexibility.
         */

        person.name.delete(0, person.name.length());
        person.name.append("Joshua");
        person.age.set(24);

        System.out.println(person.name + " " + person.surname + " " + person.age);
    }
}
