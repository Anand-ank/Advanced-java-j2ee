package basics;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        JFrame frame = new JFrame("Image Button Example");

        // Label to display message
        label = new JLabel();
        label.setBounds(50, 50, 400, 30);

        // Load images (make sure images are in your project folder)
        ImageIcon digitalIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        JButton digitalBtn = new JButton(digitalIcon);
        JButton hourGlassBtn = new JButton(hourGlassIcon);

        digitalBtn.setBounds(50, 100, 150, 100);
        hourGlassBtn.setBounds(220, 100, 150, 100);

        // Event handling for Digital Clock button
        digitalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Event handling for Hour Glass button
        hourGlassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(label);
        frame.add(digitalBtn);
        frame.add(hourGlassBtn);

        // Frame settings
        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}