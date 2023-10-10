// import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class _4h_List {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // DefaultListModel<String> items = new DefaultListModel<>();
        // items.addElement("Item 1");
        // items.addElement("Item 2");
        // items.addElement("Item 3");

        String[] items = {"Item 1","Item 2","Item 3"};

        JList<String> list = new JList<>(items);

        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        // SINGLE_SELECTION, SINGLE_INTERVAL_SELECTION, MULTIPLE_INTERVAL_SELECTION
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
