package MainPage;

import MainPage.InputTools.CalenderDisplay;
import MainPage.InputTools.OptionsSelector;

import javax.swing.*;
import java.awt.*;

public class MainPageUIControl {
    JPanel mainPanel = new JPanel();
    JPanel CalenderPanel = new JPanel();
    JPanel OptionsPanel = new JPanel();


    public MainPageUIControl(){
    mainPanel.setLayout(new GridLayout(1,1));
    CalenderPanel.setLayout(new GridLayout(1,1));
    OptionsPanel.setLayout(new GridLayout(1,1));
    OptionsSelector os = new OptionsSelector();
    CalenderDisplay cd = new CalenderDisplay();
    OptionsPanel.add(os);
    CalenderPanel.add(cd);
    mainPanel.add(CalenderPanel);
    mainPanel.add(OptionsPanel);
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }
}
