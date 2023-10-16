package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.useDependency.appleProduct.*;
import javax.swing.JOptionPane;

public class AppleProductTest {
    public static void main(String[] args) {
        AppleProduct iPhone = new AppleProduct("iPhone", "15 Pro Max", 999);
        AppleProduct macbook = new AppleProduct("MacBook", "Pro", 1900);
        Customer appleFan = new Customer("1569668624",  "Josh");

        appleFan.purchaseProduct(iPhone);
        appleFan.purchaseProduct(macbook);

        StringBuilder productInformation = new StringBuilder();
        productInformation.append("Customer: " + appleFan.getCustomerName() + "\n");
        productInformation.append("Owned Product(s):\n");
        for (AppleProduct products: appleFan.getOwnedProduct()) {
            productInformation.append(" * ").append(products.getProductName()).append(" ")
                    .append(products.getProductModel()).append(" - USD$ ")
                    .append(products.getPrice()).append("\n");
        }

        JOptionPane.showMessageDialog(null, productInformation.toString(), "Customer/Product Information", JOptionPane.INFORMATION_MESSAGE);
    }
}