package javaObjectOrientedProgramming.theory.informationHiding.person;

// Object Class
public class Person {

    // Attributes
    private final int id;
    private String name;
    private String birthday;

    // Constructor
    public Person(int id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    // getter and setters
    /* public void setId(int id) {
        this.id = id;
    } */
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
}