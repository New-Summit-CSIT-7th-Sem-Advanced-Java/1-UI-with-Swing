import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

class MyCustomComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the background color
        setBackground(Color.YELLOW);

        // Draw a red rectangle
        g.setColor(Color.RED);
        g.fillRect(10, 10, 100, 50);
    }
}

public class _3c_JCompoenent {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Custom Component Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyCustomComponent customComponent = new MyCustomComponent();

        frame.add(customComponent);

        frame.setSize(300, 200);

        frame.setVisible(true);
    }
}
