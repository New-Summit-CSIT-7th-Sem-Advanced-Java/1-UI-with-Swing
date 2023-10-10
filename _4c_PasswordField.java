import javax.swing.*;

public class _4c_PasswordField {
    public static void main(String[] args) {
            JFrame frame = new JFrame("JPasswordField Example");

            JPasswordField passwordField = new JPasswordField();
            passwordField.setBounds(50, 50, 200, 30);

            JButton button = new JButton("Get Password");
            button.setBounds(50, 100, 120, 30);

            frame.add(passwordField);
            frame.add(button);

            frame.setLayout(null); 
            frame.setSize(300, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}

