import javax.swing.JButton;
import javax.swing.JFrame;

public class _5a_No_Layout {
    public static void main(String[] args) {
        JFrame f = new JFrame("Set Bounds");

        JButton b = new JButton("Button");
        b.setBounds(30, 30, 100, 100);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
