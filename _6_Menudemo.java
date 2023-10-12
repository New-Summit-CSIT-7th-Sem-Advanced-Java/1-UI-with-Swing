import java.awt.*;
import java.awt.event.*;

public class _6_Menudemo {
    public _6_Menudemo() {
        Frame f = new Frame("DashBoard");
        f.setSize(400, 400);
        MenuBar menubar = new MenuBar();
        Menu fileMenu = new Menu("File",true);
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);
        f.setMenuBar(menubar);

        
        MenuItem newfile = new MenuItem("New");
        MenuItem openfile = new MenuItem("Open");
        MenuItem newsave = new MenuItem("Save");
        MenuItem newsaveas = new MenuItem("SaveAs");
        MenuItem newexit = new MenuItem("Exit");
        CheckboxMenuItem c1 = new CheckboxMenuItem("Check 1", true);
        CheckboxMenuItem c2 = new CheckboxMenuItem("Check 2");
        fileMenu.add(newfile);
        fileMenu.add(openfile);
        fileMenu.add(newsave);
        fileMenu.add(newsaveas);
        fileMenu.add(newexit);
        fileMenu.add(c1);
        fileMenu.add(c2);

        
        newsaveas.setEnabled(false);

        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new _6_Menudemo();
    }
}

