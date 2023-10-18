package javaGUI.fundamentals.firstGUI.setMethodsGUI.bounds;

import javax.swing.*;

public class WindowBounds extends JFrame {
    public WindowBounds(){
        setBounds(500, 400, 500, 400); // Allows us set both the position and size of the frame
        setVisible(true);
        setDefaultCloseOperation(3);
        setTitle("Orange App");
    }
}