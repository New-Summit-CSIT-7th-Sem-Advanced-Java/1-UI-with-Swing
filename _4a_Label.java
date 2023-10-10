// import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _4a_Label {
    _4a_Label(){
        JFrame f = new JFrame("Label Example");

        // JLabel(String)
        JLabel l1 = new JLabel("Simple String");
        l1.setBounds(30, 30, 100, 200);
        // System.out.println(l1.getText());

        // ImageIcon i = new ImageIcon("https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80");
        // Image scaledImage = i.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT);
        // i = new ImageIcon(scaledImage);

        // JLabel(Icon)
        ImageIcon i = new ImageIcon("image.jpeg");
        JLabel l2 = new JLabel(i);
        l2.setBounds(200, 30, 100, 200);
        // System.out.println(l2.getIcon());
        f.add(l1);
        f.add(l2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new _4a_Label();
    }
}
