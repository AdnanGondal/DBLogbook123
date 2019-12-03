package MainPage;

import Entries.BloodGlucoseLevel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class SimpleFrame extends JFrame {

    public SimpleFrame(){
        JPanel SimplePanel = new JPanel();
        JButton enter = new JButton("Enter");
        SimplePanel.setLayout(new GridLayout(2,1));
        setSize(300,300);
        GlucoseInput gi = new GlucoseInput();
        SimplePanel.add(gi);
        SimplePanel.add(enter);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleMethod SM = new SimpleMethod( date, gi.gettext());

                //Add code FOR SENDING TO SERVER. (SEND SM- WHICH INCLUDES THE SIMPLE METHOD ENTRY FOR TODAY AND PUTS IT ON THE SERVER)
                gi.emptytext();
                setVisible(false);
            }
        });
        getContentPane().add(SimplePanel);



    }


}
