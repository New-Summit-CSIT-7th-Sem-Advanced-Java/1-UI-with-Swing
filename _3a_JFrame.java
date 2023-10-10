import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

class _3a_JFrame{
    _3a_JFrame(){
        JFrame frame = new JFrame("My Frame Example");
        // To change background color
        Container c = frame.getContentPane();
        c.setBackground(Color.RED);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new _3a_JFrame();
    }
}