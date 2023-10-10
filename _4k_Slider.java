import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class _4k_Slider {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSlider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Value: 0");
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);

        // slider.addChangeListener(new ChangeListener() {
        //     @Override
        //     public void stateChanged(ChangeEvent e) {
        //         int value = slider.getValue();
        //         label.setText("Value: " + value);
        //     }
        // });

        panel.add(slider);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
