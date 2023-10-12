import java.awt.*;

public class _5e_GridBag_Layout {
    private Frame f;
    private Label headerLabel;
    private Panel controlPanel;

    public _5e_GridBag_Layout() {
        f = new Frame("Java GridBagDemo");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        f.add(headerLabel);
        f.add(controlPanel);
        f.setVisible(true);
    }

    private void showGridBagLayoutDemo() {
        headerLabel.setText("Layout in action: GridBagLayout");
        Panel panel = new Panel();
        // panel.setBackground(Color.darkGray);
        panel.setSize(300, 300);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 0;
        panel.add(new Button("Button 1"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new Button("Button 2"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20; // y-axis padding
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new Button("Button 3"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new Button("Button 4"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(new Button("Button 5"), gbc);

        controlPanel.add(panel);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        _5e_GridBag_Layout gridLayoutDemo = new _5e_GridBag_Layout();
        gridLayoutDemo.showGridBagLayoutDemo();
    }
}
