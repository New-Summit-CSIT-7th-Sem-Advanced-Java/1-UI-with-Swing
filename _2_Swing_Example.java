import javax.swing.JButton;
import javax.swing.JFrame;

public class _2_Swing_Example {
    _2_Swing_Example(){
        JFrame f = new JFrame("Swing JFrame Example");

        JButton b = new JButton("Click me!");
        b.setBounds(20, 30, 100, 100);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // DISPOSE_ON_CLOSE,EXIT_ON_CLOSE - same
        // HIDE_ON_CLOSE - default
        // DO_NOTHING_ON_CLOSE
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new _2_Swing_Example();
    }
}
