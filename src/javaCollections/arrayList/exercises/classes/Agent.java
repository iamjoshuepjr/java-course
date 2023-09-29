package javaCollections.arrayList.exercises.classes;

// Object Class
public class Agent {
    // Attributes
    private Integer id;
    private String name;
    private String login;
    private String extension;
    private String skill;

    // Empty Constructor
    public Agent(){}

    // Overloaded Constructor
    public Agent(Integer id, String name, String login, String extension){
        this.id = id;
        this.name = name;
        this.login = login;
        this.extension = extension;
    }

    // Getters and Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return  "\nId: " +id+ "\n" +
                "Name: " +name+ "\n" +
                "Login: " +login+ "\n" +
                "Extension: " +extension+ "\n" +
                "Skill: " +skill+ "\n";
    }
}