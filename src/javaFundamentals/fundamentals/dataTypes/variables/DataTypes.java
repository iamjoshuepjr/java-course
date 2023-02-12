package javaFundamentals.fundamentals.dataTypes.variables;

public class DataTypes {
    public static void main(String[] args) {
        /*
            ------------------------------------
                           Model
            ------------------------------------
            1 form: dataType identifier = value;
            2 form: dataType identifier;
                    identifier = valor;
            3 form: var identifier = value;

            ------------------------------------
                   invalid form using var
            ------------------------------------
            var identifier;
            identifier = value;
            ------------------------------------
        */

        // =================  INTEGERS DATA TYPES =================

        //  =================  BYTE DATA TYPE  =================
        // 1 byte (8 bits) capacity
        // maximum positive value ->  127
        byte hundreds = 127;
        // maximum negative value -> -128
        byte negativeHundreds = -128;

        // =================  SHORT DATA TYPE =================
        // 2 byte (16 bits) capacity
        // maximum positive value -> 32767
        short thousands = 32767;
        // maximum negative value -> -32768
        short negativeThousands = -32768;

        // ------------------- INT DATA TYPE -------------------
        // 4 byte (32 bits) capacity
        // maximum positive value -> 2147483647
        int billions = 2147483647;
        // maximum negative value -> -2147483648
        int negativeBillion = -2147483648;

        // ------------------- LONG DATA TYPE -------------------
        // 8 bytes (64 bits) capacity
        // maximum positive value -> 9223372036854775807L
        long billions_ext = 9223372036854775807L;
        // maximum negative value -> -9223372036854775808L
        long negativeBillions_ext = -9223372036854775808L;

        //  ------------------ Floating Data Types ------------------
        // float -> 4 bytes (32 bits)
        float floatF = 24.99f; // f indicates that it is a float decimal number

        // float -> 8 bytes (64 bits)
        double doubleD = 99.24d; // d indicates that it is a double decimal number

        // ------------------ Characters ------------------
        char character = 'j';
        // Just save a single value

        // ------------------ Booleans ------------------
        boolean $true = true;
        boolean $false = false;
        // Only holds true and false values; only one at a time

        // =================  USING VAR =================
        // Var allows us to declare variables
        // the compiler assigns the corresponding data type
        var age = 24;
        var country = "Colombia"; // The compiler assigns String as data type
        var height = 172.0; // Compiler assigns float

        // ------------ non-primitives data types ------------

        // ------------ Strings ------------
        String name = "Josué";
        String lastName = "Pimienta";
        String nickname = "Joshuép Jr.";

        // ------------ Class ------------

        Integer number = null;
        Long number2 = null;
        Float number3 = null;


        System.out.println("");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("-          Output Primitives data types - Java                   -");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("           Variable Byte Integer Type: " + hundreds);
        System.out.println("          Variable Short Integer Type: " + thousands);
        System.out.println("  Variable Integer (int) Integer Type: " + billions);
        System.out.println("           Variable Long Integer Type: " + billions_ext);
        System.out.println("                  Variable float Type: " + floatF);
        System.out.println("                 Variable double Type: " + doubleD);
        System.out.println("       Variable Character (char) Type: " + character);
        System.out.println("                Variable Boolean Type: " + $true);
        System.out.println("                Variable Boolean Type: " + $false);
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("-        Finish the output of primitives data on Java            -");
        System.out.println("+----------------------------------------------------------------+\n");

        System.out.println("+----------------------------------------------------------------+");
        System.out.println("-                      Output var variables                      -");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("  Age: "+age);
        System.out.println("  Country:  "+country);
        System.out.println("  Height: " +height);
        System.out.println("+----------------------------------------------------------------+\n");

        System.out.println("+----------------------------------------------------------------+");
        System.out.println("-          Output Non-Primitives data types - Java               -");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("-                           Strings                              -");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("  String 1: " + name);
        System.out.println("  String 2: " + lastName);
        System.out.println("  String 3: " + nickname);
        System.out.println("+----------------------------------------------------------------+\n");

        System.out.println("+----------------------------------------------------------------+");
        System.out.println("-              Class Integer | Long | Float                      -");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println(" Class Integer: " + number);
        System.out.println(" Class Long:    " + number2);
        System.out.println(" Class Float:   " + number3);
        System.out.println("------------------------------------------------------------------");
        System.out.println("-                   Powered by: Joshuép Jr.                      -");
        System.out.println("-                Software Engineering Student                    -");
        System.out.println("+----------------------------------------------------------------+");
    }
}
