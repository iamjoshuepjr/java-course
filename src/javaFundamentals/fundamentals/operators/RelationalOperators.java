package javaFundamentals.fundamentals.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        var herIs = 19;
        var hisIs = 24;

        // greater than operator (>)
        var difference = herIs > hisIs; // return a boolean value
        System.out.println("Is her older than his?: "+difference);

        // less than operator (<)
        difference = herIs < hisIs;
        System.out.println("Is her younger than his?: "+difference);


        var age1 = 23;
        var age2 = 15;

        // greater than or equal to operator (>=)
        var older = age1 >= age2;
        System.out.println("Older: "+older);

        // less than or equal to operator (>=)
        var youner = age1 <= age2;
        System.out.println("Youner: "+youner);
    }
}
