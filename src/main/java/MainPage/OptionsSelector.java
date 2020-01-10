package MainPage;

import MainPage.CompFrame;
import MainPage.SimpleFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsSelector extends JPanel {
//The is the JPanel that contains titles and the buttons for selecting the Method the user wishes to add an entry for.
//It is added to the Main Frame.
    private JPanel addEntriesPanel = new JPanel();
    private JPanel viewEntriesPanel = new JPanel();
    private JPanel otherPanel = new JPanel();
    private JLabel welcome = new JLabel("Welcome to your Diabetic Logbook");
    private JLabel addEntries = new JLabel("Add Entries: ");
    private JLabel info = new JLabel("Select the method you wish to add an entry with for today: ");
    private JButton simpleBut = new JButton("Simple Method");
    private JButton compBut = new JButton("Comprehensive Method");
    private JButton intensiveBut = new JButton("Intensive Method");
    private SimpleFrame sf = new SimpleFrame(); //Objects of the classes that code the JFrames for the different Methods.
    private CompFrame cf = new CompFrame();
    private IntensiveFrame iF = new IntensiveFrame();
    private SettingsFrame sF = new SettingsFrame();
    private HelpFrame hF = new HelpFrame();
    private QuesFrame jF = new QuesFrame();
    private JLabel viewEntries = new JLabel("View Entries: ");
    private CalenderDisplay cd = new CalenderDisplay();
    private JLabel othertitle = new JLabel("Other: ");
    private JButton quesBut = new JButton("Questionnaire");
    private JButton helpBut = new JButton("Help");
    private JButton settingsBut = new JButton("Settings");




    public OptionsSelector(){

        setLayout(new GridLayout(3,1 ));
        ModifyPanels();
        ModifyText();
        ArrangePanels();
        ButtonsPressed();
    }

    private void ArrangePanels() {
        addEntriesPanel.add(welcome);
        addEntriesPanel.add(addEntries);
        addEntriesPanel.add(info);
        addEntriesPanel.add(simpleBut);
        addEntriesPanel.add(compBut);
        addEntriesPanel.add(intensiveBut);

        viewEntriesPanel.add(viewEntries);
        viewEntriesPanel.add(cd);

        otherPanel.add(othertitle);
        otherPanel.add(quesBut);
        otherPanel.add(helpBut);
        otherPanel.add(settingsBut);

        add(addEntriesPanel);
        add(viewEntriesPanel);
        add(otherPanel);
    }

    private void ModifyText() {
        welcome.setFont(new Font("Arial", Font.BOLD, 30));
        addEntries.setFont(new Font("Arial", Font.PLAIN, 20));
        viewEntries.setFont(new Font("Arial", Font.PLAIN, 20));
        othertitle.setFont(new Font("Arial", Font.PLAIN, 20));
    }

    private void ModifyPanels() {
        addEntriesPanel.setLayout(new GridLayout(7,1));
        addEntriesPanel.setBackground(new Color(160,255, 150));
        viewEntriesPanel.setLayout(new GridLayout(2,1));
        viewEntriesPanel.setBackground(new Color(160,255, 150));
        otherPanel.setLayout(new GridLayout(4,1));
        otherPanel.setBackground(new Color(160,255, 150));
    }

    private void ButtonsPressed() {
        simpleBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for what happens when
                sf.setVisible(true);
                sf.getGlucoseInput().reset();

            }
        });
        compBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cf.setVisible(true);
            cf.resetAll();
            }
        });

        intensiveBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            iF.setVisible(true);
            }
        });

        settingsBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            sF.setVisible(true);
            }
        });

        helpBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hF.setVisible(true);
            }
        });

        quesBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jF.setVisible(true);
            }
        });
    }

}
