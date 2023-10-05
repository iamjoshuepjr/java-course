package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.useDependency.Document;
import javaObjectOrientedProgramming.theory.objectRelationship.useDependency.Printer;

public class PrinterTest {
    public static void main(String[] args) {
        Document document = new Document("The Game", "This book has changed a great amount of lives!");
        Printer printer = new Printer();

        printer.turnOn();
        printer.toPrint(document);
    }
}