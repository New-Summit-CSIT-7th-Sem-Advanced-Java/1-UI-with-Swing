import javax.swing.*;

public class _2_Swing_Example {
    _2_Swing_Example(){
        JFrame f = new JFrame("My Swing Example");

        JButton b = new JButton("Click me!");
        b.setBounds(20, 20, 100, 100);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // EXIT_ON_CLOSE,DISPOSE_ON_CLOSE
        // HIDE_ON_CLOSE
        // DO_NOTHING_ON_CLOSE
        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new _2_Swing_Example();
    }
}
