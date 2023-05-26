package javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.abstracts;

/**
 * ===========================================================================================================
 *                                          ABSTRACTION
 * ===========================================================================================================
 * Abstraction shows only the essential attributes and hides unnecessary details of the object from the user.
 * Abstraction is accomplished using Abstract classes, Abstract methods, and Interfaces.
 * ===========================================================================================================
 *                                        ABSTRACT CLASS
 * ===========================================================================================================
 * An abstract class is a class that cannot be instantiated directly. It serves as a blueprint for other
 * classes and is intended to be subclassed by concrete (non-abstract) classes. Abstract classes can contain
 * both abstract and non-abstract methods and can also have instance variables.
 */


// Superclass (Abstract Class)
// Object Class
public abstract class Meta {
    // Attributes
    private String platformName;
    private long totalUsers;

    // Constructor
    public Meta(String platformName, long totalUsers){
        this.platformName = platformName;
        this.totalUsers = totalUsers;
    }

    // Getter and Setters
    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public long getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(long totalUsers) {
        this.totalUsers = totalUsers;
    }

    // Abstract Methods
    public abstract void information();
}