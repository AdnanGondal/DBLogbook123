package RegistrationPage;

import javax.swing.*;
import java.awt.*;

public class RegistrationPageUIControl {
    private JPanel mainPanel = new JPanel();
    private JPanel personalDetails = new JPanel();
    private JPanel DoctorDetails = new JPanel();
    public RegistrationPageUIControl(){
        mainPanel.setLayout(new GridLayout(1,1));
        PersonalDetailsPanel pds = new PersonalDetailsPanel();
        mainPanel.add(pds);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
