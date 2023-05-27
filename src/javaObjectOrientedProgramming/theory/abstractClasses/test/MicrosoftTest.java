package javaObjectOrientedProgramming.theory.abstractClasses.test;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.*;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.abstracts.Microsoft;

// Controller Class
public class MicrosoftTest {
    public static void main(String[] args) {
        Microsoft windows = new Windows("Windows", (short) 1975, "Windows 11");

        String[][] services = {
                {"Compute", "Virtual Machines", "Azure Kubernetes Service (AKS)"},
                {"Storage", "Azure Files", "Azure Disk Storage"},
                {"Databases", "AzureSQL Database", "Azure Database for MySQL"}
        };

        Microsoft azure = new Azure("Azure", (short) 2010, services);
        Microsoft linkedIn = new LinkedIn("LinkedIn", (short) 2002, 740000000);
        Microsoft gitHub = new GitHub("GitHub", (short) 2008, "100 million repositories");
        Microsoft skype = new Skype("Skype", (short) 2003, true);

        Microsoft[] divisions = {azure, linkedIn, gitHub, skype};

        for (Microsoft division : divisions ) {
            division.information();
        }
    }
}