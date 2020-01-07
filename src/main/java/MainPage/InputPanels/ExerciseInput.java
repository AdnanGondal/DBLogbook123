package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ExerciseInput extends JPanel {
    protected JLabel nametext = new JLabel("Exercise Name: ");
    protected JFormattedTextField nameinput = new JFormattedTextField();
    protected JLabel starttext = new JLabel("Exercise Start Time: ");
    protected TimeSelector tstart = new TimeSelector();
    protected JLabel endtext = new JLabel("Exercise End Time: ");
    protected TimeSelector tend = new TimeSelector();

    public ExerciseInput(){
        setLayout(new GridLayout(3,1));
        setBackground(new Color(160,255, 150));
        nameinput.setValue( "e.g. Running");
        add(nametext);
        add(nameinput);
        add(starttext);
        add(tstart);
        add(endtext);
        add(tend);
    }

    public Date getStartTime(){return tstart.getUserTime();}
    public Date getEndTime(){return tend.getUserTime(); }
    public String getuiExName(){return (String) nameinput.getValue();}
    public void reset(){
        nameinput.setText("e.g. Running");
        tstart.reset();
        tend.reset();
    }


}
