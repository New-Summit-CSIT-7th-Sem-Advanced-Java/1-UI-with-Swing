import javax.swing.*;
import java.awt.*;

public class GridBagConstraintsExample {
    public static void main(String[] args) {
        // Create a JFrame (window) and set its layout manager to GridBagLayout
        JFrame frame = new JFrame("GridBagConstraints.EAST Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        // Create a button
        JButton button = new JButton("Click Me");

        // Create GridBagConstraints and set the anchor to EAST
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.SOUTH;

        // Add the button to the frame using the GridBagConstraints
        frame.add(button, gbc);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
