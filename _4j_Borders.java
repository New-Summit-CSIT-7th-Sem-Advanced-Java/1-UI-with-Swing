import javax.swing.*;
// import java.awt.*;

public class _4j_Borders {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Button");
        button.setBounds(30, 30, 100, 100);
        // button.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        frame.add(button);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
