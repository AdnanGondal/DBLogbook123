package MainPage.Frames;

import javax.swing.*;
import java.awt.*;
//Class that codes for Settings Frame Page.
//This page will in a future version allow the user to change any registration details they entered.
public class SettingsFrame extends JFrame {


    private JPanel panel = new JPanel();
    private JLabel title = new JLabel("Settings");
    public SettingsFrame(){
        setSize(400,400);
        setTitle("Settings");
        setBackground(new Color(156, 234, 228));

        panel.setLayout(null);

        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setSize(300, 30);
        title.setLocation(5, 5);
        panel.add(title);

        getContentPane().add(panel).setBackground(new Color(156, 234, 228));
    }
}
