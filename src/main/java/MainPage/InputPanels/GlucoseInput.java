package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

//Class that codes for the user glucose input Panel.
public class GlucoseInput extends JPanel {

    private JLabel timelabel = new JLabel("Please Enter the time of the reading.");
    private TimeSelector ts = new TimeSelector();
    private JLabel text = new JLabel("Please enter your blood glucose level (mmol/L): ");
    private JFormattedTextField uinput = new JFormattedTextField();


    public GlucoseInput(){

        setLayout(new GridLayout(4,1));
        setBackground(new Color(160,255, 150));
        uinput.setValue(new Double(0.00));
        add(timelabel);
        add(ts);
        add(text);
        add(uinput);

    }
    public double getuiGlucose(){return (double) uinput.getValue();}
    public Date getTime(){return ts.getUserTime();}
    public void reset(){
        //set text field empty and time selector to current time.
        uinput.setText("");
        ts.reset();
    }

}
