package javaGUI.fundamentals.firstGUI.setLocation;

import javax.swing.*;
public class WindowsLocation extends JFrame {
    public WindowsLocation() {
        setSize(500, 300); // Allows us to set the size of the frame; width and height in pixels.
        setLocation(500, 400);
        setVisible(true); // Make the frame visible.
        setResizable(false); // Allows us to enable or disable the frame's ability to be resized by the user.
        setDefaultCloseOperation(3); // Set the default close operation to exit the application
        setTitle("Orange App");
    }
}
