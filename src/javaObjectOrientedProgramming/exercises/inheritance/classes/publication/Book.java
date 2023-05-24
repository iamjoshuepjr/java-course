package javaObjectOrientedProgramming.exercises.inheritance.classes.publication;

import javax.swing.*;

public class Book extends Publication {
    // Attributes
    private int numberPages;

    // Constructor
    public Book(String title, float price, int numberPages){
        super(title, price);
        this.numberPages = numberPages;
    }

    // Getter and Setters
    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "BOOK INFORMATION" +
                "\nTitle: " + getTitle() +
                "\nPages: " +getNumberPages() +
                "\nPrice: USD$ " +getPrice());
    }
}