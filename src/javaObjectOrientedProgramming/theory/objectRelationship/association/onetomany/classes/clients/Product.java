package javaObjectOrientedProgramming.theory.objectRelationship.association.onetomany.classes.clients;

// Object Class
public class Product {
    // Attributes
    private String id;
    private String name;
    private float price;

    // Empty Constructor
    public Product(){}

    // Overload Constructor
    public Product(String id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "\nId: " + id + "\n" +
                "Name: " + name + "\n" +
                "Price: USD$" + price +"\n";
    }
}
