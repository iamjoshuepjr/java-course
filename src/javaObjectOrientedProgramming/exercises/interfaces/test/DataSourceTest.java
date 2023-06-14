package javaObjectOrientedProgramming.exercises.interfaces.test;

import javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.MongoDB;
import javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.OracleDatabase;
import javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.SQLDatabase;

public class DataSourceTest {
    public static void main(String[] args) {
        // Create Instances
        SQLDatabase sql = new SQLDatabase("SQL", "localhost", 3306);
        MongoDB mongo = new MongoDB("MongoDB", "localhost", 27017);
        OracleDatabase  oracle = new OracleDatabase("Oracle", "localhost", 1521);

        // Connect to databases
        sql.connect();
        mongo.connect();
        oracle.connect();

        // Execute queries
        sql.executeQuery("SELECT * FROM customers");
        mongo.executeQuery("{ 'name': 'Joshuép Jr.' }");
        oracle.executeQuery("SELECT * FROM employees");

        // Execute updates
        sql.executeUpdate("UPDATE products SET price = 10.99 WHERE id = 1");
        mongo.executeUpdate("{ 'name': 'Joshuép Jr.' }, { $set: { 'age': 24 } }");
        oracle.executeUpdate("UPDATE employees SET salary = 5000 WHERE id = 123");

        // Begin transactions
        sql.beginTransaction();
        mongo.beginTransaction();
        oracle.beginTransaction();

        // Commit transactions
        sql.commitTransaction();
        mongo.commitTransaction();
        oracle.commitTransaction();

        // Disconnect from databases
        sql.disconnect();
        mongo.disconnect();
        oracle.disconnect();
    }
}
