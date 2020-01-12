package MainPage.Frames;

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
                //What happens when entered button is pressed.
                time = gi.getTime();

                Method sm = new SimpleMethod(); //See Method and SimpleMethod class.
                ((SimpleMethod) sm).setBgl(time,gi.getuiGlucose());

                //Next Three Lines: For demonstration Only: Print to console when enter button is pressed
                //to check everything gets stored in the class and is ready for the database .
                System.out.println("BGL: " +((SimpleMethod) sm).getBGL().getLevel());
                System.out.println("Date: " + ((SimpleMethod) sm).getDate());
                System.out.println("Time: "+((SimpleMethod) sm).getBGL().getTime());

                //ADD CODE FOR SENDING TO DATABASE HERE


                gi.reset();
                setVisible(false);

                }

        });
    }

    public GlucoseInput getGlucoseInput(){return gi;};

}
