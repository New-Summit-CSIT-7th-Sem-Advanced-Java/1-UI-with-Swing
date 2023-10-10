import javax.swing.*;

public class _4b_TextField {
    _4b_TextField(){
        JFrame f = new JFrame("Text Field Example");

        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 30);

        JTextField tf2 = new JTextField("String Text");
        tf2.setBounds(280, 50, 200, 30);

        f.add(tf1);
        f.add(tf2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(700, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new _4b_TextField();
    }
}
