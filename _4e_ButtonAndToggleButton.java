import javax.swing.*;
public class _4e_ButtonAndToggleButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("Buttons example");

        JButton button = new JButton("JButton");
        JToggleButton toggleButton = new JToggleButton("Toggle Button");

        button.setBounds(30,30,100,100);
        toggleButton.setBounds(30,150,100,100);

        f.add(button);
        f.add(toggleButton);

        f.setSize(700, 700);
        f.setLayout(null);
        f.setVisible(true);
    }
}
