package javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.abstracts;

import javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.interfaces.DataSource;
import javax.swing.JOptionPane;

// Abstract Class
// Superclass
// Subclass (implements)
public abstract class DataBase implements DataSource {
    // Attributes
    protected String dbName;
    protected String host;
    protected int port;


    // Constructor
    public DataBase(String dbName, String host, int port){
        this.dbName = dbName;
        this.host = host;
        this.port = port;
    }

    // Providing common implementation
    @Override
    public void connect() {
        JOptionPane.showMessageDialog(null, "DATABASE CONNECTION\n" +
                "Connecting to " +dbName+ " databse on " +host+ ": " + port);
    }

    @Override
    public void disconnect() {
        JOptionPane.showMessageDialog(null, "DATABASE DISCONNECTION\n" +
                "Disconnecting from: " + dbName + " database");
    }

    @Override
    public void beginTransaction() {
        JOptionPane.showMessageDialog(null, "BEGIN TRANSACTION\n" +
                "Beginning Transaction");
    }

    public void commitTransaction() {
        JOptionPane.showMessageDialog(null, "COMMIT TRANSACTION\n" +
                "Committing Transaction");
    }

    @Override
    public void rollbackTransaction() {
        JOptionPane.showMessageDialog(null, "ROLLBACK TRANSACTION\n" +
                "Committing Transaction");
    }
}