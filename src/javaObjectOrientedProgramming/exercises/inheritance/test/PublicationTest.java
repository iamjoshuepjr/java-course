package javaObjectOrientedProgramming.exercises.inheritance.test;

import javaObjectOrientedProgramming.exercises.inheritance.classes.publication.Book;
import javaObjectOrientedProgramming.exercises.inheritance.classes.publication.CD;

// Controller Class
public class PublicationTest {
    public static void main(String[] args) {
        Book book = new Book("Think and grow rich", 23.5f, 299);
        book.information();

        CD cd = new CD("Rich Dad, poor dad", 34.2f, 299);
        cd.play();
    }
}