package javaObjectOrientedProgramming.theory.objectRelationship.useDependency.appleProduct;

// Object Class
public class AppleProduct {
    // Attributes
    private String productName;
    private String productModel;
    private double price;


    // Empty Constructor
    public AppleProduct(){}

    // Overloaded Constructor
    public AppleProduct (String productName, String productModel, double price) {
        this.productName = productName;
        this.productModel = productModel;
        this.price = price;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public double getPrice() {
        return price;
    }
}
