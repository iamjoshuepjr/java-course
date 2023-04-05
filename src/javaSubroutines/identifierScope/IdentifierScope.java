package javaSubroutines.identifierScope;

public class IdentifierScope {
    /**
     * In java an identifier scope refers to the portion of the program
     * where an identifier (such as a variable, method, or class name) can be accessed.
     * The scope of an identifier is determined by its visibility, which is specified
     * by the access modifiers: 'public', 'protected', 'private' or no modifier.
     */

    /**
     * Class-level variables and methods (those declared outside any method)
     * have a scope that extends to the end of the class definition.
     * These variables and methods can be accessed from any method within the class,
     * regardless of access modifiers.
     */
    private static byte classVariable = 24;

    public static void main(String[] args) {
        byte parameter = 3;
        method1(parameter);
        method2();
    }

    /**
     * Method parameters (variables declared in the method signature)
     * have a scope that extends from their declaration to the end of the method.
     * Method parameters can only be accessed from within the method they are declared in.
     */
    public static void method1(byte parameter){
        /**
         * Local variables (those declared inside a method)
         * have a scope that extends from their declaration to the end of the block they are declared in.
         * Local variables can only be accessed from within the block they are declared in.
         * If a local variable has the same name as a class-level variable or method parameter,
         * the local variable takes precedence within the scope of the block it is declared in.
         */
        byte localVariable = 15;
        System.out.println("Class Variable in method1(): " + (classVariable + 3)); // accessible from any method
        System.out.println("Parameter: " + parameter); // accessible only within method1()
        System.out.println("Local Variable: " + localVariable); // accessible only within method1()

    }

    public static void method2(){
        // classVariable is still accessible from method2()
        System.out.println("Class Variable in method2(): " + classVariable);
    }
}
