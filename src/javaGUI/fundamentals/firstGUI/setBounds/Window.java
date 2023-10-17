package javaGUI.fundamentals.firstGUI.setBounds;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        setBounds(500, 400, 500, 400);
        setVisible(true);
        setDefaultCloseOperation(3);
        setTitle("Orange Bank");
    }
}