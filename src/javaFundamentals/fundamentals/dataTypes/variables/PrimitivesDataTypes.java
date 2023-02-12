package javaFundamentals.fundamentals.dataTypes.variables;

public class PrimitivesDataTypes {
    public static void main(String[] args) {
        /*
         * Primitives integer data types:
         * char
         * byte
         * short
         * int
         * long
         * float
         * double
         * */

        // 8 bits -> 1 byte
        byte age = 23;

        System.out.println("+----------------------------------+");
        System.out.println("CURRENT AGE: " +age);
        System.out.println("BYTE SIZE: " +Byte.SIZE +" bits");
        System.out.println("BYTE CLASS: " +Byte.TYPE);
        System.out.println("BYTE MAX VALUE: " +Byte.MAX_VALUE);
        System.out.println("BYTE MIN VALUE: " +Byte.MIN_VALUE);
        System.out.println("+----------------------------------+");
        System.out.println();

        // 16 bits -> 2 bytes
        short year = 2022;

        System.out.println("+----------------------------------+");
        System.out.println("CURRENT YEAR: "+year);
        System.out.println("SHORT CLASS: " +Short.TYPE);
        System.out.println("SHORT SIZE: "+Short.SIZE +" bits");
        System.out.println("SHORT MAX VALUE: "+Short.MAX_VALUE);
        System.out.println("SHORT MIN VALUE: "+Short.MIN_VALUE);
        System.out.println("+----------------------------------+");
        System.out.println();

        // 32 bits -> 4 bytes
        int id = 1225619317;

        System.out.println("+----------------------------------+");
        System.out.println("ID: "+ id);
        System.out.println("INT CLASS: " +Integer.TYPE);
        System.out.println("INT SIZE: "+Integer.SIZE +" bits");
        System.out.println("INT MAX VALUE: "+Integer.MAX_VALUE);
        System.out.println("INT MIN VALUE: "+Integer.MIN_VALUE);
        System.out.println("+----------------------------------+");
        System.out.println();

        // 64 bits -> 8 bytes
        long code = 1784578945128888882L;

        System.out.println("+----------------------------------+");
        System.out.println("Code: "+code);
        System.out.println("LONG CLASS: "+Long.TYPE);
        System.out.println("LONG SIZE:" +Long.SIZE+ " bits");
        System.out.println("LONG MAX VALUE: " +Long.MAX_VALUE);
        System.out.println("LONG MIN VALUE: " +Long.MIN_VALUE);
        System.out.println("+----------------------------------+");
        System.out.println();

        // 32 bits -> 4 bytes
        // Decimal point data types are double by default,
        // so we must indicate the type of data we want to manipulate: float or double

        float monthly_salary = 150_000.0F; // F indicates the type of data to be treated, in this case (float)

        System.out.println("+----------------------------------+");
        System.out.println("SALARY: "+monthly_salary);
        System.out.println("FLOAT CLASS: " +Float.TYPE);
        System.out.println("FLOAT SIZE: " +Float.SIZE+ " bits");
        System.out.println("FLOAT MAX VALUE: " +Float.MAX_VALUE);
        System.out.println("FLOAT MIN VALUE: " +Float.MIN_VALUE);
        System.out.println("+----------------------------------+");
        System.out.println();

        // 64 bits -> 8 bytes
        double year_salary = 1_800_000.0D; // D indicates the type of data to be treated, un this case (double)

        System.out.println("+----------------------------------+");
        System.out.println("SALARY (YEAR): " +year_salary);
        System.out.println("DOUBLE CLASS: " +Double.TYPE);
        System.out.println("DOUBLE SIZE: " +Double.SIZE +" bits");
        System.out.println("DOUBLE MAX VALUE: " +Double.MAX_VALUE);
        System.out.println("DOUBLE MIN VALUE: " +Double.MIN_VALUE);
        System.out.println("+----------------------------------+");
        System.out.println();

        // 16 bits -> 2 bytes
        char letter = 'j';
        char unicode = '\u0021';
        char unicodeDecimal =  33;
        char unicodeSymbol = '!';

        System.out.println("+-----------------------------------+");
        System.out.println("CHAR VALUE: " +letter);
        System.out.println("UNICODE: " +unicode);
        System.out.println("UNICODE DECIMAL: " +unicodeDecimal);
        System.out.println("UNICODE SYMBOL: " +unicodeSymbol);
        System.out.println("+-----------------------------------+");
        System.out.println();

        // Char Type Inference
        var unicode2 = '\u0021';
        var unicodeDecimal2 = (char) 33; // var must be converted to char to display unicode decimal, because var is an int data type
        var unicodeSymbol2 = '!';
        int letterUnicode = 'a'; // if a literal is assigned as a char value to a data type int, the result will be an int number which means the decimal value unicode
        int letterUnicode2 = 'A'; // if a literal is assigned as a char value to a data type int, the result will be an int number which means the decimal value unicode

        System.out.println("+-----------------------------------+");
        System.out.println("UNICODE: " +unicode2);
        System.out.println("UNICODE DECIMAL: " +unicodeDecimal2);
        System.out.println("UNICODE SYMBOL: " +unicodeSymbol2);
        System.out.println("UNICODE LETTER INT: " +letterUnicode);
        System.out.println("UNICODE LETTER INT 2: " +letterUnicode2);
        System.out.println("+-----------------------------------+");
        System.out.println();

        boolean decisionT = true;
        boolean decisionF = false;

        System.out.println("+-----------------------------------+");
        System.out.println("BOOLEAN TRUE VALUE: " +decisionT);
        System.out.println("BOOLEAN FALSE VALUE: " +decisionF);
        System.out.println("+-----------------------------------+");
        System.out.println();
    }
}
