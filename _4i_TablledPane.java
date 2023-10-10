import javax.swing.*;

public class _4i_TablledPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorPanel());
        jtp.addTab("Flavors", new FlavorPanel());
        frame.add(jtp);
        frame.setVisible(true);
    }
}

class CitiesPanel extends JPanel{
    public CitiesPanel(){
        JButton b1=new JButton("New York");
        add(b1);
        JButton b2=new JButton("London");
        add(b2);
        JButton b3=new JButton("HongKong");
        add(b3);
        JButton b4=new JButton("Tokyo");
        add(b4);
    }
}

class ColorPanel extends JPanel{
    public ColorPanel(){
        JCheckBox cb1=new JCheckBox("Red");
        add(cb1);
        JCheckBox cb2=new JCheckBox("Green");
        add(cb2);
        JCheckBox cb3=new JCheckBox("Blue");
        add(cb3);
    }
}

class FlavorPanel extends JPanel{
    public FlavorPanel(){
        JComboBox<String> jcb=new JComboBox<>();
        jcb.addItem("vanilla");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");
        add(jcb);
    } 
}
