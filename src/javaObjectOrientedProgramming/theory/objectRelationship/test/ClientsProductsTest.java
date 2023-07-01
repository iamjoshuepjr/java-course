package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.association.onetomany.classes.clients.Client;
import javaObjectOrientedProgramming.theory.objectRelationship.association.onetomany.classes.clients.Product;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ClientsProductsTest {
    public static void main(String[] args) {
        // Declaring clients and products lists
        List<Client> clients = new ArrayList<>();
        List<Product> client1Products = new ArrayList<>();
        List<Product> client2Products = new ArrayList<>();

        // Creating Client objects
        Client client1 = new Client("1246459424", "Dayanna");
        Client client2 = new Client("1427584936", "Josué");

        // Creating Product objects
        Product product1 = new Product("000001", "MacBook Pro", 2499f);
        Product product2 = new Product("000002", "Iphone 14", 799f);
        Product product3 = new Product("000003", "ASUS", 1499f);
        Product product4 = new Product("000004", "Samsung", 599f);

        // Adding products to their corresponding products list
        client1Products.add(product1);
        client1Products.add(product2);
        client2Products.add(product3);
        client2Products.add(product4);

        // Adding the product list to Client object
        client1.setProducts(client1Products);
        client2.setProducts(client2Products);

        // Adding the Client object to the clients list
        clients.add(client1);
        clients.add(client2);

        for (Client client: clients) {
            JOptionPane.showMessageDialog(null, "Client Information\n" + client);
        }
    }
}
