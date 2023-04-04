package javaFundamentals.arrays.multidimensional.theory;

public class IterateThrough2DArrays {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        String[][] techCompanies = {
                {"Apple",     "      Tim Cook",                 "             1976", "     100,000",   "$274.5 billion",   "     511", "Cupertino, California"},
                {"Microsoft", "Satya Nadella",            "         1975", "     181,000",   "$143.015 billion", " 131", "Redmond, Washington"},
                {"Google",    "    Sundar Pichai",            "         1998", "     135,301",   "$182.5 billion",   "     135", "Mountain View, California"},
                {"Amazon",    "    Andy Jassy",               "             1994", "     1,298,000", "$386 billion",     "     659", "Seattle, Washington"},
                {"Facebook",  "Mark Zuckerberg",          "         2004", "     58,604",    "    $86 billion",      "          85",  "Menlo Park, California"},
                {"Oracle",    "Safra Catz and Mark Hurd", " 1977", "     135,000",   "$39.1 billion",    "     138", "Redwood City, California"},
                {"Intel",     "    Pat Gelsinger",            "         1968", "     110,600",   "$78 billion",      "         171", "Santa Clara, California"},
                {"IBM",       "        Arvind Krishna",           "         1911", "     352,600",   "$73.6 billion",    "     148", "Armonk, New York"},
                {"Cisco",     "    Chuck Robbins",            "         1984", "     77,500",    "    $49.3 billion",    "     400", "San Jose, California"}
        };

        // Displaying Header
        System.out.println("Company\t\t\t\t Current CEO \t\t\t Year of foundation \t\t\t Employees \t\t\t Annual Revenue \t\t\t Subsidiaries \t\t\t Location");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Printing countries
        for (int i = 0; i <techCompanies.length; i++) {
            for (int j = 0; j < techCompanies[i].length; j++) {
                System.out.print(techCompanies[i][j] + "\t\t\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

        byte[][] ages = new byte[3][3];
        // [0] it's the first array which has three elements
        ages[0][0] = 15;
        ages[0][1] = 24;
        ages[0][2] = 18;
        // [1] it's the second array which has three elements
        ages[1][0] = 26;
        ages[1][1] = 13;
        ages[1][2] = 34;
        // [0] it's the third array which has three elements
        ages[2][0] = 46;
        ages[2][1] = 35;
        ages[2][2] = 25;

        // printing the values of the ages array
        for (byte i = 0; i < ages.length; i++) {
            for (byte j = 0; j < ages[i].length; j++){
                System.out.println("Array ["+i+"] - Index ["+j+"] " +ages[i][j]);
            }
            System.out.println("-------------------------");
        }
    }
}
