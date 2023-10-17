package javaGUI.fundamentals.firstGUI.setBounds;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        setBounds(500, 400, 500, 400); // Allows us set both the position and size of the frame
        setVisible(true);
        setDefaultCloseOperation(3);
        setTitle("Orange App");
    }
}