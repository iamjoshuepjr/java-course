package javaObjectOrientedProgramming.exercises.interfaces.classes.datasource;

import javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.abstracts.DataBase;

import javax.swing.*;

public class SQLDatabase extends DataBase {
    // SQLDatabase Constructor
    public SQLDatabase(String dbName, String host, int port) {
        // DataBase Constructor
        super(dbName, host, port);
    }

    @Override
    public void executeQuery(String query) {
        JOptionPane.showMessageDialog(null, "Executing SQL query: " + query);
    }

    @Override
    public void executeUpdate(String query) {
        JOptionPane.showMessageDialog(null, "Executing SQL update statement: " + query);
    }
}
