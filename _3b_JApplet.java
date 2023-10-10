import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.Font;

public class _3b_JApplet extends JApplet {
    public void init() {
        // Initialization code goes here
        JLabel label = new JLabel("Hello, JApplet!");
        label.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(label);
    }
}

// <!DOCTYPE html>
// <html>
// <head>
//     <title>Hello Applet Example</title>
// </head>
// <body>
//     <applet code="_3b_JApplet.class" width="400" height="200"></applet>
// </body>
// </html>