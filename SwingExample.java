package basics;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

// A simple Swing application
class SwingExample {

    SwingExample() {

        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Give the frame an initial size
        jfrm.setSize(400, 200);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!");

        // Set properties for label
        jlab.setFont(new Font("Verdana", Font.PLAIN, 20));
        jlab.setForeground(new Color(0, 0, 255));

        // Center the text
        jlab.setHorizontalAlignment(JLabel.CENTER);

        // Add the label to the frame
        jfrm.add(jlab);

        // Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}