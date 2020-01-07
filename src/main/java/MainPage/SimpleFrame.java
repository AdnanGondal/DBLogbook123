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
    //The Class codes the Frame for the Simple Method
    protected Date date=new Date();
    protected Date time;
    protected JCheckBox gicheck = new JCheckBox("Add Glucose?");
    protected JPanel Panel = new JPanel();
    protected JButton enter = new JButton("Enter");
    protected GlucoseInput gi = new GlucoseInput();
    protected JCheckBox TSCheck = new JCheckBox("Are you taking the reading now?");


    public SimpleFrame(){
        setTitle("New Simple Input");
        setSize(300,300);

        Panel.setLayout(new GridLayout(2,1));
        Panel.add(gi);
        Panel.add(enter);
        EnterButtonPressed();
        getContentPane().add(Panel).setBackground(new Color(156, 234, 228));

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

    public GlucoseInput getGlucoseInput(){return gi;};

}
