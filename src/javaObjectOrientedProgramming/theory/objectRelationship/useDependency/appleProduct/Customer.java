package javaObjectOrientedProgramming.theory.objectRelationship.useDependency.appleProduct;

import java.util.ArrayList;

// Object Class
public class Customer {
    // Attributes
    private String customerID;
    private String customerName;
    private ArrayList<AppleProduct> ownedProduct;

    // Empty Constructor
    public Customer(){}

    // Overloaded Constructor
    public Customer(String customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        this.ownedProduct = new ArrayList<AppleProduct>();
    }


    // Purchase Method
    public void purchaseProduct(AppleProduct product){
        if (ownedProduct == null)
            ownedProduct = new ArrayList<AppleProduct>();
        ownedProduct.add(product);
    }


    // Getters & Setters
    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<AppleProduct> getOwnedProduct() {
        return ownedProduct;
    }
}
