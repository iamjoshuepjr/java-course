package javaObjectOrientedProgramming.theory.objectRelationship.association;

public class Engine {
    // Attributes
    private String type;
    private short horsePower;

    public Engine(){}

    public Engine(String type, short horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(short horsePower) {
        this.horsePower = horsePower;
    }
}
