package javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.abstracts.Microsoft;
import javax.swing.JOptionPane;

// Subclass
// Object Class
public class Azure extends Microsoft {
    // Attributes
    private String[][] services;

    // Constructor
    public Azure(String name, short foundingYear, String[][] services){
        super(name, foundingYear);
        this.services = services;
    }

    // Getter and Setters
    public String[][] getServices() {
        return services;
    }

    public void setServices(String[][] services) {
        this.services = services;
    }

    @Override
    public void information() {
        StringBuilder message = new StringBuilder();
        message.append("Division: ").append(getName()).append("\n");
        message.append("Founding Year: ").append(getFoundingYear()).append("\n");
        message.append("Services:\n");

        for (int i = 0; i < services.length; i++) {
            String[] serviceArray = services[i];
            for (int j = 0; j < serviceArray.length; j++) {
                String service = serviceArray[j];
                if (j == 0) {
                    message.append("- ").append(service).append("\n");
                } else {
                    message.append("    - ").append(service).append("\n");
                }
            }
        }

        message.append("-----------------------------------------------");

        JOptionPane.showMessageDialog(null, "MICROSOFT INFORMATION\n" + message.toString());
    }
}