import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class _4f_Checkbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JCheckBox checkBox = new JCheckBox("Check Me");
        checkBox.setBounds(50, 50, 150, 30);
        
        frame.add(checkBox);
        
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
