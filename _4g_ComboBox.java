import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _4g_ComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Select a fruit:");

        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Fig"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);

        panel.add(label);
        panel.add(comboBox);
        frame.add(panel);

        frame.setVisible(true);
    }
}
