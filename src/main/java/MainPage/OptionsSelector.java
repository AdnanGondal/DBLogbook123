package MainPage;

import MainPage.CompFrame;
import MainPage.SimpleFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsSelector extends JPanel {
//The is the JPanel that contains all the buttons for selecting the Method the user wishes to add an entry for.
    private JPanel control = new JPanel();
    private JLabel info = new JLabel("Select the method you wish to add an entry with for today: ");
    private JButton SimpleBut = new JButton("Simple Method");
    private JButton CompBut = new JButton("Comprehensive Method");
    private JButton IntensiveBut = new JButton("Intensive Method");
    private SimpleFrame sf = new SimpleFrame(); //Objects of the classes that code the JFrames for the different Methods.
    private CompFrame cf = new CompFrame();
    private IntensiveFrame iF = new IntensiveFrame();


    public OptionsSelector(){
        control.setLayout(new GridLayout(5,1));
        control.add(info);
        control.add(SimpleBut);
        control.add(CompBut);
        control.add(IntensiveBut);
        add(control);
        ButtonsPressed();
    }

    private void ButtonsPressed() {
        SimpleBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for what happens when
                sf.setVisible(true);
                sf.getGlucoseInput().reset();

            }
        });
        CompBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cf.setVisible(true);
            cf.resetAll();
            }
        });

        IntensiveBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            iF.setVisible(true);
            }
        });
    }

}
