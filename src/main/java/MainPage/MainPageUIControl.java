package MainPage;

import javax.swing.*;
import java.awt.*;

public class MainPageUIControl {
    private JPanel mainPanel = new JPanel();
    private JPanel CalenderPanel = new JPanel();
    private JPanel OptionsPanel = new JPanel();
    private OptionsSelector os = new OptionsSelector(); //See OptionsSelector Class
    private CalenderDisplay cd = new CalenderDisplay();


    public MainPageUIControl(){
    mainPanel.setLayout(new GridLayout(1,1));
    CalenderPanel.setLayout(new GridLayout(1,1));
    OptionsPanel.setLayout(new GridLayout(1,1));
    OptionsPanel.add(os);
    CalenderPanel.add(cd);
    mainPanel.add(CalenderPanel);
    mainPanel.add(OptionsPanel);
    mainPanel.setVisible(true);
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }
}
