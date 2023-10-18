package javaGUI.fundamentals.firstGUI.setMethodsGUI.bounds;

import javax.swing.*;
import java.awt.*;

public class WindowBounds extends JFrame {
    public WindowBounds(){
        setBounds(200, 40, 500, 400); // Allows us set both the position and size of the frame
        setVisible(true);
        setDefaultCloseOperation(3);
        setExtendedState(Frame.MAXIMIZED_BOTH); // Maximized the frame
        setTitle("Orange App");
    }
}