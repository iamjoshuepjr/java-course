package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.useDependency.retailChain.*;

public class RetailChainTest {
    public static void main(String[] args) {
        // Create some product instances
        Product laptop = new Product("Laptop", 999.99);
        Product smartphone = new Product("Smartphone", 499.99);

        // Create inventory instances for the products
        Inventory laptopInventory = new Inventory(laptop, 10);
        Inventory smartphoneInventory = new Inventory(smartphone, 20);

        // Sell some products
        laptopInventory.sellStock(5);
        smartphoneInventory.sellStock(15);
        laptopInventory.sellStock(10); // Attempt to sell more laptops than in stock

        // Check remaining stock
        System.out.println("Remaining " + laptopInventory.getProduct().getName() + " stock: " + laptopInventory.getQuantity());
        System.out.println("Remaining " + smartphoneInventory.getProduct().getName() + " stock: " + smartphoneInventory.getQuantity());
    }
}
