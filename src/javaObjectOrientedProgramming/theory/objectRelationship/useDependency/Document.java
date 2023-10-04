package javaObjectOrientedProgramming.theory.objectRelationship.useDependency;

public class Document {
    private String title;
    private String body;


    public Document(){}

    public Document(String title, String body){
        this.title = title;
        this.body = body;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}