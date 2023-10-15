package javaObjectOrientedProgramming.theory.objectRelationship.useDependency.appleProduct;

// Object Class
public class Customer {
    // Attributes
    private String customerID;
    private String customerName;
    private AppleProduct ownedProduct;

    // Empty Constructor
    public Customer(){}

    // Overloaded Constructor
    public Customer(String customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        this.ownedProduct = null;
    }


    // Purchase Method
    public void purchaseProduct(AppleProduct product){
        this.ownedProduct = product;
    }


    // Getters & Setters
    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public AppleProduct getOwnedProduct() {
        return ownedProduct;
    }
}
