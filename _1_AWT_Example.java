import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class _1_AWT_Example {
    _1_AWT_Example() {
        Frame f = new Frame("My AWT Example");

        Button b = new Button("My Button");
        b.setBounds(200, 200, 100, 100);
        f.add(b);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);

        // window event for closing frame
        f.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                // not shown
                System.out.println("Window opened");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("window activated");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("window maximized");
            }

            public void windowIconified(WindowEvent e) {
                System.out.println("window minimized");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("window decativated");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
                f.dispose();
                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {
                // not shown
                // event is not fired when the window is closed using the close button
                // used for resource cleanup
                System.out.println("window closed");
            }

        });
    }

    public static void main(String[] args) {
        new _1_AWT_Example();
    }
}