import javax.swing.*;

public class _4d_TextArea {
    public static void main(String[] args) {
          
            JFrame frame = new JFrame("JTextArea Example");

            JTextArea textArea = new JTextArea("This is a JTextArea\nYou can type multiple lines here.",100,200);
            textArea.setDragEnabled(true);

            JScrollPane jsp = new JScrollPane(textArea);
            jsp.setBounds(30, 30, 250, 150);
            frame.add(jsp);

            frame.setLayout(null);
            frame.setSize(320, 320);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}

