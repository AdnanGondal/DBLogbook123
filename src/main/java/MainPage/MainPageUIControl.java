package MainPage;

import javax.swing.*;
import java.awt.*;
//This Class codes the sending of the JPanel to the Main Diabetic Logbook frame.
public class MainPageUIControl {
    private JPanel mainPanel = new JPanel();
    private OptionsSelector os = new OptionsSelector(); //See OptionsSelector Class


    public MainPageUIControl(){
    mainPanel.add(os);
    mainPanel.setVisible(true);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
