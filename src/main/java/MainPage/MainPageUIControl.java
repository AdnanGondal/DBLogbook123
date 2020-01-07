package MainPage;

import javax.swing.*;
import java.awt.*;

public class MainPageUIControl { //This Class codes for the JPanel that is present in the Main Frame.
    private JPanel mainPanel = new JPanel();
    private OptionsSelector os = new OptionsSelector(); //See OptionsSelector Class


    public MainPageUIControl(){

    mainPanel.add(os);
    //mainPanel.add(cd);
    mainPanel.setVisible(true);
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }
}
