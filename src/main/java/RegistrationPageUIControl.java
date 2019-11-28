import javax.swing.*;
import java.awt.*;

public class RegistrationPageUIControl {
    JPanel mainPanel = new JPanel();
    JPanel personalDetails = new JPanel();
    JPanel DoctorDetails = new JPanel();
    public RegistrationPageUIControl(){
        mainPanel.setLayout(new GridLayout(1,1));
        PersonalDetailsPanel pds = new PersonalDetailsPanel();
        mainPanel.add(pds);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
