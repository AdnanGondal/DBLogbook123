package MainPage;

import MainPage.InputPanels.GlucoseInput;
import MainPage.Methods.Method;
import MainPage.Methods.SimpleMethod;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class SimpleFrame extends JFrame {
    Date date=new Date();
    Date time;
    JCheckBox gicheck = new JCheckBox("Add Glucose?");
    JPanel Panel = new JPanel();
    JButton enter = new JButton("Enter");
    GlucoseInput gi = new GlucoseInput();
    JCheckBox TSCheck = new JCheckBox("Are you taking the reading now?");


    public SimpleFrame(){
        Panel.setLayout(new GridLayout(3,1));
        setSize(300,300);
        Panel.add(gi);
        Panel.add(enter);
        EnterButtonPressed();
        getContentPane().add(Panel);

    }

    private void EnterButtonPressed() {
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = gi.getTime();
                Method sm = new SimpleMethod();
                ((SimpleMethod) sm).setBgl(time,gi.getuiGlucose());

                //Next Three Lines: For demonstration Only.
                System.out.println("BGL: " +((SimpleMethod) sm).getBGL().getLevel());
                System.out.println("Date: " + ((SimpleMethod) sm).getBGL().getDate());
                System.out.println("Time: "+((SimpleMethod) sm).getBGL().getTime());

                //Add code FOR SENDING TO SERVER. (SEND SM- WHICH INCLUDES THE SIMPLE METHOD ENTRY FOR TODAY AND PUTS IT ON THE SERVER)
                TSCheck.setSelected(true);
                gi.reset();
                setVisible(false);

                }

        });
    }

}
