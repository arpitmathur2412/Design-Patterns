package com.MVC_Pattern_2;

import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public View() {
        frame = new JFrame("MVC Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Click me!");
        label = new JLabel("0");

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(button);
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void setLabelText(String text) {
        label.setText(text);
    }

    public void addButtonListener(Controller controller) {
        button.addActionListener(controller);
    }
}

