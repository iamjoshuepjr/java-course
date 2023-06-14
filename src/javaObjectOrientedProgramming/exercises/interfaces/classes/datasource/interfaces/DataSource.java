package javaObjectOrientedProgramming.exercises.interfaces.classes.datasource.interfaces;

public interface DataSource {
    void connect();
    void disconnect();
    void executeQuery(String query);
    void executeUpdate(String query);
    void beginTransaction();
    void commitTransaction();
    void rollbackTransaction();
}