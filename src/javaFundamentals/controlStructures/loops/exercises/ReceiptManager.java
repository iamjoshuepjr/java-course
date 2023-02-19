package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class ReceiptManager {
    public static void main(String[] args) {
        /* Ask for 5 receipts
        * --------- Receipt Model ----------
        * Item Code
        * Amount of money sold litres
        * Price per liter
        * -------- Display -------------
        * Total
        * Quantity of liters sold from the first item
        * Invoices worth more than $600 */

        int code, invoicesMore600 = 0;
        float liter, item1Liters = 0, priceLiter, invoiceAmount, totalRevenue = 0;

        JOptionPane.showMessageDialog(null, "Enter 5 receipts");
        for (byte i = 1; i < 6; i++){
            code = Integer.parseInt(JOptionPane.showInputDialog("Item "+i+
                    "\nEnter Item Code: "));
            liter = Float.parseFloat(JOptionPane.showInputDialog("Enter the amount of sold liters: Lt"));
            priceLiter = Float.parseFloat(JOptionPane.showInputDialog("Enter the Price per liter: $"));

            invoiceAmount = liter * priceLiter;
            totalRevenue += invoiceAmount;

            if(code == 1){
                item1Liters += liter;
            }
            if (invoiceAmount > 600){
                invoicesMore600++;
            }
        }

        JOptionPane.showMessageDialog(null, "Sales Summary" +
                "\nTotal Revenue: $"+totalRevenue +
                "\nQuantity of liters item 1: "+item1Liters +" Liters" +
                "\nInvoices worth more than $600: "+invoicesMore600);
    }
}
