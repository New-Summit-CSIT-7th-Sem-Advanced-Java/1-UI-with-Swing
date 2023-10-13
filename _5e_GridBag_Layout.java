import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _5e_GridBag_Layout {

    public _5e_GridBag_Layout() {
        JFrame f = new JFrame("GridBag Demo");
        f.setLayout(new GridBagLayout());

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        f.add(b1,gc);

        gc.gridx = 1;
        gc.gridy = 0;
        f.add(b2,gc);

        gc.gridx = 0;
        gc.gridy = 1;
        f.add(b3,gc);

        gc.gridx = 1;
        gc.gridy = 1;
        f.add(b4,gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        f.add(b5,gc);

        f.setSize(600, 600);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new _5e_GridBag_Layout();
    }
}
