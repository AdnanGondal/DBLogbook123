package MainPage;

import MainPage.Frames.*;
import MainPage.InputTools.CalenderDisplay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsSelector extends JPanel {
//The is the JPanel that contains every function present in the Diabetic Logbook.
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
    //Objects of the classes that code for the frames for different Methods of adding logbook entry.
    private SimpleFrame simplef = new SimpleFrame();
    private CompFrame compf = new CompFrame();
    private IntensiveFrame intenF = new IntensiveFrame();
    ///Objects of classes that code for some other useful features.
    private SettingsFrame settingsF = new SettingsFrame();
    private HelpFrame helpF = new HelpFrame();
    private QuesFrame quesF = new QuesFrame();

    private JLabel viewEntries = new JLabel("View Entries: ");
    private CalenderDisplay cd = new CalenderDisplay(); // See CalenderDisplay class. Allows user to select date via calender.
    private JLabel othertitle = new JLabel("Other: ");
    private JButton quesBut = new JButton("Questionnaire");
    private JButton helpBut = new JButton("Help");
    private JButton settingsBut = new JButton("Settings");




    public OptionsSelector(){

        setLayout(new GridLayout(3,1 ));
        //Methods Have been extracted: See Below.
        ModifyPanels();
        ModifyText();
        ArrangePanels();
        ButtonsPressed();
    }

    private void ArrangePanels() {
        //Add three JPanels into this Panel and add the different features of UI here.
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
        //Change fonts and size of text in the Panel.
        welcome.setFont(new Font("Arial", Font.BOLD, 30));
        addEntries.setFont(new Font("Arial", Font.PLAIN, 20));
        viewEntries.setFont(new Font("Arial", Font.PLAIN, 20));
        othertitle.setFont(new Font("Arial", Font.PLAIN, 20));
    }

    private void ModifyPanels() {
        //Change colours and Layout of JPanels
        addEntriesPanel.setLayout(new GridLayout(7,1));
        addEntriesPanel.setBackground(new Color(160,255, 150));
        viewEntriesPanel.setLayout(new GridLayout(2,1));
        viewEntriesPanel.setBackground(new Color(160,255, 150));
        otherPanel.setLayout(new GridLayout(4,1));
        otherPanel.setBackground(new Color(160,255, 150));
    }

    private void ButtonsPressed() {
        //What happens when the different buttons are pressed by the user:

        simpleBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                simplef.setVisible(true);
                simplef.getGlucoseInput().reset();

            }
        });
        compBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            compf.setVisible(true);
            compf.resetAll();
            }
        });

        intensiveBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            intenF.setVisible(true);
            intenF.ResetAllIntensive();
            }
        });

        settingsBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            settingsF.setVisible(true);
            }
        });

        helpBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpF.setVisible(true);
            }
        });

        quesBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quesF.setVisible(true);
            }
        });
    }

}
