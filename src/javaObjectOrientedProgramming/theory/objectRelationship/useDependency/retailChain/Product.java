package javaObjectOrientedProgramming.theory.objectRelationship.useDependency.retailChain;

// Object Class
public class Product {
    // Attributes
    private String name;
    private double price;

    // Empty Constructor
    public Product(){}

    // Overloaded Constructor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Getter and Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
