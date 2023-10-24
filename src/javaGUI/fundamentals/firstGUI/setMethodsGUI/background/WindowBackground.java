package javaGUI.fundamentals.firstGUI.setMethodsGUI.background;

import javax.swing.*;
import java.awt.*;

public class WindowBackground extends JFrame {
    public WindowBackground(){
        setTitle("Background Test");
        setBounds(100, 100, 500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GREEN);
    }
}
