package javaObjectOrientedProgramming.theory.objectRelationship.useDependency.retailChain;

import javax.swing.*;

public class Inventory {
    private Product product;
    private int quantity;

    public Inventory(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void addStock(int amount){
        quantity += amount;
    }

    public void sellStock(int amount){
        if (quantity >= amount){
            quantity -= amount;
            JOptionPane.showMessageDialog(null, amount + " " + product.getName() + "(s) sold.");
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient stock of " + product.getName() + ".");
        }
    }
}