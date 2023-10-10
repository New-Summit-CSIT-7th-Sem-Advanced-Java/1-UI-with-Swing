import java.awt.*;
import java.awt.event.*;

class _1_AWT_Example{
    _1_AWT_Example(){
        Frame f = new Frame("My AWT Example");

        Button b = new Button("New Button");
        b.setBounds(100, 100, 100, 50);
        f.add(b);

        f.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e){
                System.out.println("Winodw Opened");
            }
            public void windowActivated(WindowEvent e){
                System.out.println("Winodw Activated");
            }
            public void windowDeactivated(WindowEvent e){
                System.out.println("Window Deactivated");
            }
            public void windowIconified(WindowEvent e){
                System.out.println("Window Iconified-Minimized");
            }
            public void windowDeiconified(WindowEvent e){
                System.out.println("Window Deiconified-Maximized");
            }
            public void windowClosing(WindowEvent e){
                System.out.println("Window Closing");
                f.dispose();
                // System.exit(0);
            }
            public void windowClosed(WindowEvent e){
                System.out.println("Window Closed");
            }
        });

        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new _1_AWT_Example();
    }
}