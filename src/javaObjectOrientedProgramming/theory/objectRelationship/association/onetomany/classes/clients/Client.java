package javaObjectOrientedProgramming.theory.objectRelationship.association.onetomany.classes.clients;

import java.util.List;

// Object Class
public class Client {
    // Attributes
    private String id;
    private String name;

    private List<Product> products;

    // Empty Constructor
    public Client(){} 

    // Overloaded Constructor
    public Client(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return  "\nId: " +id+ "\n" +
                "Name: " +name+ "\n" +
                "Products: " +products + "\n";
    }
}
