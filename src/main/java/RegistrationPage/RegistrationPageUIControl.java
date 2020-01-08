package RegistrationPage;

import MainPage.MainPageUIControl;

import javax.swing.*;
import java.awt.*;

public class RegistrationPageUIControl {
    private JPanel mainPanel = new JPanel();

    private PersonalDetailsPanel pds = new PersonalDetailsPanel();
    public RegistrationPageUIControl(){
        mainPanel.setLayout(new GridLayout(1,1));
        mainPanel.add(pds);

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
