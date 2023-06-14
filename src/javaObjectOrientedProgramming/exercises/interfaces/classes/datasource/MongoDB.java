package javaObjectOrientedProgramming.exercises.interfaces.classes.datasource;

import javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.abstracts.DataBase;
import javax.swing.JOptionPane;


public class MongoDB extends DataBase {
    // SQLDatabase Constructor
    public MongoDB(String dbName, String host, int port) {
        // DataBase Constructor
        super(dbName, host, port);
    }

    @Override
    public void executeQuery(String query) {
        JOptionPane.showMessageDialog(null, "Executing MongoDB query: " + query);
    }

    @Override
    public void executeUpdate(String query) {
        JOptionPane.showMessageDialog(null, "Executing MongoDB update operation: " + query);
    }
}