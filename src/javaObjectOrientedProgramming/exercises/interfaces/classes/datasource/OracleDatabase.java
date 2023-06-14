package javaObjectOrientedProgramming.exercises.interfaces.classes.datasource;

import javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.abstracts.DataBase;

import javax.swing.*;

public class OracleDatabase extends DataBase {
    // Oracle Constructor
    public OracleDatabase(String dbName, String host, int port) {
        // DataBase Constructor
        super(dbName, host, port);
    }

    @Override
    public void executeQuery(String query) {
        JOptionPane.showMessageDialog(null, "Executing OracleDatabase query: " + query);
    }

    @Override
    public void executeUpdate(String query) {
        JOptionPane.showMessageDialog(null, "Executing OracleDatabase update operation: " + query);
    }
}
